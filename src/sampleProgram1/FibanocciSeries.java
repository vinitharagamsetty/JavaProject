package sampleProgram1;

public class FibanocciSeries {

	public static void main(String[] args) {
		String str4="141";
		System.out.println(str4.charAt(2));
		int max =1, previous=0, next = 1, i;
		
		System.out.println("Fibanocci series of "+max);
		for(i=10;i>=max;i--) {
			System.out.print(previous+" ");
			int sum = previous+next;
			previous = next;
			next = sum;
		}
		System.out.println();

		int j=1,p=0,n=1;
		while(j<=10) {
			System.out.print(p+" ");
			int s=p+n;
			p=n;
			n=s;
			j++;
		}
		
		
	}

}
