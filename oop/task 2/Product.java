public class Product {
    private final String name;
    private final double price;
    public long id;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = (long) (Math.random() * (1000000));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
