public abstract class EntTaxPayer_Abs {

    private String name;
    private Double anualIncome;

    public EntTaxPayer_Abs(){}

    public EntTaxPayer_Abs(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    public abstract  Double tax();//classe abstrata
}
