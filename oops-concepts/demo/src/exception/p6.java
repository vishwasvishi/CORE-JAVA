/* using try-catch method */

package exception;

public class p6 {
	static {
		System.out.println("from static of p6");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		
		try {
			Class.forName("abc");
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main end");

	}

}
