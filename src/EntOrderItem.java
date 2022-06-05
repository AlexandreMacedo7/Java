public class EntOrderItem {

    private Integer quantity;
    private Double price;

    private EntProduct product;//composição com Entproducto;

    public EntOrderItem(){}

    public EntOrderItem(Integer quantity, Double price, EntProduct product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EntProduct getProduct() {
        return product;
    }

    public void setProduct(EntProduct product) {
        this.product = product;
    }
    //metodo
    public Double subTotal(){
        return price * quantity;
    }

    public String toString(){
        return
                 getProduct().getName()
                         + ", $"
                         + String.format("%.2f", price) + ", "
                         + " Quantity: "
                         + quantity + ", "
                         + " Subtotal: $"
                         + String.format("%.2f", subTotal());
    }
}
