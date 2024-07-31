package seleniumproject;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		int[]  num= {1,2,5,7,9,8,4,3,2,2};
		
		
		System.out.println("even numbers are");
		
		for (   int values:num  )
		{
			if(  values%2 == 0  )
				System.out.println(values);
		}
		
		
System.out.println("odd numbers are");
		
		
		for (int i=0;i<num.length;i++)
		{
		if( num[i]%2!=0 )
	
			System.out.println(num[i]);
		}
		

	}

}
