
package com.aa.cqe.flight.pojo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "hiLvl",
    "loLvl",
    "faaPref",
    "reclear",
    "NRP",
    "international",
    "fuelFerry",
    "supplemental",
    "shortSeg",
    "CDR",
    "owAcftRqd",
    "HAR",
    "omegaAcftRqd",
    "pToP",
    "noS80",
    "fmcTxtAvail",
    "eraTxtAvail",
    "posblATCTxtErr",
    "playbook"
})
public class RouteInd {

    @JsonProperty("hiLvl")
    private Boolean hiLvl;
    @JsonProperty("loLvl")
    private Boolean loLvl;
    @JsonProperty("faaPref")
    private Boolean faaPref;
    @JsonProperty("reclear")
    private String reclear;
    @JsonProperty("NRP")
    private Boolean nRP;
    @JsonProperty("international")
    private Boolean international;
    @JsonProperty("fuelFerry")
    private Boolean fuelFerry;
    @JsonProperty("supplemental")
    private Boolean supplemental;
    @JsonProperty("shortSeg")
    private Boolean shortSeg;
    @JsonProperty("CDR")
    private Boolean cDR;
    @JsonProperty("owAcftRqd")
    private Boolean owAcftRqd;
    @JsonProperty("HAR")
    private Boolean hAR;
    @JsonProperty("omegaAcftRqd")
    private Boolean omegaAcftRqd;
    @JsonProperty("pToP")
    private Boolean pToP;
    @JsonProperty("noS80")
    private Boolean noS80;
    @JsonProperty("fmcTxtAvail")
    private Boolean fmcTxtAvail;
    @JsonProperty("eraTxtAvail")
    private Boolean eraTxtAvail;
    @JsonProperty("posblATCTxtErr")
    private Boolean posblATCTxtErr;
    @JsonProperty("playbook")
    private Boolean playbook;

    /**
     * 
     * @return
     *     The hiLvl
     */
    @JsonProperty("hiLvl")
    public Boolean getHiLvl() {
        return hiLvl;
    }

    /**
     * 
     * @param hiLvl
     *     The hiLvl
     */
    @JsonProperty("hiLvl")
    public void setHiLvl(Boolean hiLvl) {
        this.hiLvl = hiLvl;
    }

    /**
     * 
     * @return
     *     The loLvl
     */
    @JsonProperty("loLvl")
    public Boolean getLoLvl() {
        return loLvl;
    }

    /**
     * 
     * @param loLvl
     *     The loLvl
     */
    @JsonProperty("loLvl")
    public void setLoLvl(Boolean loLvl) {
        this.loLvl = loLvl;
    }

    /**
     * 
     * @return
     *     The faaPref
     */
    @JsonProperty("faaPref")
    public Boolean getFaaPref() {
        return faaPref;
    }

    /**
     * 
     * @param faaPref
     *     The faaPref
     */
    @JsonProperty("faaPref")
    public void setFaaPref(Boolean faaPref) {
        this.faaPref = faaPref;
    }

    /**
     * 
     * @return
     *     The reclear
     */
    @JsonProperty("reclear")
    public String getReclear() {
        return reclear;
    }

    /**
     * 
     * @param reclear
     *     The reclear
     */
    @JsonProperty("reclear")
    public void setReclear(String reclear) {
        this.reclear = reclear;
    }

    /**
     * 
     * @return
     *     The nRP
     */
    @JsonProperty("NRP")
    public Boolean getNRP() {
        return nRP;
    }

    /**
     * 
     * @param nRP
     *     The NRP
     */
    @JsonProperty("NRP")
    public void setNRP(Boolean nRP) {
        this.nRP = nRP;
    }

    /**
     * 
     * @return
     *     The international
     */
    @JsonProperty("international")
    public Boolean getInternational() {
        return international;
    }

    /**
     * 
     * @param international
     *     The international
     */
    @JsonProperty("international")
    public void setInternational(Boolean international) {
        this.international = international;
    }

    /**
     * 
     * @return
     *     The fuelFerry
     */
    @JsonProperty("fuelFerry")
    public Boolean getFuelFerry() {
        return fuelFerry;
    }

    /**
     * 
     * @param fuelFerry
     *     The fuelFerry
     */
    @JsonProperty("fuelFerry")
    public void setFuelFerry(Boolean fuelFerry) {
        this.fuelFerry = fuelFerry;
    }

    /**
     * 
     * @return
     *     The supplemental
     */
    @JsonProperty("supplemental")
    public Boolean getSupplemental() {
        return supplemental;
    }

    /**
     * 
     * @param supplemental
     *     The supplemental
     */
    @JsonProperty("supplemental")
    public void setSupplemental(Boolean supplemental) {
        this.supplemental = supplemental;
    }

    /**
     * 
     * @return
     *     The shortSeg
     */
    @JsonProperty("shortSeg")
    public Boolean getShortSeg() {
        return shortSeg;
    }

    /**
     * 
     * @param shortSeg
     *     The shortSeg
     */
    @JsonProperty("shortSeg")
    public void setShortSeg(Boolean shortSeg) {
        this.shortSeg = shortSeg;
    }

    /**
     * 
     * @return
     *     The cDR
     */
    @JsonProperty("CDR")
    public Boolean getCDR() {
        return cDR;
    }

