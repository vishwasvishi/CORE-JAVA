package wrapper;

public class p7 {
    public static void main(String[] args) {
       
        Character obj1 = new Character('A');
        char ch1 = obj1.charValue();
        System.out.println(obj1 + " " + ch1);

        
        Double obj2 = new Double(135.45678);
        byte num1 = obj2.byteValue();
        int num2 = obj2.intValue();
        float num3 = obj2.floatValue();
        double num4 = obj2.doubleValue();

        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4);
    }
}