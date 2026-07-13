package inherit;

public class emp {
	String ename;
	int eid;
	double sal;
	public void display() {
		System.out.println("Ename="+this.ename+" Eid="+this.eid+" sal="+this.sal);
	}
	public emp(String ename,int eid,double sal) {
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}

}
