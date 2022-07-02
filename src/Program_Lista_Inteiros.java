import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program_Delimitados {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        String path = "C:\\Users\\Alexandre Macedo\\Documents\\Java_Udemy\\Material_Java\\Files\\inteiros.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            Integer x = Ex_CalculationService.max(list);
            System.out.println("Max");
            System.out.println(x);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
