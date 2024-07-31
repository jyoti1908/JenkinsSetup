package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilities {

public static void main(String[] args)

{
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("Browser", "ChromeDriver");

dc.setAcceptInsecureCerts(true);
	
	WebDriver driver = new ChromeDriver();

			driver.get("http://cacert.com/");
	
	
	
}
	
	
}
