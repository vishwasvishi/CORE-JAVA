package exception;

public class p4 {
    public static void main(String[] args) {
        System.out.println("Main Begin");
        try {
            test1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Main End");
    }

    public static void test1() {
        System.out.println("Test 1 Begin");
        test2();
        System.out.println("Test 1 End");
    }

    public static void test2() {
        System.out.println("Test 2 Begin");
        int a = 10 / 0; // Throws ArithmeticException
        System.out.println("Test 2 End");
    }
}
