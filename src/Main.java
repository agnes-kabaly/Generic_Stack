public class Main {

    public static void main(String[] args) {
        Stack<Integer> stackArray = new StackArry<>(3);
        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.isFull());
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
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

    }

}
