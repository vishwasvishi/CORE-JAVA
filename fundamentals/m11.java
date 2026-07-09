class m11 
{
	static int x=100;
	public static void test2(){
			System.out.println("from static test");
	}
	int a=400;
	public void test1(){
			System.out.println("from non static test");
	}
	public static void main(String[] args) 
	{
		m11 ob1=new m11();
		System.out.println(ob1);
		System.out.println(ob1.a);
		System.out.println(ob1.x);
		ob1.test1();
		ob1.test2();
		System.out.println("-----------------------");
		m11 ob2=new m11();
		System.out.println(ob2);
		System.out.println(ob2.a);
		System.out.println(ob2.x);
		ob2.test1();
		ob2.test2();
	}
}
