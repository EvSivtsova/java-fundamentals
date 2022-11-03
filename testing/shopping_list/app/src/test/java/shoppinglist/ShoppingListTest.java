package shoppinglist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class ShoppingListTest {
    @Test
    public void shouldInitializWithEmptyListString() {
        ShoppingList list = new ShoppingList();
        assertEquals("The class initializes with empty list of strings", list.getItems(), new ArrayList<ShoppingItem>());
    }

    @Test
    public void shouldAddNewItemToItems() {
        ShoppingItem mockedItem = mock(ShoppingItem.class);
        ArrayList<ShoppingItem> mockedList = new ArrayList<ShoppingItem>();
        mockedList.add(mockedItem);

        ShoppingList list = new ShoppingList();
        list.addItem(mockedItem);
        assertEquals("Items contain Shopping Item object", mockedList, list.getItems());
        mockedList.clear();
    }

    @Test
    public void shouldAddSeveralItemToItems() {
        ShoppingItem mockedItem1 = mock(ShoppingItem.class);
        ShoppingItem mockedItem2 = mock(ShoppingItem.class);
        ArrayList<ShoppingItem> mockedList = new ArrayList<ShoppingItem>();
        mockedList.add(mockedItem1);
        mockedList.add(mockedItem2);

        ShoppingList list = new ShoppingList();
        list.addItem(mockedItem1);
        list.addItem(mockedItem2);
        assertEquals("Items contain Shopping Item object", mockedList, list.getItems());
        mockedList.clear();
    }
}