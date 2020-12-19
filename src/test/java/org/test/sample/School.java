package org.test.sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class School {
	@Test
	public void allPeople() {
		System.out.println("ok----");
		Result rs = JUnitCore.runClasses(Teacher.class,Student.class);
		System.out.println("Run Count : "+rs.getRunCount());
		System.out.println("Failure Count : "+rs.getFailureCount());
		System.out.println("Ignore Count : "+rs.getIgnoreCount());
		System.out.println("Run Time : "+rs.getRunTime());
		System.out.println("was Successfull: "+rs.wasSuccessful());
		List<Failure> f = rs.getFailures();
		for (Failure failure : f) {
			System.out.println("Failure Message: "+failure.getMessage());
			
			
		}
	}

}
