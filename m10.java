class m10 
{
	int a;float b;
	public void test(){
			System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		m10 ob1=new m10();
		System.out.println(ob1);
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.test();
		System.out.println("-----------------------");
		m10 ob2=new m10();
		System.out.println(ob2);
		ob2.a=100;
		ob2.b=13.5f;
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		ob2.test();
	}
}
