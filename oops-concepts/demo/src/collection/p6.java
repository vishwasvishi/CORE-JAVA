package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class p6 {
	public static void main(String[] args) {
		List<String> v = new ArrayList<String>();
        v.add("Disha");
        v.add("pooja");
        v.add("ABC");
        v.add("bcd");
        v.add("Disha");
        System.out.println(v);
        
        System.out.println("--------------------");
        ListIterator<String> itr = v.listIterator();
        while(itr.hasNext()) {
        	String s = itr.next();
        System.out.println(s);
        if(s.contentEquals("bcd"))
        		itr.remove();
        
        if(s.contentEquals("ABC"))
    		itr.add("vishi");
        if(s.contentEquals("pooja"))
    		itr.set("bcd");
        }
        System.out.println("----------------");
        System.out.println(v);
        
        System.out.println("-------------------");
        List<String> a = new ArrayList<String>();
        a.add("Disha");
        a.add("pooja");
        a.add("ABC");
        a.add("bcd");
        a.add("Disha");
        System.out.println(a);
        
        System.out.println("--------------------");
        ListIterator<String> it = a.listIterator(a.size());
        while(it.hasPrevious()) {
        	String s = it.previous();
        System.out.println(s);
        if(s.contentEquals("bcd"))
        		it.remove();
        
        if(s.contentEquals("ABC"))
    		it.add("vishi");
        if(s.contentEquals("pooja"))
    		it.set("bcd");
        }
        System.out.println("----------------");
        System.out.println(a);
	}
	}


