class p48 
{
	public static void main(String[] args) 
	{
		/*no of digits*/
	int num = 1234;
	int i;
	for ( i=0; num!=0 ;i++ )
	{
		num/=10;
	}
	/*sum*/
	int sum;
	int digit=1234;
	for (sum=0;digit!=0 ; digit/=10 )
	{
		sum=sum+digit%10;
	}
	/*reverse*/
	int n=1234;
	int rev;
	for ( rev=0;n!=0 ;n/=10 )
	{
		rev = (rev*10)+(n%10);
	}
	System.out.println(i);
	System.out.println(sum);
	System.out.print(rev);
	}
}
