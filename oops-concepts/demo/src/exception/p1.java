package exception;

public class p1 {

	public static void main(String[] args) {
		System.out.println("from main begin");
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("from catch block");
		}
		System.out.println("from main end");

	}

}
