package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void ploan() {
		
		System.out.println("ploan");
	}
	
	@BeforeTest(groups= {"Smoke"})
	public void bf() {
		System.out.println("Before Test");
		//Assert.assertTrue(false);
	}

}
