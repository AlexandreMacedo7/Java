import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppTaxPayer_Abs {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EntTaxPayer_Abs> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char opc = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (opc == 'i'){
                System.out.print("Health expenditures: ");
                Double helthExpenditures = sc.nextDouble();
                list.add(new EntIndividual_Abs(name, anualIncome, helthExpenditures));
            }
            else if (opc == 'c'){
                System.out.print("Number of employees: ");
                Integer numberEmployees = sc.nextInt();
                list.add(new EntCompany_Abs(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("Taxes Paid");

        double totalIncome = 0.0;
        for (EntTaxPayer_Abs tax : list){
            System.out.println(tax.getName() + String.format(" $ %.2f",tax.tax()));
            totalIncome += tax.tax();
        }
        System.out.println();
        System.out.print(String.format("TOTAL TAXES: %.2f", totalIncome));
        sc.close();
    }
}
