class  m9
{
	int a=10,b=20;
	public void test(){
			System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		m9 ob1=new m9();
		System.out.println(ob1);
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.test();
	}
}
