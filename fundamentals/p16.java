class p16 
{
	public static void main(String[] args) 
	{
		int even_num = 0, odd_num = 0;
		int i=1;
		while (i<=20)
		{
			if (i%2==0)
			{
				even_num += i;
				
			}
			else
			{
				odd_num +=i;
				
			}
			i++;
		}
		System.out.println("sum of even_num is "+even_num);
		System.out.println("sum of odd_num is "+odd_num);
	}
}
