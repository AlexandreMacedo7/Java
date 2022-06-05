public class EntCompany_Abs extends EntTaxPayer_Abs{

    Integer numberOfEmployees;

    public EntCompany_Abs(){}

    public EntCompany_Abs(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double incomeCompany = 0.0;
        if(numberOfEmployees > 10){//se n. funcionarios maior que 10
            incomeCompany =  getAnualIncome() * 0.14;//incomeCompany recebe renda * 1.4(14%)
        }
        else {
            incomeCompany += - getAnualIncome() * 0.16;//incomeCompany = ele mesmo - renda * 1.6(16%)
        }
        return incomeCompany;
    }
}
