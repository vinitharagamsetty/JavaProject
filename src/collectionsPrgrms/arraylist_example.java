package collectionsPrgrms;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_example {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(); //will use data structures like add, delete
		//to addition: 
		list.add(10);
		
		list.add(null);
		list.add(null);
		list.add(20);
		list.add(30);
		list.add(40);
		// Insertion: to insert, it will go and add in middle give index and value(index, value)
		list.add(2,300);
		
		// Updation: to update(index, update value)
		list.set(1, 500);
		
		// Remove value, give index
		list.remove(0);
		
		System.out.println(list);
		// to get value, use index 
		list.get(2);
		System.out.println(list.get(2));
		//to get index of value 40
		System.out.println(list.indexOf(40));
		//incorrect value will return -1
		System.out.println(list.indexOf(null));
		System.out.println("size of array list"+list.size());
		System.out.println("------------------");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		
		for(Integer a:list)
		{
			System.out.println(a);
		}
		System.out.println("******************");
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
		int[] num=new int[4];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		System.out.println(num); // see difference in list
		System.out.println(num[1]);
		
		
		

	}

}
