package samplePrograms;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		//String v="add";
		System.out.println("Enter add, sub,mul,div,modu\n");
		Scanner s = new Scanner(System.in);
		String h = s.nextLine();
		
		int a=20,b=10,c,d,e,f,g;
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		//signup.lastnamefield();
		switch(h)
		{
		case "add": System.out.println("addition of a and b="+c);
		break;
		case "sub": System.out.println("addition of a and b="+d);
		break;
		case "mul": System.out.println("multiplication of a and b="+e);
		break;
		case "div": System.out.println("division of a and b="+f);
		break;
		case "modu": System.out.println("Module of a and b="+g);
		default: System.out.println("invalid entry");
		}
	}
		
	
			
}
