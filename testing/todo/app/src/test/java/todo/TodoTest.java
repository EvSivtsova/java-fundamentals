package todo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TodoTest {
    @Test public void startsWithEmptyList() {
        Todo todo = new Todo();
        assertTrue("initialises with an empty list of tasks", todo.tasks.isEmpty());
    }
}
