package sampleProgram1;

public class MethodOverride extends MethodOverload {
	public static void main(String[] args) {
	//public void addition(int a,int b) {
		//System.out.println("Addition of 2 values is "+(a+b));
		
		String str1="Im Vinitha";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
				System.out.print(str1.charAt(i)+" ");
		}
				System.out.println();
		/////////////////////////////////////////
		char[] y=str1.toCharArray();
		//y[0]=i;
		//y[1]=m;
		
		for(int i=y.length-1;i>=0;i--)
			{				
					System.out.print(y[i]);
			}
					System.out.println();
				
		String[] x= str1.split(" ");
		for(int i=x.length-1;i>=0;i--)
			{
					System.out.print(x[i]+" ");
			}
				System.out.println();
	}
	
}
