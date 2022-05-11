import java.util.Scanner;

public class AppSoma {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        EntSoma soma = new EntSoma();
        int  n1, n2;

        System.out.println("Digite o valor 1:");
        soma.n1 = sc.nextInt();

        System.out.println("Digite o valor 2:");
        soma.n2 = sc.nextInt();

        System.out.println(soma.soma());
    }

}
