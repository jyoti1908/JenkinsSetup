package Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		
		ChromeDriver d= new ChromeDriver();
	
		
		d.get("https://the-internet.herokuapp.com/");
		
	
		
		d.findElement(By.linkText("Frames")).click();
		
		
		d.findElement(By.linkText("iFrame")).click();
		Thread.sleep(5000);
		
		
		d.switchTo().frame(0);
		Thread.sleep(5000);
		
		
		
		d.switchTo().defaultContent();
		
		
		
		Thread.sleep(5000);
		
	
		d.findElement(By.xpath("/html/body/div[1]")).sendKeys(Keys.CONTROL + "t");
		
		//d.quit();
	}

}
