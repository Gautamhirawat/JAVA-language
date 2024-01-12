import java.util.Scanner;

public class LinkedStack {
    private Node top;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top != null) {
            int data = top.data;
            top = top.next;
            return data;
        } else {
            System.out.println("Stack Underflow");
            return -1; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements to push (space-separated): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()

        LinkedStack stack = new LinkedStack();

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
