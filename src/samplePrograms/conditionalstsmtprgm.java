package samplePrograms;

public class conditionalstsmtprgm {

	public static void main(String[] args) {
		int Mark=-1;
		
		if(Mark>=60)
		{
			if(Mark>=60 && Mark<=69)
			{
				System.out.println("Student Results: Grade C");
				
			}
			else if(Mark>=70 && Mark<=89)
			{
				System.out.println("Student Results : Grade B");
			}
			else if(Mark>=90 && Mark<=100)
			{
				System.out.println("Student Results: Grade A");
			}
			else
			{
				System.out.println("Invalid entry");
			}
				
		}
		else
		{
			System.out.println("Students Results: Fail");
		}
	}

}
