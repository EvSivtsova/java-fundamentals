package shoppinglist;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ShoppingListTest {
    @Test
    public void testInitializesWithEmptyListString() {
        ShoppingList list = new ShoppingList();
        assertEquals("The class initializes with empty list of strings", list.getItems(), new ArrayList<String>());
    }

    @Test
    public void testAddsNewItemToItems() {
        ShoppingList list = new ShoppingList();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("HP sauce");

        list.addItem("HP sauce");
        assertEquals("", expectedList, list.getItems());
    }
}