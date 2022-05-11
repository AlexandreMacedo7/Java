import java.util.Scanner;

public class DivisoresFOR {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Conferencia de divisores.\n\nDigite um valor: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            if(n % i == 0) {

                System.out.println(i);
            }
        }

        sc.close();


    }
}
