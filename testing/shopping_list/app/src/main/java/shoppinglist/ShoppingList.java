package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<ShoppingItem> items = new ArrayList<ShoppingItem>();

    public ShoppingList() {}

    public ArrayList<ShoppingItem> getItems() {
        return this.items;
    }

    public void addItem(ShoppingItem item) {
        this.items.add(item);   
    }

    public static void main() {}
}