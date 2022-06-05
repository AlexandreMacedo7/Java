import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class APProgram {

    public static void main(String [] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birtDate =  sdf.parse(sc.next());

        EntClient client = new EntClient(name, email, birtDate);

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        EnOrderStatus status = EnOrderStatus.valueOf(sc.next());

        EntOrder order = new EntOrder(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter #" + i +" item data: ");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();

            EntProduct product = new EntProduct(productName, productPrice);
            EntOrderItem it = new EntOrderItem(productQuantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println(order);

        sc.close();
    }
}
