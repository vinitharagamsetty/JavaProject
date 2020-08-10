package prgrmConstructor;

public class pgMainClass {

	public static void main(String[] args) {
		
		pgClassA obj =new pgClassA(10,5);
		
	int x=	obj.addition();	
	System.out.println(x);
		obj.subtraction();
		obj.multiplication();
		obj.division();
		obj.modulus();
		pgClassA.addition();

	}

}
