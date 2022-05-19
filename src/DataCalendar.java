import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataCalendar {

    public static void main(String [] args){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        cal.add(Calendar.HOUR_OF_DAY, 4);

        System.out.println(sdf.format(d));

        //minutos

        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("Minutos: " + minutos);

        //mes
        int mes = 1 + cal.get(Calendar.MONTH);// + 1 porque mes começa em zero
        System.out.println("Mês: " + mes);


    }
}
