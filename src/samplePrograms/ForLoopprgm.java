package samplePrograms;

public class ForLoopprgm {

	public static void main(String[] args) {
		
		System.out.println("1 to 10 values");
		
		/*
		 * for(int a=1;a<=10;a++) { if(a==5) { System.out.println(a); } }
		 */
//		for(int b=10;b>=1;b--)
//		{	
	
//			System.out.println(b);
//		}
		
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.println( i+" "+j);				
			}
		}
		
		int w=2;
		
		switch(w)
		{
		case 1: System.out.println("md");
		break;
		case 2:
		{
			System.out.println("td");
			break;
		}
		case 3: System.out.println("wd"); 
		default : System.out.println("invalid");
		}
		
		/*char x='a';
		switch(x)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o': 
		case 'u': System.out.println("vowel");
		break;
		default: System.out.println("Consonant");
		}*/
	}

}
