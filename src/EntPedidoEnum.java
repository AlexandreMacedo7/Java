import java.util.Date;

public class EntPedidoEnum {

    private Integer id;
    private Date momento;
    private StatusPedidoEnum status;

    //Construtor
    public EntPedidoEnum(){
    }
    public EntPedidoEnum(Integer id, Date momento, StatusPedidoEnum status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }
    //get
    public Integer getId() {
        return id;
    }

    public Date getMomento() {
        return momento;
    }

    public StatusPedidoEnum getStatus() {
        return status;
    }
    //set
    public void setId(Integer id) {
        this.id = id;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public void setStatus(StatusPedidoEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EntPedidoEnum\n" +
                "Id = " + id +
                ", Momento = " + momento +
                ", Status = " + status;
    }
}
