import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_Exep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Sem tratamento de exceções valores fora do intevalo do vetor - ArrayIndexOutOfBoundsException
        // ou carcteres diferentes do tipo inteiro apresentarão erros - InputMismatchException

        try {
            String[] vect = sc.nextLine().split(" ");//Vetor tipo String com posições separadas pelo 'splip' - o espaço;
            int position = sc.nextInt();//Digite uma posição
            System.out.println(vect[position]);//Imprima a posição digitada do vetor;
        }
        catch (ArrayIndexOutOfBoundsException e){//Se ocorrer erro por valor fora do vetor
            System.out.println("Invalid position: ");
        }
        catch (InputMismatchException e){//Se ocorrer valor diferente de inteiro
            System.out.println("Imput Error ");
        }
        //Com o tratamento de execeção - mesmo que aja erro, o programa seguirá normalmente.
        System.out.println("End of program");

        sc.close();
    }
}
