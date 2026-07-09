class p18 
{
	public static void main(String[] args) 
	{
		int num = 7261;
		int sum = 0;
		while (num != 0)
		{
			sum = sum + num % 10;
			num /= 10;
		}
		System.out.println("total sum of num "+sum);
	}
}
