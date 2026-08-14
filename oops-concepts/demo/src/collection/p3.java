package collection;

import java.util.Collection;
import java.util.LinkedList;

public class p3 {
	public static void main(String[] args) {
		Collection<Object> l = new LinkedList<Object>();
        l.add("Disha");
        l.add(100);
        l.add(95.5f);
        l.add(true);
        l.add("Disha");
        l.add(null);
        System.out.println(l);
        for(Object lv:l) {
        	System.out.println(lv);
        }
    }
	}

