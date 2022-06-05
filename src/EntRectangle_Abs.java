public class EntRectangle_Abs extends EntShape_Abs{

    private Double whidth;
    private Double height;

    public EntRectangle_Abs(){super();}

    public EntRectangle_Abs(EnuColor_Abs color, Double whidth, Double height) {
        super(color);
        this.whidth = whidth;
        this.height = height;
    }

    public Double getWhidth() {
        return whidth;
    }

    public void setWhidth(Double whidth) {
        this.whidth = whidth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override//sobreposição
    public double area() {
        return whidth * height;
    }
}
