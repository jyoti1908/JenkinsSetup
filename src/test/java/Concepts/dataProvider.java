package Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	
	
	
	@DataProvider(name="logindata")
	public Object[][] getdatafromDataProvider(){
		
	return new Object[][]
	{
		
		{"user1","password1"},
		{"user2","password2"}
		
	};
	}
	
	
	
	@Test(dataProvider = "logindata")
	public void loginmethod(String username,String password)
	{
		System.out.println(username   +password);
	}
	
	
	
	
}
