package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Order {
	
	@Test(dataProvider = "getData")
	public void D(String username, String pswd)
	{
		System.out.println(username);
		System.out.println(pswd);
	}
	
	@Parameters({"URL"})
	//@Test(dependsOnMethods = "D")
	public void A(String url)
	{
		System.out.println("A");
		System.out.println(url);
	}

	@Test(enabled=false)
	public void B()
	{
		System.out.println("B");
	}
	
	@Test(timeOut = 400) //this will wait 400 before throwing any exception
	public void C()
	{
		System.out.println("C");
	}
	
	@DataProvider
	public Object getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		data [2][0] = "thirdusername";
		data [2][1] = "thirdpassword";
		
		return data;
	}

}
