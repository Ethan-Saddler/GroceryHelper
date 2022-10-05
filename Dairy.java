public class Dairy {
    private String product;
    private int quantity;
    private float cost;
    private int daysToExpiration;
    private boolean isConsumable;

    public Dairy(product, quantity, cost, daysToExpiration) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.daysToExpiration = daysToExpiration;
    }
    public Dairy(product, quantity) {
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
}