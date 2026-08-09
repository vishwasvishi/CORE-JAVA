/* using propogation */
package exception;

public class p8 {
	public static void main(String[] args) {
        System.out.println("Main Begin");
        try {
            test1();
        }catch (ClassNotFoundException e) {
			System.out.println(e);
		}
        
        System.out.println("Main End");
    }

    public static void test1() throws ClassNotFoundException{
        System.out.println("Test 1 Begin");
        test2();
        System.out.println("Test 1 End");
    }

    public static void test2() throws ClassNotFoundException {
        System.out.println("Test 2 Begin");
        Class.forName("abc"); // Throws ClassNotFoundException
        System.out.println("Test 2 End");
    }

}
