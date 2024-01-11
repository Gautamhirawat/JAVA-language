package DSA.LINKEDLIST;

import java.util.Scanner;

class XORLinkedList {
    static class Node {
        int data;
        int xorNextPrev;

        Node(int data) {
            this.data = data;
            this.xorNextPrev = 0;
        }
    }

    Node head;

    XORLinkedList() {
        head = null;
    }

    // Function to insert an element into the XOR linked list
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.xorNextPrev = 0;

        if (head == null) {
            head = newNode;
        } else {
            int currentAddr = 0;
            int prevAddr = 0;
            int nextAddr;

            Node current = head;
            Node prev = null;

            while (current != null) {
                nextAddr = prevAddr ^ current.xorNextPrev;

                if (nextAddr == 0) {
                    newNode.xorNextPrev = currentAddr;
                    current.xorNextPrev ^= (prev == null) ? 0 : prevAddr ^ newNode.hashCode();
                    break;
                }

                prev = current;
                prevAddr = currentAddr;
                currentAddr = nextAddr;
                current = (Node) getObject(currentAddr);
            }
        }
    }

    // Function to display the entire XOR linked list
    void display() {
        int currentAddr = 0;
        int prevAddr = 0;
        int nextAddr;

        Node current = head;
        Node prev = null;

        while (current != null) {
            System.out.print(current.data + " ");

            nextAddr = prevAddr ^ current.xorNextPrev;

            if (nextAddr == 0) {
                break;
            }

            prev = current;
            prevAddr = currentAddr;
            currentAddr = nextAddr;
            current = (Node) getObject(currentAddr);
        }
        System.out.println();
    }

    // Dummy method for getObject (replace with actual method to get object based on memory address)
    private Object getObject(int address) {
        return null;
    }

    public static void main(String[] args) {
        XORLinkedList xorList = new XORLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Input elements into the XOR linked list
        System.out.print("Enter the number of elements to insert: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            xorList.insert(data);
        }

        // Display the entire XOR linked list
        System.out.println("The XOR linked list is:");
        xorList.display();
        scanner.close();
    }
}
