package wrapper;

public class p8 {
    public static void main(String[] args) {
        String s1 = "500";
        String s2 = "true";
        String s3 = "25.5";

        
        int num1 = Integer.parseInt(s1);
        boolean num2 = Boolean.parseBoolean(s2);
        float num3 = Float.parseFloat(s3);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}