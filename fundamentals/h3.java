class h3 
{
	static int a=100;
	static int b=200;
	public static int add() 
	{
		return a+b;
	}
	public static int sub() 
	{
		return a-b;
	}
	public static int mul() 
	{
		return a*b;
	}
	public static int div() 
	{
		return a/b;
	}
	public static int sq() 
	{
		int c = a*a;
		return c;
	}
	public static int cube() 
	{
		int c = b*b*b;
		return c;
	}
	public static boolean eo() 
	{
		if (a%2==0)
			return true;
		else
			return false;
	}
	public static boolean less() 
	{
		if(a<b)
			return true;
		else
			return false;
	}
	public static boolean larg() 
	{
		if(a>b)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(add());
		System.out.println(sub());
		System.out.println(mul());
		System.out.println(div());
		System.out.println(sq());
		System.out.println(cube());
		System.out.println(eo());
		System.out.println(less());
		System.out.println(larg());
	}
}
