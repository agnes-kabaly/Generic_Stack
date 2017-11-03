public interface Stack<T> {

    void push(T element);
    void pop();
    T peek();
    boolean isEmpty();
    boolean isFull();

}
