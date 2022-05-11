import java.util.Scanner;

public class ParImparIF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V;

        System.out.print("Digite um valor para conferência: ");
        V = sc.nextInt();

        if(V % 2 == 0) {
            System.out.print("Número Par.");
        }
        else {
            System.out.print("Número Impar.");
        }


        sc.close();
    }
}
