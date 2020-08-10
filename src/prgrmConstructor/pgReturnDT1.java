package prgrmConstructor;

public class pgReturnDT1 {
	int a,b;
	public pgReturnDT1(int x,int y)
	{
		this.a=x;
		this.b=y;
	}

	public int addition()
	{
		int x= a+b;
		return x;
	}
	public int subtraction()
	{
		int y=a-b;
		return y;
	}
	public void subtract()
	{
		int y=a-b;
		
	}
	public int multiplication(int w,int v)
	{
		int z=w*v;
		return z;
	}
	public String name(String d)
	{
		return d;
		
	}
}
