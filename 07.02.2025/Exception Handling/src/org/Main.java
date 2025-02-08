package src.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();



            int reciprocal = 1 / number;
            System.out.println("The reciprocal of " + number + " is " + reciprocal);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
