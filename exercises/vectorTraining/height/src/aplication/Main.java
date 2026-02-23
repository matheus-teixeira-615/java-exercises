package aplication;

import entities.People;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people will be typed: ");
        int peopleNumbers = scanner.nextInt();

        People[] vector = new People[peopleNumbers];
        for (int i = 0; i < vector.length; i ++){
            System.out.printf("data of %d person:\n", i + 1);

            System.out.print("name: ");
            String name = scanner.next();

            System.out.print("Age: " );
            int age = scanner.nextInt();

            System.out.print("Height: " );
            float height = scanner.nextFloat();

            vector[i] = new People(name, age, height);
        }
        float sum = 0;
        for (int i = 0; i < vector.length; i ++){
            sum += vector[i].getHeight();
        }
        // A média tem que ser fora do escopo do for, pois ela precisa da soma total.
        float averageHeight = sum / vector.length;
        System.out.printf("Average Height: %.2f\n", averageHeight);

        float lessAge = 0;
        String lessName = "";
        for (int i = 0; i < vector.length; i ++){
            if (vector[i].getAge() < 16){
                lessAge += 1;
                lessName += vector[i].getName() + "\n";
            }
        }
        float totalLessAge = (lessAge / vector.length) * 100;
        System.out.printf("People with less of 16 years: %.1f%%\n", totalLessAge);
        System.out.println(lessName);
    }
}