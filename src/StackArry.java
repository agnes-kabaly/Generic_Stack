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
        } else {
            System.out.println("Stack is full, push() isn't possible");
        }
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return array[top--];
        } else {
            System.out.println("Stack is empty, pop() isn't possible");
            return null;
        }
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Stack is empty, peek() isn't possible:");
            return null;
        }
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

    @Override
    public int getSize() {
        return maxSize;
    }

    @Override
    public void display() {
        if (!isEmpty()) {
            System.out.println("Stack:");
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Stack is empty, nothing to display()!");
        }
    }


}
