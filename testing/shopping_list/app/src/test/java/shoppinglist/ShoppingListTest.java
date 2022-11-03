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
}