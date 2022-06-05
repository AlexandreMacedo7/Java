import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppEmployee_Pol {

    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EntEmployee_pol> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();

        for (int i = 1; i <= numberEmployees; i++){
            System.out.println("Employee #" + i +" data:");
            System.out.print("Outsourced (y/n)? ");
            char opc = sc.next().charAt(0);


                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hours: ");
                Double valuePerHours = sc.nextDouble();

                if(opc == 'y'){//
                System.out.print("Additional charge: ");
                Double addCharge = sc.nextDouble();
                //Adicionando a lista de Outsourced
                list.add(new EntOutsourcedEmployee_pol(name, hours, valuePerHours, addCharge));
                }else {//Adicinando a lista de Employee
                list.add(new EntEmployee_pol(name, hours, valuePerHours));
                }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (EntEmployee_pol emp : list){
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }

}
