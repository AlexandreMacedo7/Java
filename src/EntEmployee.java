public class EntEmployee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;

    }

    public void increaseSalary(double percentage) {
        this.grossSalary  = (percentage/100 * grossSalary);

    }

    public String toString(){
        return
                String.format("Name: %s%n", name)
                        + String.format("Salário Bruto: %.2f%n", netSalary());
    }
}
