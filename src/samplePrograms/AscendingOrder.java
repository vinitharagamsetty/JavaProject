package samplePrograms;

public class AscendingOrder {

	public static void main(String[] args) {
		
		int[] x= {5,4,2,3,1,6};
		int y=x.length;
		System.out.println(y);
		for(int i=0;i<y-1;i++)
		{
			if(x[i]>x[i+1])
			{
				System.out.println(x[i]);				
			}
			else {
				System.out.println(x[i++]);
			}
			
		}
	}

}
