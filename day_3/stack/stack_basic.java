public class stack_basic {
    private static final int MAX_SIZE = 100;
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public StackExample() {
        arr = new int[MAX_SIZE];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow! Can't push " + value);
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed onto the stack");
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Can't pop from an empty stack");
        } else {
            System.out.println(arr[top--] + " popped from the stack");
        }
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Empty stack, nothing to print");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if the stack is empty
    private boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    private boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Main method for testing
    public static void main(String[] args) {
        StackExample myStack = new StackExample();

        myStack.push(42);
        myStack.push(1337);
        myStack.push(99);

        myStack.printStack();

        myStack.pop();
        myStack.printStack();
    }
}
