import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int quantosNumeros = scanner.nextInt();

        int[] vetor = new int[quantosNumeros];

        for (int i = 0; i < vetor.length; i ++){
            System.out.println("Digite um numero:");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < vetor.length; i ++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}