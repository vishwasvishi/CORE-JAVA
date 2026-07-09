class p41 
{
	public static void test(int a, int b) 
	{
		System.out.println(a);
		System.out.println(b);
	}
		public static void add(int a, int b, int c) 
	{
		int sum =a+b+c;
		System.out.println(sum);
	}
	public static void diffdatatype(int a, float b, double c) 
	{
		double pro =a*b*c;
		System.out.println(pro);
	}
		public static void concat(String a, char b, boolean c) 
	{
		String w =a+b+c;
		System.out.println(w);
	}

	public static void main(String[] args) 
	{
		test(101,12);
		System.out.println("--------------------------");
		add(10,20,30);
		System.out.println("--------------------------");
		diffdatatype(10,2.50f,30.985d);
		System.out.println("--------------------------");
		concat("abc",'@',true);
	}
}
