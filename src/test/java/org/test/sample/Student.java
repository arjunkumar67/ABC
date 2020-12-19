package org.test.sample;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Student {
	@BeforeClass
	public static void subject1() {
		System.out.println("BeforeClass Exam");
	}
	@Before
	public  void subject2() {
		System.out.println("BeforeMethod----science");
	}
	@Test
	public void subject3() {
		System.out.println("Test--Exam----Subject3");
		
	}
	@Ignore
	@Test
	public void subject10() {
		System.out.println("Ignore method");
	}
	@Test
	public void god() {
		System.out.println("Before Assert");
		assertTrue("verifying assert", true);
		System.out.println("After Assert");
	}
	
	@After
	public void subject4() {
		System.out.println("AfterMethod--- -social");
	}
	@AfterClass
	public static void subject5() {
		System.out.println("AfterClass exam");
	}

}
