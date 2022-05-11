public class EntConta {

    private String name;
    private int cont;
    private double sald;
    public static final double DESCONT= 5.00;

    //construtor
    public EntConta(String name, int cont, double saldinicial) {
        this.name = name;
        this.cont = cont;
        depcont(saldinicial);//Chamando a operação de deposito
    }
    public EntConta(String name, int cont) {
        this.name = name;
        this.cont = cont;
    }
    //get  --  set
    public String getName() {//busca name;
        return name;
    }
    public void setName(String name) {//alteração name;
        this.name = name;
    }
    public double getSald() {//busca saldo
        return sald;
    }

    public int getCont() {//busca conta;
        return cont;
    }

    //calculos

    public void depcont(double deposito) {
        sald += deposito;
    }

    public void retcont(double retirada) {
        sald -= retirada + DESCONT;
    }
    public String toString(){
        return  "Conta: " + cont +
                "\nNome: " + name +
                String.format("%nSaldo: %.2f", sald);
    }
}
