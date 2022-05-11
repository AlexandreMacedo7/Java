import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppEmpregadoLista {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EntEmpregadoLista> lista = new ArrayList<>();

        System.out.println("Cadastro de empregados: ");
        System.out.print("Digite o número de registros: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println();
            System.out.println("______________________________");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Sálario: ");
            double salario = sc.nextDouble();

            System.out.println();

            lista.add(new EntEmpregadoLista(id, nome, salario));
        }

        //Aumento de Salário
        System.out.println();
        EntEmpregadoLista emp = new EntEmpregadoLista();

        System.out.print("Digite o ID: ");
        Integer id = sc.nextInt();
        EntEmpregadoLista empregado = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (empregado == null){
            System.out.println("ID não Existe");
        }
        else{
            System.out.println("Digite a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            emp.aumento(porcentagem);
        }


        for(EntEmpregadoLista x: lista){
            System.out.println(x);
        }


        sc.close();
    }
}
