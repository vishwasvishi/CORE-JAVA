package inherit;

public class p8 extends p7 {
	
	int b=200;
	static int y=1000;
	public static void test1 () {
		System.out.println("From test1 of p6");
	}
	public static void main(String[] args) {
		p8 ob1 =new p8();
		ob1.test();
		ob1.test1();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println("-------------------");
		
		p8 ob2 =new p8();
		ob2.test();
		ob2.test1();
		
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
	}

}
