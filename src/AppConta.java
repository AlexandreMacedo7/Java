import java.util.Locale;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        EntConta conta;

        System.out.print("Conta: ");
        int cont = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Deseja fazer depósito? (S/N): ");
        char opc = sc.next().charAt(0);

        if (opc == 'S') {
            System.out.print("Digite o valor do depósito: ");
            double saldinicial = sc.nextDouble();
            conta = new EntConta(name, cont, saldinicial);
        }
        else {
            conta = new EntConta(name, cont);
        }

        System.out.println();
        System.out.print(conta);

        System.out.println();
        System.out.print("Digite valor para deposito: ");
        double deposito = sc.nextDouble();
        conta.depcont(deposito);

        System.out.println();
        System.out.print(conta);

        System.out.println();
        System.out.print("Digite valor para saque: ");
        double retirada = sc.nextDouble();
        conta.retcont(retirada);

        System.out.println();
        System.out.print(conta);


        sc.close();
    }

}
