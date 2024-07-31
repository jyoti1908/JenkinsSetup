package Concepts;

import java.awt.Dimension;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	 //JavascriptExecutor js = JavascriptExecutor(driver);
		// js.executeScript(null, args)
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		//WebDriverManager.chromedriver().setup();
		
		
		
		driver.get("https://www.facebook.com/login");
		
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
	String handle=	driver.getWindowHandle();
	
	System.out.println("Parent window handle is---" +handle );
	
	
	
  Set<String> handles = driver.getWindowHandles();
  
  System.out.println(handles);
  
  driver.switchTo().window("41DB43FA2D1944E0EA8E13016EA1F950");	
	
	
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("hjm"))));

	
	
	driver.quit();
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	

}}
