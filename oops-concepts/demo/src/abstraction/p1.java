package abstraction;

public class p1 implements i1,i2,i3 {
	
	public void test1() {
		System.out.println("From test1");
	}
	
	public void test2() {
		System.out.println("From test2");
	}
	
	public void test3() {
		System.out.println("From test3");
	}

	public static void main(String[] args) {
		p1 b=new p1();
		b.test1();
		b.test2();
		b.test3();
		// TODO Auto-generated method stub

	}

}
