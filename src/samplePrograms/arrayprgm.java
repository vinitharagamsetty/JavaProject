package samplePrograms;

import java.util.Scanner;

public class arrayprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		String[] name=new String[6];
		Scanner s=new Scanner(System.in);
		//name[0] =s.next();
				
		name[0]="vinitha";
		name[1]="deepthi";
		int[] name1 = {1,2};
		
		//System.out.println(name[0]);
		//for(i=0;i<name.length;i++)
		//{
			//System.out.println(name[i]);
		//}
		for(String x:name)
		{
			System.out.println(x);
		}
	}

}
