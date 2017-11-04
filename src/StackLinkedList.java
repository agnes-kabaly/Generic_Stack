public class StackLinkedList<T> implements Stack<T> {

    private Node<T> first;
    private int top;

    public StackLinkedList() {
        top = 0;
        first = null;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<T>(element, null);
        if (top == 0) {
            first = newNode;
            } else {
            newNode.next = first;
            first = newNode;
        }
        top++;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {

        }
        return null;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return first.getData();
        }
        System.out.println("Stack is empty, peek() isn't possible");
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return top;
    }

    @Override
    public void display() {
        Node<T> node = first;
        System.out.println(node.toString());
    }


}
