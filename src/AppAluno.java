import java.util.Scanner;

public class AppAluno {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        EntAluno aluno = new EntAluno();

        System.out.print("Aluno: ");
        aluno.name = sc.nextLine();
        System.out.println("Notas: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno);

        sc.close();
    }
}
