/* Write a program to repeatedly find the sum of digits until a single-digit number is obtained. */

class  h1
{
	public static void main(String[] args) 
	{
		int a=9876;
		
		for (;  a>=10; )
		{
			int sum=0;
				for (; a !=0 ; a /= 10)
				{
				sum = sum+a % 10;

				}
				a=sum;
		}
		System.out.println(a);
	}
}
