import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int numbersTyped = scanner.nextInt();

        double[] vector = new double[numbersTyped];

        for (int i = 0; i < vector.length; i ++ ){
            System.out.print("Digite um número: ");
            vector[i] = scanner.nextFloat();
        }

        System.out.print("Valores= ");
        for (int i = 0; i < vector.length; i ++){
            System.out.print(vector[i] + "  ");
        }

        double sum = 0;
        for (int i = 0; i < vector.length; i ++){
            sum += vector[i];
        }
        System.out.println();
        System.out.printf("Sum = %.2f", sum);


        System.out.println();
        double average = sum / vector.length;
        System.out.printf("Average = %.2f", average);

        scanner.close();
    }
}