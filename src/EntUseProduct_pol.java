import java.text.SimpleDateFormat;
import java.util.Date;

public class EntUseProduct_pol extends EntProduct_pol{

    private Date manufactureDate;
    SimpleDateFormat sdf = new SimpleDateFormat(("dd/MM/yyyy"));

    public EntUseProduct_pol(){}

    public EntUseProduct_pol(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName()
                + " (Used) $"
                + String.format("%.2f", getPrice())
                + "(Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
