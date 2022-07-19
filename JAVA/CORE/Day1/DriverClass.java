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
}
class DriverClass{
	static int a=40;
	static int b=20;

	public static void main(String []args){
	
	System.out.println("Addition :" + Calculator.addition(a,b));
	System.out.println("Substraction :" + Calculator.subtraction(a,b));
	System.out.println("Multiplicaton :" + Calculator.multiplication(a,b));
	System.out.println("Division:" + Calculator.division(a,b));

	}
}