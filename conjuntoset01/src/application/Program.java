package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();  // testei HashSet, treeSet, LinkedHashSet
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Iphone");
		
		System.out.println(set.contains("Notebook"));
		set.remove("Tablet");
		set.removeIf(x -> x.charAt(0) == 'I');
		
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
