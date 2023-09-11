package HW.HW3.task3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import HW.HW3.task3_1.PasswordVerifier;

public class FileApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of the file: ");
        String fileName = scanner.nextLine();
        System.out.println("Choose the operation:\n 1-read\n 2-write\n 3-copy");
        char operation = scanner.next().charAt(0);
        FileManager filemanager = new FileManager();
        switch (operation) {
            case '1':
                filemanager.read(fileName);
                break;
            case '2':
                System.out.println("Input content to write to the file: ");
                String writeContent = scanner.nextLine();
                filemanager.write(fileName, writeContent);
                break;
            case '3':
                System.out.println("Input name of the destination file : ");
                String fileDestinationName = scanner.nextLine();
                filemanager.copy(fileName, fileDestinationName);
                break;
            default:
                System.out.println("Wrong operation");
        }
    }
}