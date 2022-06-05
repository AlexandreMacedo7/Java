public class AppAccount {
    public static void main(String[] args) {

        EntAccount acc = new EntAccount(1001, "Alex", 0.0); //Inicialização de Account
        EntBusinessAccount bacc = new EntBusinessAccount(1002, "Maria", 0.0, 500.0);//Inicialização de BusinessAccount

        //UPCASTING

        EntAccount acc1 = bacc; //Atribução do objeto de BusinessAccount para o objeto acc1 da SuperClasse;
        EntAccount acc2 = new EntBusinessAccount(1003, "Bob", 0.0, 200.0);//Atribuição de subclasse para uma variavel da super Classe
        EntAccount acc3 = new EntSavingsAccount(1004, "Anna", 0.0, 0.01);//Atribuição de subclasse para uma variavel da super Classe

        //DOWNCASTING

        EntBusinessAccount acc4 = (EntBusinessAccount) acc2;//Casting Manual, informando que essa variavel acc2, agora sera Business;
        acc4.loan(100.0);//Assim eu posso acessar as funções contidas em Bussines, mesmo que acc2, inicialmente fosse um tipo Account.

        //Conversão não permitida, pois embora acc3 sja Account, ela foi instanciada como SavingsAccount - e uma subclasse não pode receber outra subclasse.
        //EntBusinessAccount acc5 = (EntBusinessAccount) acc3;

        //Teste para saber se são do mesmo tipo
        if(acc3 instanceof EntBusinessAccount){//Se acc3 for do tipo BusinessAccount
            EntBusinessAccount acc5 = (EntBusinessAccount) acc3;//Ele sera atribuido a acc5.
            acc5.loan(200.0);//E acc5 podera executar as funções que acc3 tem acesso.
            System.out.println("Loan!");
        }
        if(acc3 instanceof EntSavingsAccount){//Se acc3 for do tipo SavingsAccount
            EntSavingsAccount acc5 = (EntSavingsAccount) acc3;//então acc5 recebera acc3
            acc5.updateBalance();//e tera acesso as funões e metodos de acc3.
            System.out.println("Update!");
        }
        //Sobreposição
        //Usando Override

        EntAccount acc6 = new EntAccount(1006,"Alexa",1000.0);
        acc6.withdraw(200.0);//operação de saque
        System.out.println(acc6.getBalance());//saldo com desconto de valor 5

        EntAccount acc7 = new EntSavingsAccount(1007,"Marian",1000.0,0.01);//Obj Account recendo Obj SavingsAccount
        acc7.withdraw(200.0);//operação de saque
        System.out.println(acc7.getBalance());//saldo sem desconto, usando @Override, para modificar o tipo padrão de metodo da Entidade Principal

        //Usando o super
        EntAccount acc8 = new EntBusinessAccount(1008,"Boby", 1000.0, 500.0 );
        acc8.withdraw(200.0);//Operação de saque emprasarial, com desconto de 5 da classe Account e mais o desconto de 2 da AccountBusiness
        System.out.println(acc8.getBalance());

        //POLIMORFISMO
        //Var  x é do tipo EntAccount é instanciada como tal e recebe atributos e metodoso da mesma
        //Var y é tipo EntAccout mas é instanciada como uma EntSavigsAccount e recebe atributos e metodos da EntSavingsAccount
        //Por essa razão cada uma, embora EntAccount, terá comportamentos diferentes pois tem métodos e atributos diferentes.

        EntAccount x = new EntAccount(1020, "Alex", 1000.0);//Desconto de 5
        EntAccount y = new EntSavingsAccount(1023, "Maria", 1000.0, 0.01);//Sem Desconto
        x.withdraw(50.0);//Taxa de 5
        y.withdraw(50.0);//Sem taxa

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }

}
