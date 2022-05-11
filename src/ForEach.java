import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor = new String[]{"Maria", "Bob", "Alex"};//innserção de dados de imediato na lista

        for(String obj: vetor){//Percorre o vetor chamando todos os Strings,
            System.out.println(obj);
        }
        sc.close();
    }
}
