public class Order {
    private String orderId;
    private String product;
    private int quantity;

    // Constructor to initialize the order details
    public Order(String orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    // Getter methods
    public String getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Product: " + product + ", Quantity: " + quantity;
    }
}
