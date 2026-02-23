import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int numbersTyped = scanner.nextInt();
        int[] numbers = new int[numbersTyped];
        for (int i = 0; i < numbers.length; i ++){
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("even numbers: ");
        int count = 0;
        for (int i = 0; i < numbers.length; i ++){
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
                count ++;

            }
        }
        System.out.print("\nquantity in pairs = " + count);
        scanner.close();
    }
}