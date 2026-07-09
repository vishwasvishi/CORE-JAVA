class p21 
{
	public static void main(String[] args) 
	{
		int num = 121;
		int temp = num;
		int rev =0;
		while (temp != 0)
		{
			rev = (rev * 10) + (temp % 10);
			temp /= 10;
		}
			if(num == rev)
				System.out.println (num + " is a pl");
			else
				System.out.println (num + " is not a pl");

		
	}
}
