public class EntLoja {
    private String name;
    private double price;
    public int quantity;

    //contrutuor
    public EntLoja() {//padrão
    }

    public EntLoja(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //sobrecarga
    public EntLoja(String name, double price) {

        this.name = name;
        this.price = price;
    }
    //get e sets//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //metodos de calculo;
    public double totalValueInStock() {
        return price * quantity;//retorna um valor;
    }

    public void addProducts(int quantity) {//apenas altera sem retorno;
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units , Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
