import java.util.Scanner;

public class Ex_Program_PrintSever {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Ex_PrintServer<String> ps = new Ex_PrintServer<>();//Tipo especifico<...>

        System.out.print("How many values: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
