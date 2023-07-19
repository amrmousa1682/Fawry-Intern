import java.util.ArrayList;

public class ShoppingCart {
    private double totalCost = 0;
    private final ArrayList<CartItem> items = new ArrayList<>();

    public double getTotalCost() {
        return totalCost;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void addItem(Product product) {
        boolean found = false;
        for (CartItem cartItem : items) {
            if (cartItem.getProduct() == product) {
                cartItem.increaseAmount();
                found = true;
                break;
            }
        }
        if (!found) {
            items.add(new CartItem(product));
        }
        totalCost += product.getPrice();
    }

    public void removeItem(Product product) throws Exception {
        boolean found = false;
        for (CartItem cartItem : items) {
            if (cartItem.getProduct() == product) {
                found = true;
                cartItem.decreaseAmount();
                if (cartItem.getAmount() == 0) {
                    items.remove(cartItem);
                    break;
                }
            }
        }
        if(!found){
            throw new Exception(product.getName()+" not found in cart");
        }
        totalCost -= product.getPrice();
    }
}
