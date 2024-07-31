package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/");
		
		
		d.findElement(By.linkText("Drag and Drop")).click();
		
		
		WebElement src = d.findElement(By.xpath("//*[@id=\"column-a\"]"));
		
		WebElement target = d.findElement(By.xpath("//*[@id=\"column-b\"]"));
		
	 Actions action = new Actions(d);
	 

	 
		Thread.sleep(3000);
		//action.clickAndHold(src).moveToElement(target).perform();		
		
//action.dragAndDrop(src, target).perform();

		
		
		
		




d.quit();
}

}
