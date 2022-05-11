import java.util.Locale;
import java.util.Scanner;

public class AppLoja {
    public static void main(String []args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        Double price = sc.nextDouble();

        EntLoja product = new EntLoja(name, price);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(500.00);
        System.out.print("Update price: " + product.getPrice());

        System.out.println("Product Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product Data: " + product);

        sc.close();
    }
}
