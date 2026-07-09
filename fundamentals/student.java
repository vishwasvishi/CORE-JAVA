class student
{
	String sname;
	int reg;
	String branch;
	public student(String sname, int reg,	String branch){
		this.sname=sname;
		this.reg=reg;
		this.branch=branch;
	}
	public static void main(String[] args) 
	{
		student s1=new student("abc",123,"CSE");
		student s2=new student("bcd",23,"CSE");
		System.out.println(s1.sname +"," +s1.reg+"," +s1.branch);
		System.out.println(s2.sname +"," +s2.reg+"," +s2.branch);
	}
}
