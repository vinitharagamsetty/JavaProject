package samplePrograms;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
	
		System.out.println("value of x " +x);
		System.out.println("value of y "+y);
		
		String a="vinitha";
		String b="pallavi";
		String c="amma vini";
		a=a+b;
		
		System.out.println(a);
		System.out.println("a= "+a.substring(b.length()));
		System.out.println("b= "+a.substring(0,b.length()));		
		System.out.println(b.concat(" amma"));
		System.out.println(b.length());
		//System.out.println(c.split(" "));
		String[] v=c.split(" ");
		System.out.println(v[1]);
		
		
		
		
		
		
	}

}
