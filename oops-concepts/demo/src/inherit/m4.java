package inherit;

public class m4 {
	private void test() {
		System.out.println("from private test m1");
	}

	public static void main(String[] args) {
		m5 ob=new m5();
		ob.test();
		System.out.println("----------------");
		m4 ob1=ob;
		ob1.test();
	}

}
