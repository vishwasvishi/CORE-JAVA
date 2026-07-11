package pack1;

public class dev extends emp  {
	int b;
	int x,y;
	public dev(int x,int y){
		super(x);
		this.x=x;
		this.y=y;
 		this.b=y;
		
	}
	
	String tech;
	public dev(String ename,int eid,double sal,String tech) {
		super(ename,eid,sal);
		// TODO Auto-generated constructor stub
		this.tech=tech;
	}
	public static void main(String[] args) {
		dev d=new dev("abc",222,2000000,"java");
		System.out.println(d.ename+","+d.eid+","+d.sal+","+d.tech);
		dev d1=new dev(100,200);
		System.out.println(d1.a+","+d1.b);
	}

}
