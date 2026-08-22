package collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class p13 {

	
	public static void main(String[] args) {
		Comparator x= new IntergerComparator();
		
		SortedSet<Integer> I=new TreeSet(x);
		I.add(100);
		I.add(300);
		I.add(500);
		I.add(400);
		I.add(200);
		System.out.println(I);
	}

}
