package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class student {
	String Sname;
	int regno;
	float per;
	public student(String Sname,int regno,float per) {
		this.Sname=Sname;
		this.regno=regno;
		this.per=per;
	}
	@Override
	public String toString() {
		return this.Sname;
	}

	public static void main(String[] args) {
		
		Comparator<student> x=new studentComparator();
		
		ArrayList<student> s=new ArrayList<student>();
		s.add(new student("vishi", 1, 86));
		s.add(new student("ABC", 2, 90));
		s.add(new student("pardeep", 3, 81));
		System.out.println(s);
		System.out.println("---------------------");
		Collections.sort(s, x);
		System.out.println(s);

	}

}
