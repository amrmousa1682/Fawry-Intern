## Online Shop System

This is a Java application that simulates an online shop system where users can add products to a shopping cart, view the total cost, and place an order. The system has the following classes:

1. Product: A class that represents individual products. Each product has a name and a price.

2. ShoppingCart: A class that manages the shopping cart functionality. It has methods to add and remove items, calculate the total cost, and retrieve the items in the cart.

3. OrderProcessor: A class that handles order processing. It has a placeOrder method that prints the order details (each item and price) and the total cost for the cart.

4. In the main method of the `Main` class, we create some sample products, create a shopping cart, and then add products to the cart. Finally, we create an instance of the `OrderProcessor` class and use it to place the order, which will print the order details.

## How to Run

To run the application, follow the steps below:

1. Open a terminal or command prompt in the project directory.
2. Compile the `Main.java` file by running the command `javac Main.java`.
3. Run the `Main` class by executing the command `java Main`.