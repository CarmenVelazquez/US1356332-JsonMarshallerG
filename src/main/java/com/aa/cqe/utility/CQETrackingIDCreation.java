package com.aa.cqe.utility;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class CQETrackingIDCreation {
	public static String gernerateTrackingID(Date eventDate, Integer partitionId, Long offset) {
		Long miliSeconds = eventDate.getTime();
		String partitionID =  StringUtils.leftPad(partitionId.toString(), 2, "0");
		String offSet = null;
		Integer lengthofOffset = offset.toString().length();
		if(lengthofOffset <=6)
			 offSet = StringUtils.leftPad(offset.toString(), 6, "0");
		else
			 offSet = offset.toString().substring(lengthofOffset-6, lengthofOffset); 
		
		StringBuilder uniqueIDBuilder = new StringBuilder(miliSeconds.toString());
		uniqueIDBuilder.append(partitionID).append(offSet);
		return uniqueIDBuilder.toString();
	}
	//UniqueID with offset and PartitionID
	public static String gernerateTrackingIDWithEmployee(String uniqueID, String empno) {
		String empNo = StringUtils.leftPad(empno, 6, "0");
		StringBuilder uniqueIDBuilder = new StringBuilder(uniqueID);
		uniqueIDBuilder.append(empNo);
		return uniqueIDBuilder.toString();
	}
	//UniqueID with empNumber
	public static String gernerateTrackingIDWithRule(String uniqueID, Integer ruleId) {
		StringBuilder uniqueIDBuilder = new StringBuilder(uniqueID);
		String ruleID = StringUtils.leftPad(ruleId.toString(), 2, "0");
		uniqueIDBuilder.append(ruleID);
		return uniqueIDBuilder.toString();
	}
}
