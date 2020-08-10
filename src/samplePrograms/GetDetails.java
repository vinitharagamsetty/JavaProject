package samplePrograms;

import java.util.Scanner;

public class GetDetails {

	public static void main(String[] args) {
		Details obj = new Details();
		obj.getName();
		
		Scanner b1 = new Scanner(System.in);
		String companyName1=b1.next();
		obj.getCompanyName(companyName1);
		obj.getExperience();
		obj.getQualification();

	}

}
