class swaping 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 12;
		System.out.println("Before: a:"+ a+", b:"+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("After: a:"+ a+", b:"+b);

	}
}
