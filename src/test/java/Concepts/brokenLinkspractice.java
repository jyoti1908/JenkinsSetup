package Concepts;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinkspractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.opencart.com/");
	
		
		List<WebElement> links= driver.findElements(By.xpath("a"));
		int broken = 0, notBroken=0;
		for(WebElement link:links)
		{
			
			String eachlink=link.getAttribute("href");
			
			try {
		
			URL url=new URL(eachlink);
			
			HttpURLConnection connect=(HttpURLConnection)url.openConnection();
			
		int respcode = connect.getResponseCode();
		if (respcode==200)
		{
			notBroken++;
		}
		else
		{
			broken++;
		}}
		
		catch (Exception e) 
		{
		System.out.println("Link is broken2:");
		broken++;
		
			}
		
		
		
			}}}
		
		
			