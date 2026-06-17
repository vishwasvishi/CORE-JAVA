class p15 
{
	public static void main(String[] args) 
	{
		int a=10,b=130,c=15;
		int res = a>b?( a>c ?a:(c>b?c:b)) : (b>c?b:c);

		System.out.print(res +" is the greatest no");

	}
}
