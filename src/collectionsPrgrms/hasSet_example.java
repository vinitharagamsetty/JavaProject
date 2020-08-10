package collectionsPrgrms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class hasSet_example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>(); // add, remove, we will not have index concept here 
		set.add("vini");
		set.add("pallu");
		set.add("amma");
		set.add("deepthi");
		set.add("vini");
		set.add(null);
		set.add(null);
		for(String s:set)
		{
			System.out.println(s);
		}
		System.out.println(set);
		
		TreeSet<String> tree=new TreeSet<>(); // index will not be possible, add, remove, update not possible
		tree.add("J");
		tree.add("JA");
		tree.add("JAV");
		tree.add("JAVA");
		tree.add("JAVA");
		tree.add("A");
		
		tree.remove("J"); // have to give value instead of index
		System.out.println(tree);
		for(String s:tree)
		{
			System.out.println(s);
		}
		
		HashMap<String, Integer> map=new HashMap<>(); // if u want out put as url= ww.java.com, key=value
		
		map.put("Vinitha", 01);
		map.put("Pallavi", 2);
		map.put("Amma", 3);
		map.put("Deepthi", 4);
		
		System.out.println(map);
		
		HashMap<Object, Object> map1=new HashMap<>();//object will accept all data types put, get only
		map1.put(1, 1);
		map1.put("url", "www.vinitha.com");
		map1.put(1.5, 1);
		System.out.println(map1);
		System.out.println(map1.get(1.5));
		System.out.println(map1.get("url"));
		
		
		

	}

}
