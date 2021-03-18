package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		
		System.out.println("Hello TestNG");
		Assert.assertTrue(false);
	}
	
	@Test
	public void secondTest() {
		System.out.println("second test");
		
	}
	
	@AfterTest
	public void at() {
		System.out.println("After Test");
	}

}
