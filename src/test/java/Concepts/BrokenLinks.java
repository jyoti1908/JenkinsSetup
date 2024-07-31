package Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		ChromeDriver d= new ChromeDriver();
		d.get("https://amazon.in/");
		List<WebElement> lists  = d.findElements(By.tagName("a"));
		
		System.out.println(lists.size());
		
		
		for ( int i=0;i<lists.size();i++ )
		{
			
			System.out.println(lists.get(i).getText());
		}

	}

}
