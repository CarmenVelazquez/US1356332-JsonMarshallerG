#!/usr/bin/env groovy

// Build for DEFAULT build in repo

//  Variety: application with NO config
//  Features:
//      WAR, EAR or executable JAR (e.g. Spring Boot)
//      Nexus stage for publishing - ci-builds or dev-releases repo
//      Publish info.yaml file
//      Tags when build is in master branch and is not a snapshot

// How to use this template. Things to fill in (simplest cases, global search for 'fill-in')
//  1) GitHub repo URL without .git on the end
//  2) Display name to describe build results
//  3) If this is a Spring Boot app with <executable>true</executable> in the pom,
//      uncomment 'sh' line
//  4) Modify mvn calls for app. (maven called via singleJob())
//      1 or 2 calls.
//      proper command line.
//  5) Uncomment code for source jar if needed
//  6) Update the email list with minimum one space delimited emails to receive notifications

// Additionally many other bits of code can be customized. Only do this if really needed so
//  you can take advantage of improvements to this template

import groovy.transform.Field
import com.aa.jenkins.pipeline.ArtifactModel
import com.aa.jenkins.pipeline.AdditionalArtifactModel
import hudson.AbortException

@Field final String gitRepoUrl = 'https://ghe.aa.com/aot-foct/CQE_JsonUnMarshaller'
@Field final String gitRepoDisplayName = 'CQE_JsonUnMarshaller'

properties properties: [
        pipelineTriggers([[$class: 'GitHubPushTrigger']]),
        disableConcurrentBuilds(),
        [$class: 'GithubProjectProperty', displayName: gitRepoDisplayName, projectUrlStr: gitRepoUrl],
        buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')),
]

notify = new com.aa.jenkins.pipeline.notify()
structure = new com.aa.jenkins.pipeline.structure()
report = new com.aa.jenkins.pipeline.report()
nexus = new com.aa.jenkins.pipeline.nexus()
//deploy = new com.aa.jenkins.pipeline.deploy()

//@Field final String deployableArtifactFolder = ''
@Field final String pomFilename = 'pom.xml'
@Field final String nexusInstanceId = 'enterprise-artifactory'
@Field final String environmentName = 'dev'
@Field final String skipEverything = '-Dmaven.test.skip=true -Dsonar.skip=true -Dcheckstyle.skip=true -Dpmd.skip=true -Djacoco.skip -Dmaven.gitcommitid.skip=true -Dcodegen.skip=true -Dspring-boot.skip=true '
@Field final String settingsFilePath = ''

@Field String branch = null
Map<String, Object> stageReportParams
ArtifactModel artifactModel
List<AdditionalArtifactModel> additionalFileList

@Field String emailList = 'fill-in@aa.com' // space delimited list, one entry required
@Field String gitCreds = 'GHE-GitHub-CICD-Z1059754'

