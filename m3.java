class m3 
{
	static int a = test1(10,25);
	static int b = test1(10,25)+test2(30,21);
	public static int test1(int m,int n) 
	{
		return m+n+test2(m,n);
	}
	public static int test2(int x,int y) 
	{
		return x+y+20;
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
	}
}
