import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntOrder {

    private Date moment;
    private EnOrderStatus status;

    private EntClient client;

    private List<EntOrderItem> items = new ArrayList<>();//Composição para muitos - uso de lista da EntOrderItem

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public EntOrder() {
    }

    public EntOrder(Date moment, EnOrderStatus status, EntClient client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public EnOrderStatus getStatus() {
        return status;
    }

    public void setStatus(EnOrderStatus status) {
        this.status = status;
    }

    //Edição: ADD E REMO DA LISTA
    public void addItem(EntOrderItem item) {
        items.add(item);
    }

    public void removeItem(EntOrder item) {
        items.remove(item);
    }

    public EntClient getClient() {
        return client;
    }

    public void setClient(EntClient client) {
        this.client = client;
    }

    //metodo
    public Double total() {
        double sum = 0.0;
        for (EntOrderItem it : items){//varrendo EntOrder e encontrando o items
            sum += it.subTotal();
        }
        return sum;
    }

    public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append("Order Moment: ");
       sb.append(sdf.format(moment)+ "\n");
       sb.append("Order Status: ");
       sb.append(status + "\n");
       sb.append("Clint:");
       sb.append(client + "\n");
       sb.append("Order items: ");
       for(EntOrderItem item : items){//varrendo os itens
           sb.append(item + "\n");
       }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}