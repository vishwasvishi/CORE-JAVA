class  p7
{
	public static void main(String[] args) 
	{
int a= 101;
int b= 140;
int c= 110;
int res = a > b ? 
			(b > c ? b : (a > c ? a : c)) : 
			(a > c ? a : (b > c ? c : b));
			System.out.println(res);
	}
}
