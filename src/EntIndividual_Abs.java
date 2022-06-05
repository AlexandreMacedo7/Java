public class EntIndividual_Abs extends EntTaxPayer_Abs{

    private Double healthExpenditures;

    public EntIndividual_Abs(){}

    public EntIndividual_Abs(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double income = 0.0;
        if (getAnualIncome() > 20000.0){//se renda maior que 20k
             income = getAnualIncome() * 0.25;//income recebe- renda * 2.5(25%)
             if(getHealthExpenditures() > 0.0){//se gasto c/ saude maior que 0
                    income += - getHealthExpenditures() * 0.5;}//income recebe income - 50% de gasot c/ saude;
        }
        else {//se renda menor que 20k
            income = getAnualIncome() * 0.15; //incomece recebe renda * 1.5(15%)
            if(getHealthExpenditures() > 0.0){//se gastos c/ suade maior que  0.0
                income += - getHealthExpenditures() * 0.5;// income recebe income - menos gastos c/ saude * 5.0(50%)
            }
        }
        return income;
    }
}
