package HW.HW3.task3_1;

import java.util.Scanner;

import task32.AnimalNotFoundException;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create a password: ");
        String password = sc.nextLine();
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        try {
            passwordVerifier.verify(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
