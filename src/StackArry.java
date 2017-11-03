public class StackArry<T> implements Stack<T> {

    private int top;
    private int maxSize;
    private T[] array;

    public StackArry(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
    }

    @Override
    public void push(T element) {
        if (!isFull()) {
            array[++top] = element;
        }
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return array[top--];
        }
        return null;
    }

    @Override
    public T peek() {
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }


}
