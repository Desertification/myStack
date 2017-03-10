/**
 * Created by thoma on 10-Mar-17.
 */

import static org.junit.jupiter.api.Assertions.*;

class StackLLTest {
    private Stack<Integer> stack;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        stack = new StackLL<>();
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @org.junit.jupiter.api.Test
    void pushAndPop() {
        stack.push(1);
        stack.push(2);
        assertEquals(new Integer(2), stack.pop());
        assertEquals(new Integer(1), stack.pop());
    }

    @org.junit.jupiter.api.Test
    void top() {
        stack.push(1);
        assertEquals(new Integer(1), stack.top());
        assertEquals(new Integer(1), stack.top());
    }

    @org.junit.jupiter.api.Test
        // expected annotation did not work
    void popWhenEmpty() {
        try {
            stack.pop();
            throw new RuntimeException("Did not throw");
        } catch (StackEmptyException e) {
        }
    }

    @org.junit.jupiter.api.Test
        // expected annotation did not work
    void topWhenEmpty() {
        try {
            stack.top();
            throw new RuntimeException("Did not throw");
        } catch (StackEmptyException e) {
        }
    }

}