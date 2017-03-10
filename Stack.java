/**
 * Created by thoma on 10-Mar-17.
 * Stack interface
 *
 * @param <T> type of the elements of the stack
 */
public interface Stack<T> {
    /**
     * @return true if empty, otherwise false
     */
    boolean isEmpty();

    /**
     * @return the number of elements on the stack
     */
    int size();

    /**
     * pushes an element on the stack
     *
     * @param element
     */
    void push(T element);

    /**
     * @return the top element of the stack and removes it from the stack
     */
    T pop();

    /**
     * @return the top element of the stack
     */
    T top();
}
