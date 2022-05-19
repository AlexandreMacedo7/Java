import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AppWorker {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// Formatação para digitação

        //Recibimento de dados
        System.out.print("Enter department's name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();

        //Instanciação de EntWorker                  Transformação de Sring em Enum                     //Instanciação de departamento
        EntWorker worker = new EntWorker(workerName, EntWorkerLevel.valueOf(workerLevel), baseSalary, new EntDepartament(departamentName));

        //Numeros de contratos

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter contract #"+ i + "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());//recebendo data por meio de digitação
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            EntHourContract contract = new EntHourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);//associando EntWorker ao EntHourContract - ou seja a lista;
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,1));//recorte de String
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+ worker.getName());
        System.out.println("Departament: "+worker.getDepartament().getName());//Departamento - nome em departamento;
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}