    /**
     * 
     * @param cDR
     *     The CDR
     */
    @JsonProperty("CDR")
    public void setCDR(Boolean cDR) {
        this.cDR = cDR;
    }

    /**
     * 
     * @return
     *     The owAcftRqd
     */
    @JsonProperty("owAcftRqd")
    public Boolean getOwAcftRqd() {
        return owAcftRqd;
    }

    /**
     * 
     * @param owAcftRqd
     *     The owAcftRqd
     */
    @JsonProperty("owAcftRqd")
    public void setOwAcftRqd(Boolean owAcftRqd) {
        this.owAcftRqd = owAcftRqd;
    }

    /**
     * 
     * @return
     *     The hAR
     */
    @JsonProperty("HAR")
    public Boolean getHAR() {
        return hAR;
    }

    /**
     * 
     * @param hAR
     *     The HAR
     */
    @JsonProperty("HAR")
    public void setHAR(Boolean hAR) {
        this.hAR = hAR;
    }

    /**
     * 
     * @return
     *     The omegaAcftRqd
     */
    @JsonProperty("omegaAcftRqd")
    public Boolean getOmegaAcftRqd() {
        return omegaAcftRqd;
    }

    /**
     * 
     * @param omegaAcftRqd
     *     The omegaAcftRqd
     */
    @JsonProperty("omegaAcftRqd")
    public void setOmegaAcftRqd(Boolean omegaAcftRqd) {
        this.omegaAcftRqd = omegaAcftRqd;
    }

    /**
     * 
     * @return
     *     The pToP
     */
    @JsonProperty("pToP")
    public Boolean getPToP() {
        return pToP;
    }

    /**
     * 
     * @param pToP
     *     The pToP
     */
    @JsonProperty("pToP")
    public void setPToP(Boolean pToP) {
        this.pToP = pToP;
    }

    /**
     * 
     * @return
     *     The noS80
     */
    @JsonProperty("noS80")
    public Boolean getNoS80() {
        return noS80;
    }

    /**
     * 
     * @param noS80
     *     The noS80
     */
    @JsonProperty("noS80")
    public void setNoS80(Boolean noS80) {
        this.noS80 = noS80;
    }

    /**
     * 
     * @return
     *     The fmcTxtAvail
     */
    @JsonProperty("fmcTxtAvail")
    public Boolean getFmcTxtAvail() {
        return fmcTxtAvail;
    }

    /**
     * 
     * @param fmcTxtAvail
     *     The fmcTxtAvail
     */
    @JsonProperty("fmcTxtAvail")
    public void setFmcTxtAvail(Boolean fmcTxtAvail) {
        this.fmcTxtAvail = fmcTxtAvail;
    }

    /**
     * 
     * @return
     *     The eraTxtAvail
     */
    @JsonProperty("eraTxtAvail")
    public Boolean getEraTxtAvail() {
        return eraTxtAvail;
    }

    /**
     * 
     * @param eraTxtAvail
     *     The eraTxtAvail
     */
    @JsonProperty("eraTxtAvail")
    public void setEraTxtAvail(Boolean eraTxtAvail) {
        this.eraTxtAvail = eraTxtAvail;
    }

    /**
     * 
     * @return
     *     The posblATCTxtErr
     */
    @JsonProperty("posblATCTxtErr")
    public Boolean getPosblATCTxtErr() {
        return posblATCTxtErr;
    }

    /**
     * 
     * @param posblATCTxtErr
     *     The posblATCTxtErr
     */
    @JsonProperty("posblATCTxtErr")
    public void setPosblATCTxtErr(Boolean posblATCTxtErr) {
        this.posblATCTxtErr = posblATCTxtErr;
    }

    /**
     * 
     * @return
     *     The playbook
     */
    @JsonProperty("playbook")
    public Boolean getPlaybook() {
        return playbook;
    }

    /**
     * 
     * @param playbook
     *     The playbook
     */
    @JsonProperty("playbook")
    public void setPlaybook(Boolean playbook) {
        this.playbook = playbook;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hiLvl).append(loLvl).append(faaPref).append(reclear).append(nRP).append(international).append(fuelFerry).append(supplemental).append(shortSeg).append(cDR).append(owAcftRqd).append(hAR).append(omegaAcftRqd).append(pToP).append(noS80).append(fmcTxtAvail).append(eraTxtAvail).append(posblATCTxtErr).append(playbook).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteInd) == false) {
            return false;
        }
        RouteInd rhs = ((RouteInd) other);
        return new EqualsBuilder().append(hiLvl, rhs.hiLvl).append(loLvl, rhs.loLvl).append(faaPref, rhs.faaPref).append(reclear, rhs.reclear).append(nRP, rhs.nRP).append(international, rhs.international).append(fuelFerry, rhs.fuelFerry).append(supplemental, rhs.supplemental).append(shortSeg, rhs.shortSeg).append(cDR, rhs.cDR).append(owAcftRqd, rhs.owAcftRqd).append(hAR, rhs.hAR).append(omegaAcftRqd, rhs.omegaAcftRqd).append(pToP, rhs.pToP).append(noS80, rhs.noS80).append(fmcTxtAvail, rhs.fmcTxtAvail).append(eraTxtAvail, rhs.eraTxtAvail).append(posblATCTxtErr, rhs.posblATCTxtErr).append(playbook, rhs.playbook).isEquals();
    }

}
