package entities;

import java.util.Scanner;

public class Equations {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int choose = -1;

        while (choose != 0) {
            System.out.println("Calculator 2.0: ");
            System.out.println("1 - Add: ");
            System.out.println("2 - Subtract: ");
            System.out.println("3 - Multiply: ");
            System.out.println("4 - To divide: ");
            System.out.println("0 - Exit: ");

            choose = scanner.nextInt();

            if (choose == 0) {
                System.out.println("Exiting.. ");
                break;
            }
            System.out.println("the first number: ");
            double numberOne = scanner.nextDouble();
            System.out.println("The second number: ");
            double numberTwo = scanner.nextDouble();

            double result = 0;
            switch (choose) {
                case 1:
                    result = numberOne + numberTwo;
                    break;

                case 2:
                    result = numberOne - numberTwo;
                    break;

                case 3:
                    result = numberOne * numberTwo;
                    break;

                case 4:
                    result = numberOne / numberTwo;
                    break;

                default:
                    System.out.println("Wrong number, try again: ");
                    continue;
            }
            System.out.println("Result: " + result);
        }
    }
}

