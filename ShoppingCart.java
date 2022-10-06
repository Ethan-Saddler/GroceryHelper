public class ShoppingCart {
    private Dairy[] dairyItems;
    private Bakery[] bakeryItems;

    public ShoppingCart(Dairy[] dairyItems, Bakery[] bakeryItems) {
        this.dairyItems = dairyItems;
        this.bakeryItems = bakeryItems;
    }
    public ShoppingCart() {
        this.bakeryItems = new Bakery[2];
        this.bakeryItems[0] = new Bakery("Bread", 1, 5.99);
        this.dairyItems = new Dairy[4];
    }
    public Dairy addDairyItemAtIndex(int n, Dairy dairy) {
        if (n + 1 > dairyItems.length) {
            System.out.println("Cannot add Dairy item!");
            return null;
        } else if (dairyItems[n] == null) {
            System.out.printf("%s was added here.%n", dairy.dairyProduct());
            return null;
        } else {
            Dairy original;
            System.out.printf("There was %s here before.%n", dairyItems[n].dairyProduct());
            original = dairyItems[n];
            dairyItems[n] = dairy;
            return original;
        }

    }
    public Bakery removeBakeryItemAtIndex(int n) {
        if (n + 1 > bakeryItems.length) {
            System.out.println("Invalid index entered.");
            return null;
        } else if (bakeryItems[n] == null) {
            System.out.println("No Bakery item exists at this index!");
            return null;
        } else {
            Bakery bruh = bakeryItems[n];
            System.out.printf("%s was removed from the cart.%n", bakeryItems[n].bakeryProduct());
            bakeryItems[n] = null;
            return bruh;
        }
    }
    public void updateDairyQuantity(String name, int quant) {
        if (quant > -1) {
            if (name == null) {
                System.out.println("No such Dairy item exists in the cart!");
            } else {
                for (int i = 0; i < dairyItems.length; i++) {
                    if (((dairyItems[i].dairyProduct()).toUpperCase()).equals(name.toUpperCase())) {
                        System.out.printf("Quantity of %s was updated from ", name);
                        System.out.printf("%d to %d.", dairyItems[i].quantityGetter(), quant);
                        dairyItems[i].quantitySetter(quant);
                        break;
                    } else if (i + 1 == dairyItems.length) {
                        System.out.println("No such Dairy item exists in the cart!");
                    }
                }
            }
        }
    }
    public void displayItems() {
        for (int i = 0; i < dairyItems.length; i++) {
            if (dairyItems[i] == null) {
                System.out.println("null");
            } else {
                dairyItems[i].dairyPrinter(dairyItems[i]);
            }
        }
        for (int i = 0; i < bakeryItems.length; i++) {
            if (bakeryItems[i] == null) {
                System.out.println("null");
            } else {
                bakeryItems[i].bakeryPrinter(bakeryItems[i]);
            }
        }
    }
}
