import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EntReservation_Exep {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public EntReservation_Exep(Integer roomNumber, Date checkIn, Date checkOut) throws Domain_Excep_Reservation{
        //Verificação de erro logo nos primeiros dados
        if (!checkOut.after(checkIn)) {//Se chekOut NÃO for depois da data de chekIn, então...
            throw new Domain_Excep_Reservation("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    //Metodo para contagem de noites
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();//Diff pega os os dias em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//Time unit converte os milissegundos em dias
    }

    //Metodo para atualização de reserva
    public void updateDates(Date checkIn, Date checkOut) throws Domain_Excep_Reservation{
        //Ou trato as exceções ou propago no metoto
        //Como esse metodo lança uma excessão, propago-se ele com "TROWS" - Ja que ele pode dar uma exceção, e não é preciso trata-lo aqui
        Date now = new Date();//now  = recebe a data atual do sistema.
        if (checkIn.before(now) || checkOut.before(now)){//Se checkIN OU checkOut for antes que now(Data atual do sistema)
            throw new Domain_Excep_Reservation("Reservation dates for updates must be futures dates!");//Tratemento traz a mensagem.
        }
        if (!checkOut.after(checkIn)) {//Se chekOut NÃO for depois da data de chekIn, então...
            throw new Domain_Excep_Reservation("Check-out date must be after check-in date");
        }
    }
    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + " Check-in: "
                + sdf.format(checkIn)
                + ", Check-Out: "
                + sdf.format(checkOut)
                +", "
                + duration()
                + " nigths";
    }

}
