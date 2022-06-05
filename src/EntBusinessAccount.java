public class EntBusinessAccount extends EntAccount {

    private Double loanLimit;

    public EntBusinessAccount(){
        super();
    }
    //Construtor com herança
    public EntBusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    //metodo para emprestimo.
    public void loan(Double amount){
        if(amount <= loanLimit){//se o empresitimo estiver dentro do limite, então:
            balance += amount;//deposito
        }
    }
    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);//Usa o metodo de Account para fazer o saque,sem criar seu proprio, porem adiciona sua propria operação, no caso, uma subtração
        balance -= 2;
    }
}
