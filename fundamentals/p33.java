class p33 
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
			int x = 1;
			while (x<=2)
			{
				if (i==1&&x==1||i==1&&x==2 || i==2&& x==2)
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
				x++;
			}
			System.out.println("");
			i++;
		}
	}
}
