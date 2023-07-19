public class OrderProcessor {
    public void placeOrder(ShoppingCart shoppingCart){
        System.out.println("Items :-");
        for(CartItem cartItem:shoppingCart.getItems()){
            System.out.println("amount : "+cartItem.getAmount()+", name : "+cartItem.getProduct().getName()+", price : "+cartItem.getProduct().getPrice());
        }
        System.out.println("---------------------------------------------");
        System.out.println("total cost : "+shoppingCart.getTotalCost());
    }
}
