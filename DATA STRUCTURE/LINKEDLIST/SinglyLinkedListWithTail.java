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

public class SinglyLinkedListWithTail {
    private Node head;
    private Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        System.out.print("The entered singly linked list with tail is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedListWithTail list = new SinglyLinkedListWithTail();

        System.out.print("Enter the number of elements in the singly linked list with tail: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the singly linked list with tail:");
        for (int i = 0; i < size; i++) {
            list.insert(scanner.nextInt());
        }

        list.display();
        scanner.close();

    }
}
