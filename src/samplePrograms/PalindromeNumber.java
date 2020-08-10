package samplePrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int rem,sum=0,module,n=141;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
