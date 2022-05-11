import java.util.Scanner;

public class SenhaWhile {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int password;

        System.out.print("Digite a senha: ");
        password = sc.nextInt();


        while(password != 2002){

            System.out.print("Incorreta. Digte a senha novamente: ");
            password = sc.nextInt();
        }

        System.out.print("Senha correta! Bem vindo!");

        sc.close();
    }

}
