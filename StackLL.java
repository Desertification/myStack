import myLinkedList.LinkedList;

/**
 * Created by thoma on 10-Mar-17.
 * implements a stack based on a linked list
 */
public class StackLL<T> implements Stack {
    private LinkedList<T> ll;

    /**
     * Creates an empty stack
     */
    StackLL(){
        ll = new LinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        return ll.isEmpty();
    }

    @Override
    public int size() {
        return ll.size();
    }

    @Override
    public void push(Object element) {
        ll.prepend((T) element);
    }

    @Override
    public Object pop() {
        T element = ll.first();
        ll = ll.tail();
        return element;
    }

    @Override
    public Object top() {
        return ll.first();
    }
}
