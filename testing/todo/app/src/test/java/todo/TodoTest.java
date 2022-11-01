package todo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TodoTest {
    @Test public void startsWithEmptyList() {
        Todo todo = new Todo();
        assertTrue("initialises with an empty list of tasks", todo.tasks.isEmpty());
    }

    @Test public void addsTasks() {
        Todo todo = new Todo();
        ArrayList<String> expectedTasks = new ArrayList<String>();
        expectedTasks.add("Walk the dog");

        assertEquals("todo list contains added task", expectedTasks, todo.addTask("Walk the dog"));
    }
 }
