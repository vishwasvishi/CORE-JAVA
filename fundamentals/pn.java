class pn 
{
	public static void main(String[] args) 
	{
		int num = 3;
		boolean ispirme=true;
		if (num<=1){
		 ispirme=false;
		}else{
		for ( int i = 2; i<=Math.sqrt(num);i++)
			{
			if (num%i==0)
			{
				ispirme=false;
			}
		}
		}
		if(ispirme)
		System.out.println(" prime number");

		else
		System.out.println("not prime number");
	}
}
