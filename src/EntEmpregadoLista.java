public class EntEmpregadoLista {

    private Integer id;
    private String nome;
    private Double salario;

    //Constructor

    public EntEmpregadoLista(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public EntEmpregadoLista(){

    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Calc
    public void aumento(double porcentagem){
        this.salario += porcentagem/100 * salario;
    }

    //toString

    public String toString(){
        return id
                + " - "
                + nome
                + ": "
                + salario;
    }
}
