class p35 
{
	public static void main(String[] args) 
	{
		for (int i=1 ; i<=5 ; i++ )
		{
			System.out.println(i);
			
		}
		System.out.println("");
		int e_sum = 0 , o_sum = 0;
		for (int j=1 ; j<=20 ; j++ )
		{
			if (j%2==0)
			{
				e_sum +=j;
			}
			else 
				o_sum +=j;
			
		}
		for (int y=1, x=3;y<=3 ;y++, x-- )
		{
		System.out.println(y);
		System.out.println(x);

		}
		System.out.println("even no = "+e_sum);
		System.out.println("odd no = "+o_sum);
	}
}
