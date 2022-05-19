import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EntWorker {

    private String name;
    private EntWorkerLevel level;
    private Double baseSalary;

    //Associações
    private EntDepartament departament;
    private List<EntHourContract> contracts = new ArrayList<>(); //lista de contratos

    public EntWorker(){
    }
    //Construtor sem o atributo que possue lista lista
    public EntWorker(String name, EntWorkerLevel level, Double baseSalary, EntDepartament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntWorkerLevel getLevel() {
        return level;
    }

    public void setLevel(EntWorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public EntDepartament getDepartament() {
        return departament;
    }

    public void setDepartament(EntDepartament departament) {
        this.departament = departament;
    }

    public List<EntHourContract> getContracts() {
        return contracts;
    }

    //Metodos
    public void addContract(EntHourContract contract){//classe contrato recebe na lista "contracts" mais contract
        contracts.add(contract);
    }
    public void remContract(EntHourContract contract){
        contracts.remove(contract);
    }
    //Metodo Salario + contratos

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(EntHourContract c: contracts){//pecorrer a lista contratos com forwith
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
