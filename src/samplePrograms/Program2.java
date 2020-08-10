package samplePrograms;

public class Program2 {

	public static void main(String[] args) {
		//Logical Operators Program && , || , !
		int a=10, b=20, c=30;
		 System.out.println("AND Operator:True\n\tActual output:"+((a<b)&&(b<c)));
		 System.out.println("AND Operator:False\n\tActual output:"+((a==b)&&(a<c)));
		 System.out.println("OR OPerator:True\n\tActual output:"+((a>b)||(b<c)));
		 System.out.println("OR OPerator:False\n\tActual output:"+((a>b)||(b>=c)));
		 System.out.println("NOT OPerator:True\n\tActual output:"+!(a>b));
		 System.out.println("NOT OPerator:True\n\t740Actual output:"+!(b==c));
		 
		 //Increment or decrement operator
		 System.out.println(a);
		 System.out.println(++a);
		 System.out.println(a);
		 System.out.println(a++);
		 System.out.println(a);
		 
		 System.out.println(a--);
		 System.out.println(--a);

	}
	public void abc()
	{
		
	}

}
