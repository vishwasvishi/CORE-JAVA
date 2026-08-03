package object_programes;

public class p3 {
	
	int a=100,b=200;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am done with this");
	}
	public static void main(String[] args) {
		p3 ob = new p3();
		ob =new p3();
		
		p3 ob1 = new p3();
		ob1 = null;
		
		System.gc();
		
	}

}
