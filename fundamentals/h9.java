class h9 
{
	static int n=10;
	public static void test() 
	{
		System.out.println("Welcome to Java");
	}
	int w=100;
	public static void main(String[] args) 
	{
		h9 o=new h9();
		System.out.println(o.n);
		o.n=200;
		h9 o2=new h9();
		h9 o3=new h9();
		System.out.println(o2.n);
		System.out.println(o2.w);
		System.out.println(o3.n);
		System.out.println(o3.w);
		test();
	}
}
