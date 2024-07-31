package Concepts;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

	@BeforeSuite
	public void BeforeSuit()
	{
		
		
	}
	
	
	
@Test
public void Display()
{
	Assert.assertEquals("jyoti", "jyoti");
}
	
	
	
@AfterSuite
public void AfterSuite()
{
	
	
}

@BeforeTest
public void BeforeTest()
{
	
	
}

@org.testng.annotations.AfterTest
public void AfterTest()
{
	
	
}


	
	
	
	

}
