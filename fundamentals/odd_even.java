class odd_even 
{
	public static void main(String[] args) 
	{
	int evnum=0,onum=0;
	for (int i=1;i<=20 ;i++ )
	{
		if (i%2==0)
		{
			evnum+=i;
		}else {
		onum+=i;
		}
	}
	System.out.println(onum);
	System.out.println(evnum);
	}
}
