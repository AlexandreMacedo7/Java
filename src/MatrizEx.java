import java.util.Scanner;

public class MatrizEx {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz: ");
        System.out.print("Linha: ");
        int l = sc.nextInt();
        System.out.print("Coluna: ");
        int c = sc.nextInt();
        int[][] matriz = new int[l][c];
        System.out.println("Digite os valores da Matriz:");

        for(int i = 0; i < matriz.length; ++i) {//linha
            for(int j = 0; j < matriz[i].length; ++j) {//coluna
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Vefique a posição de : ");
        int x = sc.nextInt();

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == x){
                    System.out.println("Posição: " + i +" - " + j);
                    if(j > 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Acima " + matriz[i - 1][j]);
                    }
                    if(j < matriz[i].length-1){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if(i < matriz.length - 1){
                        System.out.println("Abaixo: " +  matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}

