package wrapper;

public class p6 {
    public static void main(String[] args) {
        
        int num1 = 500;
        Integer obj1 = Integer.valueOf(num1);
        System.out.println(num1 + " " + obj1);

        System.out.println("-----");

        
        char num2 = '$';
        Character obj2 = Character.valueOf(num2);
        System.out.println(num2 + " " + obj2);

        System.out.println("-----");

        
        String s1 = "true";
        Boolean obj3 = Boolean.valueOf(s1);
        System.out.println(s1 + " " + obj3);

        System.out.println("-----");

        String s2 = "125.5";
        Float obj4 = Float.valueOf(s2);
        System.out.println(s2 + " " + obj4);
    }
}