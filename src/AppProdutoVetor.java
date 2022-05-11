import java.util.Locale;
import java.util.Scanner;

public class AppProdutoVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();

        EntProdutoVetor[] vetor = new EntProdutoVetor[n];// o vetor é do tipo referencia

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Produto: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            vetor[i] = new EntProdutoVetor(nome, preco);//guarda o valor na pocição que corresponde ao valor de "i" em nome e preço no construtor;
        }
        //calculo soma de preços
        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += vetor[i].getPreco();// soma dos valores que estão no vetor, usando i como valor para idenficar a posição;
        }
        double media = soma/n;
        System.out.println();

        System.out.printf("Média de valor: $ %.2f", media);


        sc.close();
}
}
