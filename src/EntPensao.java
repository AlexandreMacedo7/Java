public class EntPensao {
    private String nome;
    private String email;

    public EntPensao(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    //get e set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String toString() {
        return " Nome: "  + nome + ", email: " + email;
    }
}
