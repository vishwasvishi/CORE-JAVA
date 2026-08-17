package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class p5 {
	public static void main(String[] args) {
		Collection<String> v = new ArrayList<String>();
        v.add("Disha");
        v.add("pooja");
        v.add("ABC");
        v.add("bcd");
        v.add("Disha");
        System.out.println(v);
        
        System.out.println("--------------------");
        Iterator<String> itr = v.iterator();
        while(itr.hasNext()) {
        	String s = itr.next();
        System.out.println(s);
        if(s.contentEquals("bcd"))
        		itr.remove();
        
        }
        System.out.println("----------------");
        System.out.println(v);
	}
	

}
