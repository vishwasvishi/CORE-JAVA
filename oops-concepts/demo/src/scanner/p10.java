package Scanner;

import java.util.Scanner;

public class p10 { 

    public static void main(String[] args) { 
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Integer data:");
        int a = sc.nextInt();

        
        System.out.println("Enter the float data:");
        float b = sc.nextFloat(); 

        
        System.out.println("Enter the double data:");
        double c = sc.nextDouble(); 

        
        System.out.println("Enter the boolean data (true/false):");
        boolean d = sc.nextBoolean();

        
        System.out.println("Enter the String data:");
        String e = sc.next();

        
        System.out.println("\n--- Your Inputs ---");
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + e);
        
        
    }
}