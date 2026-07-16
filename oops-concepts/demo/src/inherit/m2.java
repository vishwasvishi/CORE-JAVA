package inherit;

public class m2 extends m1 {
	public void test() {
		System.out.println("from test m2");

	}

	public static void main(String[] args) {
		m1 c=new m1();
		c.test();
		m2 ob=new m2();
		ob.test();
		System.out.println("------------------------");
		m1 ob1=ob;
		ob1.test();

	}

}
