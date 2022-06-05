public class EntOutsourcedEmployee_pol extends EntEmployee_pol{

    private Double additionalCharge;

    EntOutsourcedEmployee_pol(){}

    public EntOutsourcedEmployee_pol(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;//110%
    }
}
