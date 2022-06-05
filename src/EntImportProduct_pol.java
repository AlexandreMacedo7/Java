public class EntImportProduct_pol extends EntProduct_pol{
    private Double customsFee;

    public EntImportProduct_pol(){}

    public EntImportProduct_pol(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totalPrice(){
        return getPrice() + customsFee;
    }
    @Override
    public String priceTag(){
        return getName() + " $ "
                + String.format("%.2f ", totalPrice())
                + String.format(" (Customs fee: $ %.2f ", customsFee)
                + ")";

    }
}
