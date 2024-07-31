package seleniumproject;

public class Swap2numbers {

	public static void main(String[] args) {
		
		
	int num1=2;
	int num2=5;
	
	System.out.println("Before Swapping");
		System.out.println("num1-"  +num1);
		System.out.println("num2-"  +num2);
		
		
		
		
		
		num1=num1+num2;   //7
		
		num2=num1-num2;   //2
		num1=num1-num2;  //5
		
		
		System.out.println("After Swapping");
		System.out.println("num1-"  +num1);
		System.out.println("num2-"  +num2);
		
		
	}

}
