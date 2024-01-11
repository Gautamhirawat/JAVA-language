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

public class SelfAdjustingList {
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

    public void moveToFront(int key) {
        if (head == null || head.data == key) {
            return; // No need to adjust
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return; // Key not found
        }

        // Adjust the list by moving the found node to the front
        prev.next = current.next;
        current.next = head;
        head = current;
    }

    public void display() {
        Node current = head;
        System.out.print("The entered self-adjusting list is: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SelfAdjustingList list = new SelfAdjustingList();

        System.out.print("Enter the number of elements in the self-adjusting list: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the self-adjusting list:");
        for (int i = 0; i < size; i++) {
            list.insert(scanner.nextInt());
        }

        System.out.print("Enter the element to move to the front: ");
        int key = scanner.nextInt();

        list.moveToFront(key);
        list.display();
        scanner.close();

    }
}
