package inherit;

public class p4 extends p3{
	int b=200;
	public void test1() {
		System.out.println("From test1 p4");
	}
	public static void main(String[] args) {
		
		p4 ob = new p4();
		ob.test1();
		System.out.println(ob.b);
		ob.test();
		System.out.println(ob.a);

}
}
