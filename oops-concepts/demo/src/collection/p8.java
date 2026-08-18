package collection;

import java.util.HashSet;

public class p8 {
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();

        h.add("Disha");
        h.add(100);
        h.add(25.51);
        h.add(true);
        h.add('$');
        h.add("Disha"); 
        h.add(null);
        h.add(null); 
        System.out.println(h);
	}

}
