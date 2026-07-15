package inherit;

public class B1 extends A1 {
	int y=200;
	public void test2() {
		System.out.println("From test2");
	}
	public static void main(String[] args) {
		A1 ob=new A1();
		System.out.println(ob.x);
		ob.test1();
		
		if (ob instanceof B1) {
			B1 ob1=(B1) ob;
			System.out.println("object downcsted");
			
		} else {
			System.out.println("object not downcsted");

		}
	}

}
