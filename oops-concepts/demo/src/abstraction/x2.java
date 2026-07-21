package abstraction;

public class x2 implements x1 {
	
	public void test1() {
		System.out.println("From test1");
	}
	
	public void test2() {
		System.out.println("from test2");
		
	}

	public static void main(String[] args) {
		x1 ob=new x2();
		ob.test1();
		ob.test2();

	}

}
