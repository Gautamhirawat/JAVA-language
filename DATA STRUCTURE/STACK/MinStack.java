import java.util.Scanner;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int item) {
        stack.push(item);
        if (minStack.isEmpty() || item <= minStack.peek()) {
            minStack.push(item);
        }
    }

    public int pop() {
        if (!stack.isEmpty()) {
            int item = stack.pop();
            if (item == minStack.peek()) {
                minStack.pop();
            }
            return item;
        } else {
            System.out.println("Stack Underflow");
            return -1; // or throw an exception
        }
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            System.out.println("MinStack is empty");
            return -1; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MinStack stack = new MinStack();

        System.out.print("Enter elements to push (space-separated): ");
        String[] elements = scanner.nextLine().split(" ");

        for (String element : elements) {
            if (!element.isEmpty()) {
                stack.push(Integer.parseInt(element));
            }
        }

        System.out.println("Popped elements:");

        while (true) {
            int popped = stack.pop();
            if (popped == -1) {
                break;
            }
            System.out.println(popped);
        }

        System.out.println("Minimum element: " + stack.getMin());

        scanner.close();
    }
}
