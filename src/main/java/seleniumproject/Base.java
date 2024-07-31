package seleniumproject;
class Base {
public static void main(String[] args) {
int num =3, i, flag=0;
//Prime number is one that is not divisible by the numbers starting from "2" to half of that number
//example: For 10: it is prime if it is not divisible by the numbers: 2,3,4,5 where 5 is half of 10
for(i=2; i<num/2; i++){
if(num%i==0){
System.out.println("The given number is not prime");
flag=1;
break;
}
}
if(flag==0)
System.out.println("The given number is prime");
}
}