package stack;

public class CustomStack<T> {
    Object[] arr;
    int top;

    public CustomStack(int size) {
        this.arr = new Object[size];
        this.top = -1;
    }

    public static void main(String[] args) {
        CustomStack<Object> stack = new CustomStack<>(5);
        stack.push(1);
        stack.push("world");
        System.out.println("Is stack full? " + (stack.top == stack.arr.length));
        System.out.println(stack.peek());
        stack.push(3);
        stack.push(5);
        stack.push(6);
        System.out.println("Is stack full? " + (stack.top == stack.arr.length - 1));
        stack.push(64);
        System.out.println(stack.peek());
        stack.display();
        System.out.println();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("Is stack full? " + (stack.top == stack.arr.length - 1));
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.display();
        stack.push("Hello World");
        System.out.println("Size of stack: " + stack.size());
    }

    private void push(T object) {
        if (isStackFull(arr, top)) {
            System.out.println("Stack is Full !!");
            return;
        }
        arr[++top] = (T) object;
    }

    private boolean isStackFull(Object[] arr, int currPos) {
        return currPos == arr.length - 1;
    }

    private T peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to peek");
            return null;
        }
        return (T) arr[top];
    }

    private void pop() {
        // check if stack is already empty
        if (top == -1)
            System.out.println("Stack is empty. Nothing to pop.");
        else
            top--;
    }

    private void display() {
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
    }

    private int size() {
        return top + 1;
    }
}
