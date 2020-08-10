package sampleProgram1;

import java.util.Scanner;

public class MethodOverload {

	public void addition(int a,int b) {
		System.out.println("Addition of 2 values is "+(a+b));
	}
	public void addition(int a,int b, int c) {
		System.out.println("Addition of 3 values is "+(a+b+c));
	}
	public void addition(double a,int b) {
		System.out.println("Addition of int and double "+(a+b));
	}
	 
	public static void main(String[] args) {
		MethodOverload obj=new MethodOverload();
		Scanner s = new Scanner(System.in);			
		//System.out.println("Enter 2 Values for addition ");	
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		double d=s.nextDouble();
		//System.out.println("Enter 2 Values for addition(float) ");
		//System.out.println("Addition of 2 values ");
		obj.addition(a, b);
		//System.out.println("Addition of 3 Values ");
		obj.addition(a,b,c);
		//System.out.println("Addition of int and float ");
		obj.addition(d, a);
	}
}
