package samplePrograms;

import java.util.Scanner;

public class JavaStar {

	public static void main(String[] args) {
		int i,j;
		//String a="JAVA";
		Scanner x= new Scanner(System.in);
		String y=x.next();
		char[] b= y.toCharArray();
		for(i=0;i<=y.length()-1;i++) 
		{
			for(j=0;j<=i;j++)
			{
				
				System.out.print(b[j]);
			}
			System.out.println();
		}
		

	}

}
