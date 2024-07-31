package Concepts;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassWorkings {

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.navigate().to("https://www.qafox.com/selenium/selenium-practice/");
		
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(200,433);
	//System.out.println(d.getSize());
	driver.manage().window().setSize(d);
	Thread.sleep(4444);
	//int width=	d.getWidth();
	//int ht= d.getHeight();
		
		driver.findElement(By.xpath("//*[@id=\"post-481\"]/div/ul[2]/li[4]/a")).click();
		
		String parentHandle = driver.getWindowHandle();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for (String a:allhandles)
		{
			
			System.out.println(a);
			
			if(parentHandle.equals(a))
			{}
			else
			{
				driver.switchTo().window(a);
				Thread.sleep(2000);
				String url = driver.getCurrentUrl();
				System.out.println(url);
			}
			
		}
		 WebElement elem = driver.findElement(By.xpath("//*[@id=\"Carlist\"]"));
			
		  Thread.sleep(5000);
          Select s=new Select(elem);

          s.selectByIndex(2);
          Thread.sleep(5000);
          
         List<WebElement> allopts = s.getOptions();		
         
         for(int i=0;i<allopts.size();i++)
         {
        	 
        	 System.out.println(allopts.get(i).getText());
         }
	
	          
	           
	         
	           
	   		
	   driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[1]/input[10]")).sendKeys("C:\\Users\\jyoti\\Downloads\\jyotip.java");
	   
	   WebElement radiobutton = driver.findElement(By.id("radio1"));
	  boolean selected=radiobutton.isSelected();
	  System.out.println(selected);
	  
	  boolean displayed= radiobutton.isDisplayed();
	  System.out.println(displayed);
	  
	  
	  
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	
	File src = screenshot.getScreenshotAs(OutputType.FILE);

	File dest = new File("./Screenshots/shubh.png");
	
	FileUtils.copyFile(src, dest);
	
	  
	
	
	
	   
	}

	}
