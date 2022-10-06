public class Bakery {
    private String product;
    private int quantity;
    private double cost;

    public Bakery(String product, int quantity, double cost) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
    }
    public String bakeryProduct() {
        return product;
    }
    public void bakeryPrinter(Bakery obj) {
        System.out.printf("Bakery Product: %s Quantity: %d Cost: %.2f%n", product, quantity, cost);
    }
}
