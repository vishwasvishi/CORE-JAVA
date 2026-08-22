package collection;

import java.util.Comparator;

public class studentComparator implements Comparator<student> {

	
	public int compare(student o1, student o2) {
//		Integer i1=o1.regno;
//		Integer i2=o2.regno;
//		return -i1.compareTo(i2);
		
//		Float f1=o1.per;
//		Float f2=o2.per;
//		return f1.compareTo(f2);
		return o1.Sname.compareTo(o2.Sname);
	}

}
