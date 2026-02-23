import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements will the vector have ?");
        int choose = scanner.nextInt();
        int[] vector = new int[choose];

        int[] paresNumbers = new int[choose];

        for(int i = 0; i < vector.length; i++){
            System.out.print("Enter a number: ");
            vector[i] = scanner.nextInt();
        }

        for(int i = 0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                paresNumbers[i] = vector[i];
            }
        }
        System.out.println("Even numbers:");

        for (int i = 0; i < paresNumbers.length; i++){
            if (paresNumbers[i] != 0){
                System.out.print(paresNumbers[i] + " ");
            }
        }
    }
}