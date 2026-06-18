class p34 
{
	public static void main(String[] args) 
	{
		int i=1;
		while (i<=3)
		{
			int j = 3;
			while (j>=i)
			{
				System.out.print(" ");
				j--;
			}
			int y = 1;
			while (y<=i)
			{
				if (i==2 && y==2)
				{
				System.out.print(" ");
				}
				else
				System.out.print("*");
				y++;
			}
			if(i==2 || i==3){
			int x = 1;
			while (x<=i-1)
			{
				
					System.out.print("*");
				x++;
			}
			}
			System.out.println("");
			i++;
		}
	}
}
