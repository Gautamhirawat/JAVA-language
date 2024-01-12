import java.util.Scanner;

public class FixedSizeStack {
    private int[] stack;
    private int top;
    private int capacity;

    public FixedSizeStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (top < capacity - 1) {
            stack[++top] = item;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();

        FixedSizeStack stack = new FixedSizeStack(capacity);

        System.out.print("Enter elements to push (space-separated): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()

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
