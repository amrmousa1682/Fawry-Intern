public class CartItem {
    private final Product product;
    private int amount;

    public CartItem(Product product) {
        this.product = product;
        amount = 1;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void increaseAmount() {
        amount++;
    }

    public void decreaseAmount() {
        amount--;
    }
}
