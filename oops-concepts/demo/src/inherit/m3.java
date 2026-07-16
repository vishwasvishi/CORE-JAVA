package inherit;

public class m3 extends m2{
	public void test() {
		System.out.println("from test m3");

	}

	public static void main(String[] args) {
		m1 c=new m1();
		c.test();
		m2 ob=new m2();
		ob.test(); 
		m3 ob1=new m3();
		ob1.test();
		System.out.println("------------------------");
		m1 ob2=ob1;
		ob2.test();
		m2 ob3=ob1;
		ob3.test();
	}

}
