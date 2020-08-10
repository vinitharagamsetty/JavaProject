package prgrmConstructor;

public class pgClassC {

	int a,b;
	
	public pgClassC(int x,int y)
	{
		this.a=x;
		this.b=y;
	}
	
	public void modulus()
	{
		System.out.println("Module "+(a%b));
	}
}
