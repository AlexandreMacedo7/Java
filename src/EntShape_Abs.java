public abstract class EntShape_Abs {//Classe abstrata

    private EnuColor_Abs color;

    public EntShape_Abs(){}

    public EntShape_Abs(EnuColor_Abs color) {
        this.color = color;
    }

    public EnuColor_Abs getColor() {
        return color;
    }

    public void setColor(EnuColor_Abs color) {
        this.color = color;
    }

    public abstract double area();
}
