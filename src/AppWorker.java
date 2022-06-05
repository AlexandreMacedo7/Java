import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AppWorker {
    public static void main(String [] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departament = sc.nextLine();
        System.out.println("Enter worker data:");
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        EnWorkerLevel level = EnWorkerLevel.valueOf(sc.next());
        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();
                                                                //Composição com Deparmento.
        EntWorker worker = new EntWorker(name,level, baseSalary, new EntDepartament(departament));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter contract #"+ i +" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date dateContract = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valueHours = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            EntHourContract contract = new EntHourContract(dateContract, valueHours, hours);//Passado para a entidade EntHourContract
            worker.addContract(contract);//adicionando esse contrao a lista de "worker"
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));//1 a mais sempre
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}
