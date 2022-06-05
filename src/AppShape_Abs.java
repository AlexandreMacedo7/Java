import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppShape_Abs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<EntShape_Abs> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char opc = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            EnuColor_Abs color = EnuColor_Abs.valueOf(sc.next());

            if (opc == 'r'){
                System.out.print("Width: ");
                Double whidth = sc.nextDouble();
                System.out.print("Heigth: ");
                Double heigth = sc.nextDouble();

                list.add(new EntRectangle_Abs(color, whidth, heigth));
            }
            else if(opc == 'c'){
                System.out.print("Radius: ");
                Double radios = sc.nextDouble();

                list.add(new EntCircle_Abs(color, radios));
            }
        }
        System.out.println();
        System.out.println("Shape Areas: ");

        for (EntShape_Abs shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
