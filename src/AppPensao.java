import java.util.Scanner;

public class AppPensao {
    public class pensaoApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            EntPensao[] vetor = new EntPensao[10];

            System.out.print("Pensão Estudantil");
            System.out.println();
            System.out.println();

            System.out.print("Digite o número de locadores: ");
            int n = sc.nextInt();
            System.out.println();


            for (int i = 1; i <= n; i++) {


                System.out.printf("Locador #" + i);
                System.out.println();

                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Quarto: ");
                int quarto = sc.nextInt();
                System.out.println();

                vetor[quarto] = new EntPensao(nome, email);//o valor do quarto vai apontar para nome e email;

            }
            for (int i = 0; i < 10; i++) {
                if (vetor[i] != null) {
                    System.out.println(i + ":" + vetor[i]);
                }
            }

            sc.close();
        }
    }
}