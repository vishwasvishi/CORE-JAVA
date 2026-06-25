class p45 
{

	public static void test(int a, int b) 
	{
		int sum = a + b;
		System.out.println(sum);
	}
	public static void test(String a, boolean b) 
	{
		String sum=a+b;
		System.out.print(sum);
	}
	public static void main(String[] args) 
	{
		test();
		test(10,20);
		test("ab",true);

	}
	public static void test() 
	{
		System.out.println("Hello World!");
		
	}
}
