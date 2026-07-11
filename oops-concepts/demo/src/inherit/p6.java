package inherit;

public class p6 extends p5 {
	static int y=1000;
	public static void test1 () {
		System.out.println("From test1 of p6");
	}
	public static void main(String[] args) {
		p6 ob1 =new p6();
		ob1.test();
		ob1.test1();
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println("-------------------");
		
		p6 ob2 =new p6();
		ob2.test();
		ob2.test1();
		System.out.println(ob2.x);
		System.out.println(ob2.y);
	}

}
