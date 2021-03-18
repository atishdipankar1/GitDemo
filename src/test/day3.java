package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test(dataProvider="getData")
	public void WebloginCarloan(String one, String two) {
		System.out.println("WebloginCarloan");
		System.out.println(one);
		System.out.println(two);
	}
	
	@Test
	public void MobileloginCarloan() {
		System.out.println("MobileloginCarloan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileSignIn() {
		System.out.println("MobileSignIn");
	}
	
	@Test
	public void MobileSignOut() {
		System.out.println("MobileSignOut");
	}
	
	@Test//(dependsOnMethods = "WebloginCarloan")
	public void LoginAPICarloan() {
		System.out.println("LoginAPICarloan");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "first1";
		data[0][1] = "first2";
		
		data[1][0] = "second1";
		data[1][1] = "second2";
		
		data[2][0] = "third1";
		data[2][1] = "third2";
		
		return data;
	}
}
