package collection;

import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Vishi");
        a.add(100);
        a.add(25.5f);
        a.add(true);
        a.add('$');
        a.add("Vishi");
        a.add(null);
        System.out.println(a);
    }
}