@Field String stageName
timestamps {
    node('linux') {
        stageName = 'build'
        stage(stageName) {
//            sh 'pwd ; ls -al ; env | sort' // debug

            branch = structure.gitBranch()
//            branch = structure.gitBranchFromScm(scm)
            echo "branch=${branch}"

            notify.notifySlack("START")

            if (env.EMAIL_LIST) {
                emailList = env.EMAIL_LIST
            }

            if (env.GIT_USER) {
                gitCreds = env.GIT_USER
            }

            structure.withNotification(to: emailList, includeDevelopers: true, includeCulprits: true, stageName: stageName) {
                checkout scm

                stageReportParams = report.stageCompleted(stageName: "git", branch: branch,  pomFilename: /* withTrailingSlash(deployableArtifactFolder) + */ pomFilename, gitRepoUrl: gitRepoUrl)

                // configure settings.xml to be used for this build, prepare artifact model for publish to Nexus
                withCredentials([usernamePassword(credentialsId: 'CICD-Enterprise-Nexus3-Deployer', passwordVariable: 'NEXUS_PASSWORD', usernameVariable: 'NEXUS_USER')]) {
                    loadSettingsXml(user: NEXUS_USER, password: NEXUS_PASSWORD, useEnterpriseNexus: true)
                    settingsFilePath = "${env.WORKSPACE}/.settings.xml"
                }
                artifactModel = nexus.readArtifactModel(
                        /* withTrailingSlash(deployableArtifactFolder) + */ pomFilename)
                artifactModel.defaultFilePath(/* deployableArtifactFolder */)
                artifactModel.defaultNexusRepository(environmentName)
//                artifactModel.packaging = 'sh' // for spring boot executable jar/war

                // Actual build done by maven
// For multi-module maven build
//                singleJob(stageName, '-N clean install' +
//                        " ${skipEverything} -Dbuild.number=\"${artifactModel.buildNumber}\" -Drevision=\"${artifactModel.revision}\"",
//                        '')
// end multi-module maven bujild
                singleJob(stageName,
                        'clean dependency:analyze-report project-info-reports:dependency-convergence -U' +
                                " ${skipEverything} -Dbuild.number=\"${artifactModel.buildNumber}\" -Drevision=\"${artifactModel.revision}\"",
                        '')
                String analysisReportFile = 'target/dependency-analysis.html'
                if (fileExists(analysisReportFile)) {
                    structure.archiveFile(analysisReportFile)
                }
                analysisReportFile = 'target/site/dependency-convergence.html'
                if (fileExists(analysisReportFile)) {
                    structure.archiveFile(analysisReportFile)
                    structure.archiveFile('target/site/css/**/*')
                }

                singleJob(stageName,
                        "package -U -Dsonar.skip=true -Dbuild.number=\"${artifactModel.buildNumber}\" -Drevision=\"${artifactModel.revision}\"",
                        "sonar:sonar -Dbuild.number=\"${artifactModel.buildNumber}\" -Drevision=\"${artifactModel.revision}\"")

                // Build info.yaml
                additionalFileList = structure.prepareInfoFile(artifactModel, nexusInstanceId, /* ['source-jar'] */)

                report.stageCompleted(stageName: "build", params: stageReportParams)
                if (structure.isMasterBranch()) {
                    report.stageCompleted(stageName: "sonarScan", params: stageReportParams)
                }
            }
        }

        stageName = 'nexus'
        stage(stageName) {
            sh 'ls -al' // debug

            structure.withNotification(to: emailList, includeCulprits: true, stageName: stageName) {
                echo "artifactModel: $artifactModel," +
                        " pomFilename: $pomFilename," +
                        " nexusInstanceId: $nexusInstanceId," +
                        " settingsFilePath: $settingsFilePath"

                nexus.publishDeployableWithMvn(artifactModel, pomFilename, nexusInstanceId, null, settingsFilePath, null, additionalFileList)

                report.stageCompleted(stageName: "nexus", params: stageReportParams)
            }
        }

        stageName = 'tagging'
        stage(stageName) {
            structure.withNotification(to: emailList, stageName: stageName) {
                def versionNumber = artifactModel.version
                if (structure.isMasterBranch() && !structure.isSnapshot(versionNumber)) {
                    structure.createAndPushTag(versionNumber, 'build', gitCreds, false)

                    report.stageCompleted(stageName: "tagging", params: stageReportParams)
                } else if (structure.isSnapshot(versionNumber)) {
                    echo "Not tagged for SNAPSHOT version: ${versionNumber}"
                } else {
                    echo "Not tagged in non-master branch: ${branch}"
                }
            }
        }

        stageName = 'notifications'
        stage(stageName) {
            report.buildCompleted(stageReportParams, currentBuild.startTimeInMillis, System.currentTimeMillis(), true)

            String currentBuildResult = "${currentBuild.result ?: 'SUCCESS'}"
            echo "${currentBuildResult} : Job '${env.JOB_NAME} [${env.BUILD_NUMBER} ${branch}]'"
            notify.notifyWithCurrentBuildResult([to: emailList, includeDevelopers: true], currentBuildResult)
        }
    }
}

// ---------------------------------------------------------------------------------------------------------

def singleJob(String job, String targets, String sonarTargets) {
    if (!targets) {
        targets = 'clean install'
    }

    echo "Begin " + job
    structure.withMavenAndJava(java: 'java8', maven: 'apache-maven-3.3.9', mavenSettingsFilePath: settingsFilePath) {
        sh('mvn --batch-mode ' + targets)
        if (structure.isMasterBranch() && sonarTargets) {
            withSonarQubeEnv('CICD') {
                try {
                    sh 'mvn --batch-mode ' + sonarTargets
                } catch (AbortException e) {
                    println "WARNING: build status UNSTABLE due to error executing SonarQube scan: ${e.message}"
                    currentBuild.result = 'UNSTABLE' // do not fail build
                }
            }
        }
    }
}

private String withTrailingSlash(String path) {
    path + (path ? '/' : '')
}
