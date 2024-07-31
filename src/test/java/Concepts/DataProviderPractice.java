package Concepts;

import org.testng.annotations.Test;

public class DataProviderPractice {
	
	
	@Test(dataProvider = "dpmethod")
	public static void DataProvider()
	{
		
		System.out.println("username");
		
	}
	
	
	
	@org.testng.annotations.DataProvider(name="dpmethod")
	public Object[][] supplymethod()
	{
		
		Object [] [] data= {{"jyoti","123"},{"shubham","234"},{"shweta","345"}};
		return data ;
		
		
	}
	
	

}
