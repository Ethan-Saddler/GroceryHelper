public class Dairy {
    private String product;
    private int quantity;
    private double cost;
    private int daysToExpiration;
    private boolean isConsumable;

    public Dairy(String product, int quantity, double cost, int daysToExpiration) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.daysToExpiration = daysToExpiration;
    }
    public Dairy(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.cost = 5.59;
        this.daysToExpiration = 5;
    }
    public Dairy() {
        this.product = "yoghurt";
        this.quantity = 4;
        this.cost = 3.99;
        this.daysToExpiration = 3;
    }
    public String dairyProduct() {
        return product;
    }
    public int quantityGetter() {
        return quantity;
    }
    public void quantitySetter(int value) {
        this.quantity = value;
    }
    public void dairyPrinter(Dairy obj) {
        System.out.printf("Dairy Product: %s Quantity: %d Cost: %.2f%n", product, quantity, cost);
    }
}