public class EntAccount {

    private Integer number;
    private String holder;
    protected Double balance;//permite que a subclasse EntBusinessAccount = acesse ela;

    public EntAccount(){}

    public EntAccount(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    //metodo de retirada e deposito
    public void withdraw(Double amount){
        balance -= amount + 5;
    }
    public void deposit(Double amount){
        balance += amount;
    }
}
