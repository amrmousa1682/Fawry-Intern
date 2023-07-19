public class Main {
    public static void main(String[] args) {

        Product p1=new Product("p1",1);
        Product p2=new Product("p2",2);
        Product p3=new Product("p3",3);
        Product p4=new Product("p4",4);
        Product p5=new Product("p5",5);
        ShoppingCart cart=new ShoppingCart();
        cart.addItem(p1);
        cart.addItem(p1);
        cart.addItem(p2);
        cart.addItem(p3);
        cart.addItem(p4);
        cart.addItem(p5);
        cart.addItem(p5);
        try {
            cart.removeItem(p5);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            cart.removeItem(p4);
        }
        catch (Exception e){
            System.out.println(e.getMessage()+" ");
        }
        try {
            cart.removeItem(p4);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        OrderProcessor orderProcessor=new OrderProcessor();
        orderProcessor.placeOrder(cart);
    }
}