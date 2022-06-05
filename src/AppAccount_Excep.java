import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AppAccount_Excep {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double limit = sc.nextDouble();

            //Instanciação da conta
            EntAccount_Excep account = new EntAccount_Excep(number, name, balance, limit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);//Saque

            System.out.println(account);
        }
        catch (InputMismatchException e){
            System.out.print("Value Incorret");
        }
        catch (Excep_Account e){
            System.out.print("Withdraw error: "+ e.getMessage());
        }
        sc.close();
    }
}
