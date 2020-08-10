package sampleProgram1;

public class StringDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To define string 2 days
		String str1="abc";
		String str2=new String("a");
		String a = str2.toLowerCase();
		System.out.println(a);
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		//like i++ str1 will remain same
		
		
		System.out.println(str1.equals(str2));//For value equals//output:True/False
		System.out.println(str1.equalsIgnoreCase(str2));// ignore case and compare values //output:True/False
		System.out.println(str1.compareTo(str2));//will take ASCII value n give results //0 or some other value
		System.out.println(str1.compareToIgnoreCase(str2));// will ignore cases n compare ASCII value		
		
		String str4="This is Selenium Class";
		System.out.println(str4.length());
		System.out.println(str4.substring(17));//to take one word from string give index 
		System.out.println(str4.substring(8,16));// From 8 and before 16
		System.out.println(str4.replace('s', 'S'));
		System.out.println(str4.replace("is", "IS"));
		System.out.println(str4.concat(" JAVA"));
		System.out.println(str4+" Java");
		System.out.println(str4.charAt(5));
		
		char[] x=str4.toCharArray();
		
		for(char y:x)
		{
			System.out.print(y + " ");
		}
		
		
		System.out.println();
		for(int i=str4.length()-1;i>=0;i--)
		{
			System.out.print(str4.charAt(i));// System.out.println(x[i]);
		}
		System.out.println();
		String[] r=str4.split(" ");
		//System.out.println();
		System.out.println(r[0]);
		for(int i=r.length-1;i>=0;i--)
		{
			System.out.print(r[i] + " ");
		}
		
	}

}
