package abstraction;

public class m2 extends m1 {
	
	public void test() {
		System.out.println("from test");
	}
	public void test2(int x) {
		System.out.println("from test2");
	}
	
	public m2() {
		System.out.println("from constructor");
	}

	public static void main(String[] args) {
		m1 ob = new m2();
		ob.test();
		ob.test2(0);
	}

}
