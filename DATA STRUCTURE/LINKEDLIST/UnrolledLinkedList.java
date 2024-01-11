package DSA.LINKEDLIST;
import java.util.Scanner;

class UnrolledLinkedList {
    // Define the structure of a node in the unrolled linked list
    static class Node {
        int capacity;
        int size;
        int[] elements;
        Node next;

        Node(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.elements = new int[capacity];
            this.next = null;
        }
    }

    Node head;

    UnrolledLinkedList() {
        head = null;
    }

    // Function to insert an element into the unrolled linked list
    void insert(int data) {
        if (head == null) {
            head = new Node(3); // Adjust the capacity as needed
            head.elements[0] = data;
            head.size++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            if (current.size < current.capacity) {
                current.elements[current.size] = data;
                current.size++;
            } else {
                Node newNode = new Node(3); // Adjust the capacity as needed
                newNode.elements[0] = data;
                newNode.size++;
                current.next = newNode;
            }
        }
    }

    // Function to display the entire unrolled linked list
    void display() {
        Node current = head;
        while (current != null) {
            for (int i = 0; i < current.size; i++) {
                System.out.print(current.elements[i] + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnrolledLinkedList unrolledList = new UnrolledLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Input elements into the unrolled linked list
        System.out.print("Enter the number of elements to insert: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            unrolledList.insert(data);
        }

        // Display the entire unrolled linked list
        System.out.println("The unrolled linked list is:");
        unrolledList.display();
        scanner.close();

    }
}
