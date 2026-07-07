class m15 
{
	public m15(){
			System.out.println("from c1");
	}
	public m15(int x){
		this();
			System.out.println("from c2");
	}
	public m15(int x,int z){
		this(x);
			System.out.println("from c3");
	}
	public static void main(String[] args) 
	{
		m15 o=new m15(100,200);
	}
}
