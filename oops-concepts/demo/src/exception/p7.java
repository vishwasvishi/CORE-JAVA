/* using throws keyword */
package exception;

public class p7 {
	static {
		System.out.println("from static of p6");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main begin");
			Class.forName("abc");
		
		System.out.println("main end");

	}

}
