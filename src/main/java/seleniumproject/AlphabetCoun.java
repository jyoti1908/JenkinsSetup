package seleniumproject;

import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class AlphabetCoun extends Palindrome {
	
	
	static int alphabetcount=0;
static int sm=3;

	public static void main(String[] args)
	{
	
		AlphabetCoun ac= new AlphabetCoun();
		ac.display();
		

	String name="Jyoti pathare @120";

	char[] Char=name.toCharArray();


	for (int i=0;i<name.length();i++)
	{
	Boolean answer=  Character.isAlphabetic(Char[i]);
	if(answer==true)
	{
	alphabetcount++;
	}
	}
	
	System.out.println(alphabetcount);
	}
	

	
	
	
	
	
	
	
}








