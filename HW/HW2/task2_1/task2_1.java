package HW.HW2.task2_1;

import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = sc.nextInt();
        System.out.print("Input number b: ");
        int b = sc.nextInt();
        sc.close();
        try {
            if (b == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed");
            } else {
                System.out.println("a / b = " + a / b);
            }
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
