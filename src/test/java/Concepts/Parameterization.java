package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
WebDriver driver;
	
@Parameters({"browser"})
@Test(priority = 1)
public void launchUzRl(String browser)
{
	if(browser.equals("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println(Thread.currentThread().getId());
		
	}else if (browser.equals("edgedriver")
)			{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
		driver.get("https://www.freecrm.com/");
			}
	
	
	
	
	@Parameters({"username","password"})
	@Test(priority = 2)
	public void LoginTest(String username, String password)
	{
		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println(Thread.currentThread().getId());
	}
	
}



