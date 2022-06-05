public class EntCircle_Abs extends EntShape_Abs{

    private Double radios;

    public EntCircle_Abs(){
        super();
    }

    public EntCircle_Abs(EnuColor_Abs color, Double radios) {
        super(color);
        this.radios = radios;
    }
    public Double getRadios() {
        return radios;
    }

    public void setRadios(Double radios) {
        this.radios = radios;
    }
    //implementação de metodo abstrado da classe EntShape
    @Override
    public double area() {
        return Math.PI * radios * radios;
    }
}
