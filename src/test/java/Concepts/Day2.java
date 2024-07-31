package Concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {



	
	
	EdgeDriver d= new EdgeDriver();
	d.get("https://the-internet.herokuapp.com/");
	
	
	d.manage().window().maximize();
	
	
	
	
	d.findElement(By.linkText("JavaScript Alerts")).click();
	
	
   
	
	d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	
	
	Alert alert= d.switchTo().alert();
	
	
	String alerttext = alert.getText();
	
	System.out.println(alerttext);
	//alert.accept();
alert.dismiss();	
	Thread.sleep(3000);
	
	
	
	d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	
	Alert alert2=d.switchTo().alert();
	
	String text2=alert2.getText();
	
	System.out.println(text2);
	
alert2.sendKeys("i am jyoti pathare");
alert2.accept();
	Thread.sleep(3000);

	
	String title=d.getTitle();	
	
	System.out.println(title);
	
	d.quit();
	
	}

}
