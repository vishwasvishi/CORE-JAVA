package inherit;

public class B extends A {
	int y=200;
	public void test2() {
		System.out.println("From test2");
	}

	public static void main(String[] args) {
		A ob=new B();
		System.out.println(ob.x);
		ob.test1();
		B ob1= (B) ob;
		
		

	}

}
