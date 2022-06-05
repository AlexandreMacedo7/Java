import java.text.SimpleDateFormat;
import java.util.Date;

public class EntClient {

    private String name;
    private String email;
    private Date birtDate;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public EntClient(){}
    public EntClient(String name, String email, Date birtDate) {
        this.name = name;
        this.email = email;
        this.birtDate = birtDate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmeil(String email) {
        this.email = email;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public String toString(){
        return "Client: "
                + name
                +(" (")
                + sdf.format(birtDate)
                +(") ")
                +(" - ")
                + email;
    }
}
