package sampleProgram1;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To reverse character 
		String str1="Im Vinitha";
		str1.toUpperCase();
		System.out.println(str1);
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		//Another method to reverse character
		char[] y=str1.toCharArray();
		for(int i=y.length-1;i>=0;i--) {
			
			System.out.print(y[i]);
		}
		System.out.println();
		
		//To Reverse String words
		String[] x= str1.split(" ");
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		String str2="Deepthi"; // string immutable
		str2.toUpperCase();
		System.out.println(str2);
		System.out.println(str2.toUpperCase());
		
		StringBuffer st= new StringBuffer("Vinitha");// String immutable, String buffer mutable
		st.reverse();
		
		System.out.println(st);


	}

}
