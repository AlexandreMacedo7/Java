import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppReservation_Exep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Recebimento de dados
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date chekIng = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date chekOut = sdf.parse(sc.next());

            //Instanciação de objeto EntResrvation
            EntReservation_Exep reservation = new EntReservation_Exep(number, chekIng, chekOut);
            System.out.println("Reservation " + reservation);//impressão de dados da reserva

            //Atualização de dados da reserva
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            chekIng = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            chekOut = sdf.parse(sc.next());

            //Instanciação de atualização de dados da reserva
            reservation.updateDates(chekIng, chekOut);
            System.out.println("Reservation " + reservation);
        }
        catch (ParseException e){//tratamento de exceção de Parse - causado pela data
            System.out.println("Invalid date format");
        }
        catch (Domain_Excep_Reservation e){//Quando a data passada é anterior a data da primeira reserva - Ou seja, precisa ser uma data atual
            System.out.println("Error in reservation: "+ e.getMessage());
        }
        catch (RuntimeException e){//Erro generico caso a Exceção seja do RuntimeExeption
            System.out.println("Unexpected error! ");
        }

        sc.close();
    }
}
