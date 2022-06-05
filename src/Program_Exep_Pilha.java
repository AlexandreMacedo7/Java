import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_Exep_Pilha {


    public static void main(String[] args) {
        method1();//Chama o metodo 1 que usa o metodo 2
        System.out.println("End of program");
    }
    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();//Chama o metodo 2
        System.out.println("***METHOD1 END***");
    }
    public static void method2() {

        System.out.println();
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");//Declaração de vetor separado por espaços
            int position = sc.nextInt();//Posição
            System.out.println(vect[position]);//impressão de posição
        }
        catch (ArrayIndexOutOfBoundsException e) {//tratamento em caso de posição fora do vetor
            System.out.println("Invalid position!");
            e.printStackTrace();//Mostra onde os erros estão acontecendo, sem finalizar o programa
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println();
        System.out.println("***METHOD2 END***");


    }
}
