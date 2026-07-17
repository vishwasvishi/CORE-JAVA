package poly;

public class employee {
	String ename;
	int eid;
	double sal;
	
	public employee(String ename,
	int eid,
	double sal) {
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Ename="+this.ename+" eid="+this.eid+" salary="+this.sal);
	}
	public void work() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
