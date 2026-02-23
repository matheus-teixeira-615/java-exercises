import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = scanner.next();

        System.out.println("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = scanner.nextInt();

        Product newProduct = new Product(name, price, quantity);
        System.out.printf("Product data: %s, $: %.2f, %d units, Total: $ %.2f\n",
                newProduct.getName(),
                newProduct.getPrice(),
                newProduct.getQuantity(),
                newProduct.totalValueInStock());

        System.out.println("Enter the number of products to be added in stock: ");
        int stock = scanner.nextInt();
        newProduct.addProducts(stock);

        System.out.printf("Updated data: %s, $: %.2f, %d units, Total: $ %.2f\n",
                newProduct.getName(),
                newProduct.getPrice(),
                newProduct.getQuantity(),
                newProduct.totalValueInStock());

        System.out.println("Enter the number of products to be removed from stock: ");
        int remove = scanner.nextInt();
        newProduct.removeProducts(remove);
        System.out.printf("Updated data: %s, $: %.2f, %d units, Total: $ %.2f\n",
                newProduct.getName(),
                newProduct.getPrice(),
                newProduct.getQuantity(),
                newProduct.totalValueInStock());
    }
}