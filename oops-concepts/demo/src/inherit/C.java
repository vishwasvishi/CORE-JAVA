package inherit;

public class C extends B {
	int z=300;
	public void test3() {
		System.out.println("From test3");
	}


	public static void main(String[] args) {
		C ob=new C();
		System.out.println(ob.x);
		ob.test1();
		System.out.println("------------------------");
		B ob1= ob;
		System.out.println(ob.y);
		ob.test2();
		System.out.println(ob.z);
		ob.test3();
		
		

	}

}
