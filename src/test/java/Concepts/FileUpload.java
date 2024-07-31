package Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/");
		
		
		d.findElement(By.linkText("File Upload")).click();
		
		
		d.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\jyoti\\Downloads\\JyotiPathare-2 (1).pdf");
		
		
		
		d.findElement(By.xpath(" //input[@id=\"file-submit\"]")).click();
		
		
		d.navigate().back();
		d.navigate().back();
		
		d.findElement(By.linkText("Checkboxes")).click();
		
		
	WebElement	checkbox1= d.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	
	Boolean check1=checkbox1.isSelected();
	System.out.println(check1);
		
		
	WebElement	checkbox2= d.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	
	Boolean check2=checkbox2.isSelected();
	System.out.println(check2);
	
	checkbox2.click();
	
	Boolean check3=checkbox2.isSelected();
	System.out.println(check3);
	
	
	
	List<WebElement> allcheckboxedd = d.findElements(By.xpath("//form[@id='checkboxes']/input"));
	
	System.out.println(allcheckboxedd.size());
	
	
	/*for (int i=0;i<allcheckboxedd.size();i++)
	{
	 allcheckboxedd.get(i).click();	
	}*/
	
	
	
	
	
	
	for (  WebElement  check :allcheckboxedd  )
	{
		
		check.click();
	}
	
	
	
	

	
	
		
		
	
		Thread.sleep(3000);

	}

}
