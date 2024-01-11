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

public class SinglyLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        System.out.print("The entered singly linked list is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.print("Enter the number of elements in the singly linked list: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the singly linked list:");
        for (int i = 0; i < size; i++) {
            list.insert(scanner.nextInt());
        }


        list.display();
        scanner.close();

    }
}
