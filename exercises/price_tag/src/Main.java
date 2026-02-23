import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productsList = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numberProducts = scanner.nextInt();

        for (int i = 0; i < numberProducts; i ++){
            System.out.println("Product #" + (i+1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProducts = scanner.next().charAt(0);
            scanner.nextLine();

            if (typeProducts == 'i'){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                productsList.add(new ImportedProduct(name, price, customsFee));
            }
            else if (typeProducts == 'u') {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("manufacture date (DD/MM/YYYY): ");
                String dateStr = scanner.next();
                LocalDate date = LocalDate.parse(dateStr, fmt);
                productsList.add(new UsedProduct(name, price, date));
            }
            else if (typeProducts == 'c'){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                productsList.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product p: productsList){
            System.out.println(p.priceTag());
        }

    }
}