package com.aa.cqe.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class CQETrackingIDCreationTest {

	@Test
	public void gernerateTrackingIDTest() throws ParseException {
		String uniqueID1 = CQETrackingIDCreation.gernerateTrackingID(Calendar.getInstance().getTime(), 11, 0l);
		String uniqueID2 = CQETrackingIDCreation.gernerateTrackingID(new Date(), 11, 33l);
		assertEquals(21, uniqueID1.length());
		assertEquals(21, uniqueID2.length());
		assertNotEquals(uniqueID1, uniqueID2);
	}
	@Test
	public void gernerateTrackingIDWithEmployeeTest() throws InterruptedException {
		String uniqueID1 = CQETrackingIDCreation.gernerateTrackingID(Calendar.getInstance().getTime(), 11, 0l);
		Thread.sleep(1l);
		String uniqueID2 = CQETrackingIDCreation.gernerateTrackingID(new Date(), 11, 0l);
		String uniqueIDwithEmp1 = CQETrackingIDCreation.gernerateTrackingIDWithEmployee(uniqueID1, "23");
		String uniqueIDwithEmp2 = CQETrackingIDCreation.gernerateTrackingIDWithEmployee(uniqueID2, "23");
		assertEquals(27,uniqueIDwithEmp1.length());
		assertEquals(27,uniqueIDwithEmp2.length());
		assertNotEquals(uniqueIDwithEmp1, uniqueIDwithEmp2);
		
	}
	@Test
	public void gernerateTrackingIDWithRuleIDTest() throws InterruptedException {
		String uniqueID1 = CQETrackingIDCreation.gernerateTrackingID(Calendar.getInstance().getTime(), 11, 0l);
		Thread.sleep(1l);
		String uniqueID2 = CQETrackingIDCreation.gernerateTrackingID(new Date(), 11, 0l);
		String uniqueIDwithEmp1 = CQETrackingIDCreation.gernerateTrackingIDWithEmployee(uniqueID1, "23");
		String uniqueIDwithEmp2 = CQETrackingIDCreation.gernerateTrackingIDWithEmployee(uniqueID2, "23");
		String uniqueIDwithRule1 = CQETrackingIDCreation.generateTrackingIDWithRule(uniqueIDwithEmp1, 3);
		String uniqueIDwithRule2 = CQETrackingIDCreation.generateTrackingIDWithRule(uniqueIDwithEmp2, 13);
		assertEquals(29,uniqueIDwithRule1.length());	
		assertEquals(29,uniqueIDwithRule1.length());
		assertNotEquals(uniqueIDwithRule1, uniqueIDwithRule2);
		
	}
}
