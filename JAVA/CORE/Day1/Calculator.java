import java.util.*;
class Calculator{
	//this method is for Addition

	public static int addition(int a,int b){
	return a+b;
	}

	//this method is for subtraction

	public static int subtraction(int a,int b){
	return Math.abs(a-b);
	}
	
	//this method is for multiplication

	public static int multiplication(int a,int b){
	return a*b;
	}
	
	//this method is for Division

	public static int division(int a,int b){
	if(a<=0 || b<=0)return 0;
	return a/b;
	}

	public static void main(String []args){
	int a=40;
	int b=20;
	
	System.out.println("Addition :" + addition(a,b));
	System.out.println("Substraction :" + subtraction(a,b));
	System.out.println("Multiplicaton :" + multiplication(a,b));
	System.out.println("Division:" + division(a,b));

	}
}