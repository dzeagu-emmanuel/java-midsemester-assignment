package question4;

class ArrayStack implements Stack {
    private final int[] stackArray;
    private int top;
    private final int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int item) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full. Cannot push " + item);
        }
        stackArray[++top] = item;
    }

    @Override
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot pop.");
        }
        return stackArray[top--];
    }

    @Override
    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot peek.");
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }
}
