import java.util.Locale;
import java.util.Scanner;

public class AppEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EntEmployee employee = new EntEmployee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.print(employee);

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentege = sc.nextDouble();
        employee.increaseSalary(percentege);

        System.out.println();
        System.out.print("Update data: \n" + employee);

        sc.close();
    }
}
