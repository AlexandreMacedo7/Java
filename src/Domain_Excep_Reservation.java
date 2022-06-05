public class Domain_Excep_Reservation extends Exception{//precisa ser tratada - RumTimeException não precisa

    public Domain_Excep_Reservation(String msg){
        super(msg);//Informando que ao instanciar se pode passar uma mensagem.
    }
}
