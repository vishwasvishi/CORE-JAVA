package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class p7 {
	public static void main(String[] args) {
		List<String> v = new ArrayList<String>();
        v.add("Disha");
        v.add("pooja");
        v.add("ABC");
        v.add("bcd");
        v.add("Disha");
        System.out.println(v);
        
        System.out.println("--------------------");
        ListIterator<String> itr = v.listIterator(v.size());
        while(itr.hasPrevious()) {
        	String s = itr.previous();
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
	
	}

}
