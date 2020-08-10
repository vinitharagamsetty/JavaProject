package samplePrograms;

import java.util.Scanner;

import sampleProgram1.Class1;

public class GetCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		Class1 obj1=new Class1();
		obj1.division(10, 2);
		obj1.module(10, 5);
		
		obj.addition(2, 1);
		System.out.println();
		obj.subtraction(4, 2);
		System.out.println();
		Scanner s=new Scanner(System.in);		
		System.out.println("Enter 2 values for multiplication/n a= ");
		int x=s.nextInt();
		System.out.println("b= ");
		obj.multiplication(x, s.nextInt());

	}

}
