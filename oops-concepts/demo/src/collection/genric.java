package collection;

import java.util.Collection;
import java.util.LinkedList;

public class genric {
	public static void main(String[] args) {
		Collection<String> l = new LinkedList<String>();
        l.add("Disha");
        l.add("100");
        l.add("95.5f");
        l.add("true");
        l.add("Disha");
        l.add(null);
        System.out.println(l);
        System.out.println("--------------------------");
        for(String lv:l)
        	System.out.println(lv);
        System.out.println("--------------------------");
        Collection<Integer> e = new LinkedList<Integer>();
        e.add(100);
        e.add(200);
        e.add(300);
        e.add(400);
        e.add(500);
        System.out.println(e);
        for(Integer lv:e)
        	System.out.println(lv);
	}

}
