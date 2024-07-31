package Concepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;

import net.bytebuddy.implementation.bytecode.Throw;

public class Properties {

	public static void main(String[] args) throws IOException {
		
		
		java.util.Properties prop= new java.util.Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\jyoti\\eclipse-workspace\\seleniumproject\\src\\test\\java\\config.properties");
		
		
	
prop.load(file);
		
		
System.out.println(prop.get("name"));
System.out.println(prop.get("surname"));
System.out.println(prop.get("age"));



	
		
	}

}
