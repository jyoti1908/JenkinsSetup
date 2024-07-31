package seleniumproject;

public class ReverseAchar {


		public static void main(String[] args)
	{

	String name="madam";
	String rev="";

	int len = name.length();
	System.out.println(len);

	for (int i=len-1;i>=0;i--)
	{
	rev=rev+name.charAt(i);

	}
	System.out.println(rev);
	if (rev.equals(name))
	{
		System.out.println("pelindrome");
	}
	else {
		
		System.out.println("not a pelindrome");
	}
	}
	}