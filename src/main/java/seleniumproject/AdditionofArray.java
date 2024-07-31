package seleniumproject;

public class AdditionofArray {

	public static void main(String[] args) {
		
		 int a[]= {2,11,4,1,8};
		 
	int len = a.length;
	int  sum=0;
		
	//System.out.println(len);	
	
	
	for (int i=0;i<a.length;i++)
	{
		
	sum=a[i]+sum; 
	}

		System.out.println(sum);
	}

}
