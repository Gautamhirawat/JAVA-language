import java.util.Scanner;

public class TwoStacks {
    private int[] stack;
    private int top1;
    private int top2;
    private int capacity;

    public TwoStacks(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top1 = -1;
        this.top2 = capacity;
    }

    public void push1(int item) {
        if (top1 < top2 - 1) {
            stack[++top1] = item;
        } else {
            System.out.println("Stack Overflow for Stack 1");
        }
    }

    public void push2(int item) {
        if (top1 < top2 - 1) {
            stack[--top2] = item;
        } else {
            System.out.println("Stack Overflow for Stack 2");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            return stack[top1--];
        } else {
            System.out.println("Stack 1 Underflow");
            return -1; // or throw an exception
        }
    }

    public int pop2() {
        if (top2 < capacity) {
            return stack[top2++];
        } else {
            System.out.println("Stack 2 Underflow");
            return -1; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements for stack 1 (space-separated): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()

        TwoStacks stack = new TwoStacks(10);

        String[] elements1 = scanner.nextLine().split(" ");
        for (String element : elements1) {
            stack.push1(Integer.parseInt(element));
        }

        System.out.print("Enter elements for stack 2 (space-separated): ");
        String[] elements2 = scanner.nextLine().split(" ");
        for (String element : elements2) {
            stack.push2(Integer.parseInt(element));
        }

        System.out.println("Popped elements from stack 1:");

        while (true) {
            int popped = stack.pop1();
            if (popped == -1) {
                break;
            }
            System.out.println(popped);
        }

        System.out.println("Popped elements from stack 2:");

        while (true) {
            int popped = stack.pop2();
            if (popped == -1) {
                break;
            }
            System.out.println(popped);
        }

        scanner.close();
    }
}
