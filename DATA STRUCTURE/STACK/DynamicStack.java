import java.util.Scanner;

public class DynamicStack {
    private int[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicStack() {
        this.stack = new int[DEFAULT_CAPACITY];
        this.top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            resize();
        }
        stack[++top] = item;
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1; // or throw an exception
        }
    }

    private void resize() {
        int[] newStack = new int[2 * stack.length];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements to push (space-separated): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()

        DynamicStack stack = new DynamicStack();

        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            stack.push(Integer.parseInt(element));
        }

        System.out.println("Popped elements:");

        while (true) {
            int popped = stack.pop();
            if (popped == -1) {
                break;
            }
            System.out.println(popped);
        }

        scanner.close();
    }
}
