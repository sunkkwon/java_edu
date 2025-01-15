package day10.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
		// set
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3));
		System.out.println(set.add(4));
		
		for (Integer item : set) {
			System.out.println(item + " ");
		}
		
		System.out.println();
		
		// set
		System.out.println(set.add(1));

		for (Integer item : set) {
			System.out.println(item + " ");
		}
		
		System.out.println();
}
}
