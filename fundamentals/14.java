class m14 
{
	int a,b;
	public m14(){
		System.out.println("from constructor");
	}
	public m14(int x,int y){
		a=x;
		b=y;
	}
	public static void main(String[] args) 
	{
		m14 ob=new m14(100,200);
		System.out.println(ob.a+","+ob.b);
		m14 ob2=new m14();
	}
}
