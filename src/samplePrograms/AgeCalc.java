package samplePrograms;


public class AgeCalc {

	public static void main(String[] args) {
		// TODOAge Calculator
		
		//Scanner a = new Scanner(System.in);
		//int age1 = a.nextInt();
		
		int age=40;
		
		if(age>=30)
		{
			if(age>=1 && age<=18)
			{
				System.out.println("Output is child");
				
			}
			else if (age>=18 && age<=30)
			{
				System.out.println("Output is Adult");
			}
			else if(age>=31 && age<=50)
			{
				System.out.println("Output is seniour adult");
				
			}
			else
			{
				System.out.println("invalid");
			}
			//else if (age>=50 && age<=60)
			//{
				//System.out.println("Output is most seniour ");
			//}
			
				
			}
		
	}


	}

