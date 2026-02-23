import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students will be typed ? ");
        int typed = scanner.nextInt();
        String[] names = new String[typed];
        float[] grades = new float[typed];

        for (int i = 0; i < names.length; i ++){
            System.out.printf("Enter a name, first and second grade of the %d° student: \n", i+1);
            scanner.nextLine();
            names[i] = scanner.nextLine();

            float grade1 = scanner.nextFloat();
            float grade2 = scanner.nextFloat();
            grades[i] = (grade1 + grade2) / 2;
            }
        System.out.println("Students approved:");
        for (int i = 0; i < names.length; i ++){
            if (grades[i] >= 6.0){
                System.out.println(names[i]);
            }
        }
        scanner.close();
    }
}