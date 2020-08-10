package samplePrograms;

import java.util.Scanner;

public class employeeprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary,da,hra;
		System.out.println("Enter your salary =");
		Scanner s=new Scanner(System.in);
		
		salary = s.nextFloat();
		if(salary<25000)
		{
			da=(salary*10)/100;
			hra=(salary*15)/100;
			System.out.println("10% DA of salary "+salary+" is "+da);
			System.out.println("15% DA of salary "+salary+" is "+hra);			
		}
		if((salary>=25000)&&(salary<=40000))
		{
			da=(salary*15)/100;
			hra=(salary*20)/100;
			System.out.println("15% DA of salary "+salary+" is "+da);
			System.out.println("20% DA of salary "+salary+" is "+hra);			
		}
		if(salary>40000)
		{
			da=(salary*20)/100;
			hra=(salary*25)/100;
			System.out.println("20% DA of salary "+salary+" is "+da);
			System.out.println("25% DA of salary "+salary+" is "+hra);			
		}
	}

}
