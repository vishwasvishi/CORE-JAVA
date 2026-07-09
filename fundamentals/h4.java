class h4 
{
	public static int largest(int a,int b, int c) 
	{
		if(a>b &&a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	public static int smallest(int a,int b, int c) 
	{
		if(a<b&&a<c)
			return a;
		else if(b<c)
			return b;
		else
			return c;
	}
	public static void Swap(int a,int b) 
	{
		System.out.println("Before swap "+a+","+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap "+a+","+b);
	}
	public static void factorial(int num) 
	{
		long fact=1;
		for (int i=1;i<=num ;i++ )
		{
			fact *=i;
		}
		System.out.println(fact);
	}
	public static void Reverse(int num) 
	{
		int rev = 0;
		for (int i=0;num!=0 ;num/=10 )
		{
			rev =(rev*10)+(num%10);
		}
		System.out.println(rev);
	}
	public static String palindrome(int num) 
	{
		int rev = 0;
		for (int i=0;num!=0 ;num/=10 )
		{
			rev =(rev*10)+(num%10);
		}
		if(rev == num)
			return "palindrome";
		else
			return "not palindrome";
	}
	public static boolean prime(int num) 
	{
		if (num<=1)
		{
			return false;
		}
		for (int i=2;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void sdigit(int num)
	{
		int i;
		int sum=0;
		for ( i=0;num!=0 ;num/=10)
		{
		  sum+=num%10;
		 
		}
		System.out.println(sum);
	}
	public static void am(int num)
	{
	
		int sum=0;
		int temp = num;
		for ( ;temp!=0 ;temp/=10)
		{
		int digit =  temp%10;
		sum += digit * digit * digit;
		}
		if(sum==num)
			System.out.println("num is amstrong");
		else
			System.out.println("num is not amstrong");

	}
	public static void strong(int num)
	{
		int fact = 1;
		int sum=0;
		int temp = num;
		int re=0;
		for ( ;temp!=0 ;temp/=10)
		{
					int pro=1;

			re =temp%10;
			for (int i =1;i<=re ;i++ )
		{
			 pro*=i;
		}
		sum+=pro;
		}
		
		if(sum==num)
			System.out.println("num is strong");
		else
			System.out.println("num is not strong");

	}
	public static void main(String[] args) 
	{
		System.out.println(largest(10,20,24));
		System.out.println(smallest(10,20,24));
		Swap(10,20);
		factorial(5);
		Reverse(143);
		System.out.println(palindrome(121));
		sdigit(121);
		am(151);
		strong(5314);
		System.out.println(prime(7));
	}
}
