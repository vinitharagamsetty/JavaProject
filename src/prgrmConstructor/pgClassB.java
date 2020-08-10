package prgrmConstructor;

public class pgClassB extends pgClassC{

	int a,b;
	public pgClassB(int x, int y)
	{
		super(x,y);
		this.a=x;
		this.b=y;
	}
	public void multiplication() 
	{
		System.out.println("Multiplication "+(a*b));
	}
	public void division()
	{
		System.out.println("Division "+(a/b));
	}
}
