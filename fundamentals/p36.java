class p36 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=3 ; i++ )
		{
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(" ");
				

			}
			for (int y=3; y>=i ; y-- )
			{
				if ((i==1 && y==2)|| (i==2 && y==2) || (i==1 && y==1))
				{
				System.out.print(" ");
				}
				else
				System.out.print("*");
				

			}
			for (int x=2 ; x>=i ; x-- )
			{
				if (i==1 && x==2)
				{
					System.out.print(" ");
				}
					else
				System.out.print("*");
				

			}
			System.out.println("");
		}

	}
}
