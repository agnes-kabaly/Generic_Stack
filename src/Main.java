public class Main {

    public static void main(String[] args) {
        Stack<Integer> stackArray = new StackArry<>(3);
        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.isFull());
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.display();
        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.isFull());
        stackArray.push(12);
        System.out.println(stackArray.peek());
        stackArray.pop();
        System.out.println(stackArray.peek());
        System.out.println(stackArray.isFull());
        stackArray.pop();
        stackArray.pop();
        System.out.println(stackArray.peek());
        stackArray.pop();
        stackArray.pop();
        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.getSize());
        stackArray.display();
        System.out.println(stackArray.peek());
        stackArray.push(12);
        stackArray.display();
        System.out.println(stackArray.getSize());

        System.out.println("\n");

        Stack<Integer> stackLinkedList = new StackLinkedList<>();
        System.out.println(stackLinkedList.isEmpty());
        System.out.println(stackLinkedList.isFull());
        System.out.println(stackLinkedList.peek());
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        System.out.println(stackLinkedList.isEmpty());
        System.out.println(stackLinkedList.isFull());
        System.out.println(stackLinkedList.peek());
        stackLinkedList.display();
        System.out.println(stackLinkedList.getSize());
        stackLinkedList.pop();
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.getSize());
        stackLinkedList.display();
        stackLinkedList.pop();
        stackLinkedList.display();
        stackLinkedList.pop();
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.getSize());
        stackLinkedList.display();
        stackLinkedList.push(33);
        stackLinkedList.display();
        System.out.println(stackLinkedList.getSize());

    }


}
