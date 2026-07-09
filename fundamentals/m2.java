class  m2 
{
	static int a=0;
	static int esum=0;
	static int osum=0;

	public static void main(String[] args) 
	{

		++a;
		if (a<=10)
		{
			 if (a%2==0)
			{
				esum+=a;
				main(null);
			}
			else  
			{
				osum+=a;
								main(null);

			}
		}
	else{
			System.out.println("esum"+ esum);
		System.out.println("osum"+osum);
	}
		
	}

}
