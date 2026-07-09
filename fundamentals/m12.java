class m12 
{
	static int x=100,y=200;
	public static void test2(){
			System.out.println("from static test");
	}
	int a=400,b=800;
	public void test1(){
			System.out.println("from non static test");
	}
	public static void main(String[] args) 
	{
		m12 ob1=new m12();
		ob1.a=300;
		ob1.y=600;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		ob1.test1();
		ob1.test2();
		System.out.println("-----------------------");
		m12 ob2=new m12();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
		ob2.test1();
		ob2.test2();
	}
}
