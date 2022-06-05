public class EntSavingsAccount  extends EntAccount{//public final class EntSavingsAccount - final evita que ocorra a criação de uma subclasse
    private Double interestRate;

    EntSavingsAccount(){
        super();
    }

    public EntSavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;//Calculo da poupança + taxa de juros;
    }

    @Override//Usado para especificar que o metoto abaixo, ira usar o mesmo modelo da super classe, pórem ira altera-lo do seu jeito.
    public final void withdraw(Double amount){
        balance -= amount;
    }
    //@Override//final evita que o método seja sobreposto.
    //    public final void withdraw(Double amount){
    //        balance -= amount;
    //    }
}