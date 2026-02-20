
class ProductPrice {

    private double price;

    public void setPrice(
            double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public double getPrice() {
        return price;
    }
}

public class Product {

    public static void main(String[] args) {
        ProductPrice p = new ProductPrice();
        p.setPrice(3000);
        System.out.println("Price: " + p.getPrice());
    }
}
