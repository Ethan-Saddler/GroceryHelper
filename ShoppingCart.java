public class ShoppingCart {
    private Dairy[] dairyItems;
    private Bakery[] bakeryItems;

    public ShoppingCart(dairyItems, bakeryItems) {
        this.dairyItems = dairyItems;
        this.bakeryItems = bakeryItems;
    }
    public ShoppingCart() {
        this.bakeryItems = new Bakery[2];
        this.bakeryItems[0] = Bakery("Bread", 1, 5.99);
        this.dairyItems = new Dairy[4];
    }
    public static void addDairyItemAtIndex(index, Dairy) {
        if (dairyItems[index] != null) {
            System.out.printf("There was %")
        }
        dairyItems[index] = Dairy;

    }
}
