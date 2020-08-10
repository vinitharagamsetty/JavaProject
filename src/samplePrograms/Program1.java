package samplePrograms;

public class Program1 {

	public static void main(String[] args) {
		//short EmpId = 1;
		/*System.out.println("Name: R Vinitha");
		System.out.println("Qualification: Bsc");
		System.out.println("Experience: 2 year 5 Months");
		System.out.println("Previous Company Name: Accenture Solutions Pvt Ltd");
		System.out.println("Present Company Name: Cognizant");
		System.out.println("Current City: Chennai");
		System.out.println("Domain: Testing");
		System.out.println("Certification: Nill");
		System.out.println("Known Languages: Telugu, English, Tamil");*/
	
		
		String str1="Im Vinitha";
		str1.toUpperCase();
		System.out.println(str1);
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			System.out.print(str1.charAt(i));
		}
		
	}
	

}
