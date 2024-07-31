package Concepts;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptExecutor {

	
	public static void main(String [] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		/*driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/div/div[2]/div/div[3]")).click();
		
		driver.findElement(By.id("input-32")).sendKeys("mshaikh2");
		driver.findElement(By.id("input-35")).sendKeys("Iorta@2021");
		
		driver .findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/button/span")).click();*/
		
	
	
		driver.manage().window().maximize();
	
		
	List<WebElement> linksCount = driver.findElements(By.tagName("a"));
	
	int links=linksCount.size();
	System.out.println(links);
	
	
	
	
	
	for(WebElement alllinks:linksCount)
	{
		System.out.println(alllinks.getText());
	}
		
	
	
	
	
	
		
		driver.close();
		
		
		
		
		
		
	

		
		
	
			
	}



	
	
	
	
}
