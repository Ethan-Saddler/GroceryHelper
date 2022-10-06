public class Driver {
    public static void main (String[] args) {
        Dairy[] arr = {new Dairy(), new Dairy("bruh", 2), new Dairy("milk", 4, 4.9f, 9)};
        Bakery[] arry = {new Bakery("gamer", 10, 20.0f), new Bakery("cooki", 4, 7.2f), new Bakery("browne", 3, 2.5f)};
        ShoppingCart cart = new ShoppingCart(arr, arry);
        cart.displayItems();
        System.out.println(cart.addDairyItemAtIndex(1, new Dairy()));
        cart.displayItems();
        cart.removeBakeryItemAtIndex(1);
        cart.displayItems();
        cart.updateDairyQuantity("milk", 69);

    }
}
