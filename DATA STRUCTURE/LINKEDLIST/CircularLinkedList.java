package DSA.LINKEDLIST;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        Node current = head;
        System.out.print("The entered circular linked list is: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

        System.out.print("Enter the number of elements in the circular linked list: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the circular linked list:");
        for (int i = 0; i < size; i++) {
            list.insert(scanner.nextInt());
        }

        list.display();
        scanner.close();

    }
}
