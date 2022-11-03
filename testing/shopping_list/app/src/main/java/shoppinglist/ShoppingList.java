package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<String> items = new ArrayList<String>();

    public ShoppingList() {}

    public ArrayList<String> getItems() {
        return this.items;
    }

    public void addItem(String item) {
        this.items.add(item);   
    }

    public static void main() {}
}