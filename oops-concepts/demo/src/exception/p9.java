package exception;

import java.util.Scanner;

public class p9 {

    static final int ACTUAL_PIN = 19936;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pin: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == ACTUAL_PIN) {
            System.out.println("Transaction Continue");
        } else {
            System.out.println("Transaction declined");
            throw new ArithmeticException("Invalid Pin");
        }
    }
}