class Emp1 
{
	static String cname;
	static{
		cname = "google";
	}
	public static void work(){
			System.out.println("I am working in "+cname);
	}
	String ename;
	int eid;
	double sal;
	public Emp1(String ename, int eid,	double sal){
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public void dispaly(){
		System.out.println("Ename="+this.ename+" Eid="+this.eid+" salary="+this.sal);
	}
	public static void main(String[] args) 
	{
		Emp1 ob=new  Emp1("abc",111,380000d);
		Emp1 ob1=new  Emp1("bcd",222,450000d);
		Emp1 ob2=new  Emp1("nmg",333,360000d);

		Emp1[] x={ob,ob1,ob2};
		for(int i=0;i<=x.length;i++){
		x[i].dispaly();
		x[i].work();
		System.out.println("---------------------");
		}
	}
}
