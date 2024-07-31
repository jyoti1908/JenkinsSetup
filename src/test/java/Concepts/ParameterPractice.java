package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ParameterPractice {

	@org.testng.annotations.Parameters({"URL"})
	@Test
	public void Parameters(String url)
	{
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	
}
