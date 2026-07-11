package inherit;

public class p3 {
	int a=100;
	public void test() {
		System.out.println("From test1 p3");
	}
	public static void main(String[] args) {
		
		p3 ob = new p3();
		ob.test();
		System.out.println(ob.a);
		
	}

}
