package shoppinglist;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingItemTest {
    @Test
    public void testInitializesWithNamePrice() {
        ShoppingItem item = new ShoppingItem("HP Sauce", 4.99);
        assertNotNull("Initializes with name and price", item);
        assertEquals("Item's name is HP Sause", item.name, String.valueOf("HP Sauce"));
        assertEquals("Item's price is 4.99", item.price, Double.valueOf(4.99));
    }
}