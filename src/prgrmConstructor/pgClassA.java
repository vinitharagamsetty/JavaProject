package prgrmConstructor;

public class pgClassA extends pgClassB {
	static int a,b;

	public pgClassA(int x,int y)
	{
		super(x,y);
		this.a=x;
		this.b=y;
	}
	
public	static int addition()
	{
		int z=a+b;
		System.out.println("Addition "+z);
		return z;
	}
	public void subtraction()
	{
		System.out.println("Subtraction "+(a-b));
	}
	
}
