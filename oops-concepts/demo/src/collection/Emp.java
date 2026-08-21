package collection;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Emp implements Comparable<Emp> {
	
	String Ename;
	int Eid;
	double sal;
	
	public Emp(String Ename,int Eid,double sal) {
		this.Ename=Ename;
		this.Eid=Eid;
		this.sal=sal;
	}
	
	public String toString() {
		return this.Ename;
	}
	public int compareTo(Emp o) {
//		Integer i1= this.Eid;
//		Integer i2= o.Eid;
//		
//		return i1.compareTo(i2);
		
		/* converting to wrapper class */
		
//		Double s1=this.sal;
//		Double s2=o.sal;
//		
//		return s1.compareTo(s2);
		
		return this.Ename.compareTo(o.Ename);
	}

	
	

	public static void main(String[] args) {
		Set<Emp>  x = new TreeSet();
		x.add(new Emp("Vishi", 1, 900000)) ;
		x.add(new Emp("ABC", 2, 400000)) ;
		x.add(new Emp("BCD", 3, 500000)) ;
		x.add(new Emp("KLS", 4, 600000)) ;
		x.add(new Emp("vishwas", 5, 800000)) ;
		System.out.println(x);

	}

}
