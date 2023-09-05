package HW.HW2.task2_2;

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        sc.close();
        try {
            if (num <= 0) {
                throw new InvalidNumberException("The num isn't correct");
            } else {
                System.out.println("The num is correct");
            }
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}