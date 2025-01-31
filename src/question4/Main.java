package question4;

public class Main {
    public static void main(String[] args) {
        Stack stack = new ArrayStack(5);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}