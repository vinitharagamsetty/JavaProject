package samplePrograms;

public class IncrementDecrementPgm {

	public static void main(String[] args) {
		int a=50, c=22, d=5;
		
		System.out.println("Post Increment:");
		System.out.println(a++);
		System.out.println(a);
		System.out.println("Pre Incement:");
		System.out.println(++a);
		System.out.println("value of a "+a);
		System.out.println("Post Decrement:");
		System.out.println(a--);
		System.out.println(a);
		System.out.println("Pre Decrement:");
		System.out.println(--a);
		// ++c - c--
		System.out.println("c=22: "+ ((++c)-(--c)));
		// d++ - ++d
		System.out.println("d=5: "+((d++)-(++d)));

	}

}
