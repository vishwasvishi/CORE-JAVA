package object_programes;

public class student {

	String sname;
	int regno;
	float per;
	
	public student(String sname,int regno,float per) {
		this.sname=sname;
		this.regno=regno;
		this.per=per;
	}
	
	public static void main(String[] args) {
		student s1= new student("pavan", 111, 78);
		student s2= new student("abc", 222, 81);
		student s3= new student("vishwas", 333, 59);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}
