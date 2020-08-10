package prgrmConstructor;

import java.util.Scanner;

public class pgReturnDTMain {

	public static void main(String[] args) {
		
		pgReturnDT1 obj=new pgReturnDT1(10,5);
		int s= obj.addition();
		System.out.println(s);
		
		int p=obj.subtraction();
		System.out.println(p);
		
		int mult=obj.multiplication(s, p);
		System.out.println(mult);
		
		System.out.println("Enter String to print: ");
		Scanner nam=new Scanner(System.in);
		String nam1= nam.next();
		
		String val=obj.name(nam1);
		System.out.println(val);
		
		
		

	}

}
