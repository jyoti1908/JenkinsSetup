package seleniumproject;

import net.bytebuddy.description.type.TypeDefinition.SuperClassIterator;
import net.bytebuddy.implementation.bind.annotation.Super;

public class Subclass  extends ParentClass{

	
	
	
	String color="Red";
			int num=5;
			
			void color()
			{
				System.out.println(color);
			  System.out.println(super.color);
				
				
			}
	
	
	public static void main(String[] args)
	{
	
		
		
	   Subclass obj = new	Subclass();
		System.out.println(color);
		
	
	
	
}
}