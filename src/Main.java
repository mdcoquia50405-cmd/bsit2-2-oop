public class Main {
    public static void main(String[] args) {
        try {

            Order order1 = new Order("Primo");
            Order order2 = new Order("Bobby");
            Order order3 = new Order("Nancy");


            order1.addItem("Ice Cream", 12.99);
            order2.addItem("Pasta", 10.50);
            order3.addItem("Pizza", 20.48);


            order1.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
            order2.addMultipleItems(new String[]{"Sandwich", "Juice", "Salad"}, 5.75, 2.00, 4.50);
            order3.addMultipleItems(new String[]{"Burger", "Fries", "Juice"}, 8.50, 3.25,9.8);


            try {
                order3.addItem("", 6.00); // Invalid item
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }

            try {
                order3.addItem("Ice Cream", -5.00); // Invalid price
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }

            try {
                order3.addMultipleItems(new String[]{"Tea", "Coffee"}, 2.50); // Mismatched arrays
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }


            System.out.println(order1);
            System.out.println(order2);
            System.out.println(order3);


            System.out.println("Total Orders Created: " + Order.getTotalOrders());


            Order[] allOrders = {order1, order2, order3};
            Order highest = allOrders[0];
            for (Order o : allOrders) {
                if (o.getTotalAmount() > highest.getTotalAmount()) {
                    highest = o;
                }
            }
            System.out.println("Largest Order: " + highest);

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
