import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramFile_Exep {
    public static void main(String[] Args){

        //Declaração de tipo de documento - Caminho para o documento
        File file = new File("C:\\Users\\Alexandre Macedo\\Documents\\Java_Udemy\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);//Scanner também pode apontar arquivos
            while (sc.hasNextLine()){//Comando para leitura das linhas
                System.out.println(sc.nextLine());//de um documento
            }
        }
        catch (FileNotFoundException e){//Caso o documento não exista, apresente a mensagem:
            System.out.println("Error opening file: " + e.getMessage());//Puxa a mensagem padrão
        }
        finally {//Indepedente de os metodos daram certo ou não, o finally - ocorre. - No caso, fechando o arquivo
            if(sc != null){//se o sc for diferente de null
                sc.close();//feche o programa
            }
            System.out.println("Finalyy block executed!");
        }

    }
}
