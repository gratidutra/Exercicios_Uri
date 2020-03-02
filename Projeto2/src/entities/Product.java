package entities;

public class Product {

    /**
     * esse atributo só poderá ser acessado por outras
     * classes dentro do mesmo package
     */
    String name;
    private double price;
    private int quantity;


    /**
     * construtor padrão
     */

    public Product(){

    }

     /**
     * Construtor1
     */
    public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    }

    /**
     * sobrecarga
     *
     */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){ ///proteção do objeto do
        // quantidade do produto
        return quantity;      ///só pode ser alterada pela entrada e saida do estoque
    }

    public double totalValueInStock(){
        return price*quantity;
    }

    /**
     * entrada no estoque
     * @param quantity
     */
    public void addProducts(int quantity){
        this.quantity+=quantity;
    }

    /**
     * saida no estoque
     */
    public void removeProducts(int quantity){
        this.quantity-=quantity;
    }
    public String toString( ){
    return name
            + " , $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " unidades, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }

}
