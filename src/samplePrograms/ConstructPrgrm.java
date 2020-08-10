package samplePrograms;

public class ConstructPrgrm extends ConstrutPrgm3{
	int a,b;
	double c,d;
	
	public void addi()
	{
		System.out.println(a+b);
	}
	public void addd()
	{
		System.out.println(c+d);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	public ConstructPrgrm(int x,int y)
	{
		super(x,y);
		System.out.println("default constr");
		this.a=x;
		this.b=y;
	}
	/*public ConstructPrgrm(double w,double z)
	{
		System.out.println("default constr2");
		this.c=w;
		this.d=z;
	}*/
	public ConstructPrgrm()
	{
	super(2,2);	
	}
	
}
