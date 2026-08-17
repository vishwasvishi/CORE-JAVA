package collection;

import java.util.Enumeration;
import java.util.Vector;

public class p4 {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
        v.add("Disha");
        v.add(100);
        v.add(95.5f);
        v.add(true);
        v.add("Disha");
        v.add(null);
        System.out.println(v);
        Enumeration<Object> p = v.elements();
        
        while(p.hasMoreElements()) {
        		Object s = p.nextElement();
        		System.out.println(s);
        }
	}
}
