import java.util.ArrayList;
public class Order {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private static int totalOrders = 0;


    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        totalOrders++;
    }


    public void addItem(String item, double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        items.add(item);
        prices.add(price);
        System.out.println("Item '" + item + "' added successfully");
    }


    public double getTotalAmount() {
        double sum = 0.0;
        for (double p : prices) {
            sum += p;
        }
        return sum;
    }


    public String getOrderSize() {
        int count = items.size();
        if (count == 0) return "Empty order";
        else if (count <= 3) return "Small";
        else if (count <= 6) return "Medium";
        else return "Large";
    }


    public void addMultipleItems(String[] items, double... prices) {
        if (items.length != prices.length) {
            throw new IllegalArgumentException("Items and prices count mismatch");
        }
        System.out.print("Items added: ");
        for (int i = 0; i < items.length; i++) {
            try {
                addItem(items[i], prices[i]);
                if (i < items.length - 1) {
                    System.out.print(items[i] + ", ");
                } else {
                    System.out.println(items[i]);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    public static int getTotalOrders() {
        return totalOrders;
    }


    public String displayOrder() {
        return "Order for " + customerName + ": "
                + getItemCount() + " items, Total: $"
                + String.format("%.2f", getTotalAmount())
                + ", Size: " + getOrderSize();
    }

    public int getItemCount() {
        return items.size();
    }

    @Override
    public String toString() {
        return displayOrder();
    }
}

