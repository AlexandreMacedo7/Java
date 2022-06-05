import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AppProduct_pol {
    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<EntProduct_pol> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");

            System.out.print("Common, used or imported (c/u/i)? ");
            char opc = sc.next().charAt(0);

            System.out.println();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (opc == 'c'){
                list.add(new EntProduct_pol(name, price));


            }
            else if(opc == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manuFactureDate = sdf.parse(sc.next());

                list.add( new EntUseProduct_pol(name, price, manuFactureDate));
            }
            else if(opc == 'i'){
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add(new EntImportProduct_pol(name, price, fee));
            }
        }

        System.out.println();
        System.out.println("Price Tags");
        for(EntProduct_pol prod : list){
            System.out.println(prod.priceTag());
        }


        sc.close();
    }
}
