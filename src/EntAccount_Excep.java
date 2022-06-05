public class EntAccount_Excep {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    EntAccount_Excep(){}

    public EntAccount_Excep(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    //Metodo deposito
    public void deposit(Double amount){
        balance += amount;
    }
    //metodo saque
    public void withdraw(Double amount) throws Excep_Account {
        if (amount > getWithdrawLimit()){
            throw new Excep_Account(" The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new Excep_Account("Not enough balance");
        }

        balance += - amount;
    }

    @Override
    public String toString(){
        return "New balance: "
                + String.format("%.2f ", getBalance());
    }
}
