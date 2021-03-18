package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebloginHomeloan() {
		System.out.println("WebloginHomeloan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeloan() {
		System.out.println("MobileloginHomeloan");
		Assert.assertTrue(false);
	}
	
	@Test
	public void LoginAPIHomeloan() {
		System.out.println("LoginAPIHomeloan");
	}
}
