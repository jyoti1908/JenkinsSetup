package seleniumproject;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElemenytsinARRAY {

	public static void main(String[] args) {
		
		String name[]= {"jyoti","shubham","sneha","shweta","shubham","shweta"};
		
		/*for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				
				if(name[i].equals(name[j]))
				{
					System.out.println(name[i]);
				}
				
			}			
		}*/
		
		Set<String> allnames = new HashSet<String>();
		
		for(String eachname:name)
		{
			if(allnames.add(eachname)==false)
					{
				System.out.println(eachname);
					}
		}	
		
		
	}

}
