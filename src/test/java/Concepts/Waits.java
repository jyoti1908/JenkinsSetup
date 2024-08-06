package Concepts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/");
		
		
		d.findElement(By.linkText("Drag and Drop")).click();
		
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		//explicit wait
		
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(null));
		
		//fluent wait --advance of explicit wait 
		
		Wait<WebDriver> waitfluent = new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(3))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		
		//waitfluent.until(ExpectedConditions.alertIsPresent);
		
		
		
		
	
		
		
		WebElement src = d.findElement(By.xpath("//*[@id=\"column-a\"]"));
		
		WebElement target = d.findElement(By.xpath("//*[@id=\"column-b\"]"));
		
	 Actions action = new Actions(d);
	 

	 
		Thread.sleep(3000);
	}

}
