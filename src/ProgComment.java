import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgComment {

    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//formatação de dia e hora

        EntComment c1 = new EntComment("Have a nice trip!");//Comentario1
        EntComment c2 = new EntComment("Wow that's awesome! ");//Comentario2
        EntPost p1 = new EntPost(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComent(c1);//comentarios
        p1.addComent(c2);//comentarios


        EntComment c3 = new EntComment("Good night");
        EntComment c4 = new EntComment("May the Force be with you");
        EntPost p2 = new EntPost(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComent(c3);
        p2.addComent(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}