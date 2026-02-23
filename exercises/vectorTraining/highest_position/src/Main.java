import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much number you will typed? ");
        int muchNumbers = scanner.nextInt();
        float[] vector = new float[muchNumbers];

        for (int i = 0; i < vector.length; i ++){
            System.out.print("Enter a number: ");
            float enterNumbers = scanner.nextFloat();
            vector[i] = enterNumbers;
        }

        float bigger = vector[0];
        int highestPosition = -1;
        for (int i = 0; i < vector.length; i ++){
            if (vector[i] > bigger){
                bigger = vector[i];
                highestPosition = i;
            }
        }
        System.out.println("higher value = " + bigger);
        if (highestPosition != -1){
            System.out.print("position of the highest value: " + highestPosition);
        }
        else {
            System.out.print("Nothing to show.");
        }
    }
}