package pack1;

public class emp {
	String ename;
	int eid;
	double sal;
	int a;
	public emp(int x) {
		System.out.println("from constructor in parent class");
		this.a=x;
	}
	public emp(String ename,int eid,double sal) {
		// TODO Auto-generated constructor stub
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
