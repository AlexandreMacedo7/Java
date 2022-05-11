import java.util.Locale;
import java.util.Scanner;

public class VetorAltura {
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade para medir altura: ");
        int n = sc.nextInt();

        double[] vect = new double[n];//inicialização de vetor com parametro de valor de "n"

        for(int i = 0; i < n; i++) {//enquanto "i" for menor que "n"
            System.out.print("Digite as alturas: ");
            vect[i] = sc.nextDouble();//vetor obtem o valor de "i" para usar como referencia para as posições dele;
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++ ) {
            soma += vect[i];//soma recebe ela mesmo mais o valores contidos em cada vetor, que vão se alterar a cada mudança de "i";
        }

        double media = soma/n;

        System.out.printf("Média das alturas: %.2f", media);

        sc.close();
    }
}
