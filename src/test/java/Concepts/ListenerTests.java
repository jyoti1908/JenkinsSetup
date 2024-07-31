package Concepts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTests {

	
	
	
	@Test(testName="jyoti", priority = 2)
	public  void listenerlearning ()

	{
		
			Assert.assertEquals("gyhu", "jhi")	;
		
	}
	
	
	
	@Test(dependsOnMethods ="listenerlearning",priority = 1)
	public  void listenerlearning2 ()

	{
		
			Assert.assertEquals("hh", "hh")	;
		
	}
	
	
}
