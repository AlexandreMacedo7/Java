import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EntWorker {

    private String name;
    private EnWorkerLevel level;
    private Double baseSalary;

    private EntDepartament departament;
    private List<EntHourContract> contracts = new ArrayList<>();

    public EntWorker(){}

    public EntWorker(String name, EnWorkerLevel level, Double baseSalary, EntDepartament departament) {
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

    public EnWorkerLevel getLevel() {
        return level;
    }

    public void setLevel(EnWorkerLevel level) {
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

    public void addContract(EntHourContract contract){
        contracts.add(contract);
    }
    public void removeContract(EntHourContract contract){
        contracts.remove(contract);
    }
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();//declaração de Calendar
        for(EntHourContract c: contracts){
            cal.setTime(c.getDate());//Busca a data de cada contrato e passa para "cal"
            int c_year = cal.get(Calendar.YEAR);//Pega no ano da data que "cal" agora armazena;
            int c_month = 1 + cal.get(Calendar.MONTH);//Pega o mês da data que "Cal" agora armazena;
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
