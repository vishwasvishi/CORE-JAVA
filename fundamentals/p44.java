class p44 
{
	public static int test(boolean cond){
		/* multiple return statments written in conditional statments or in try catch */
		if(cond)
			return 20;
		else
			return 30;
	}
	public static void test2() 
	{
		System.out.println("from test2");
		return ; //if we want return the data we should change the viod to return datatype 
	}
	public static void main(String[] args) 
	{
		System.out.println(test(false));
		test2();
	}
}
