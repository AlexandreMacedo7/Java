public class EntAluno {

    public String name;
    public double nota1, nota2, nota3;
    public String sit;

    public double nota(){
        return nota1 + nota2 + nota3;
    }
    public String situacao(){


        if(nota() > 60.00) {
            this.sit = "Final Grade = " + nota() + "\nPASS";
        }
        else {
            this.sit = "Final Grade = " + nota() + "\nFailed\nMissing: " + missing() + " Points";
        }
        return this.sit;
    }
    public double missing() {
        double mis = 0;
        if (nota() < 60) {
            mis = 100.00 - nota();
        }
        return mis;
    }
    public String toString() {
        return situacao();
    }

}
