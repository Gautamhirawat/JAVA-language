package DSA.LINKEDLIST;
import java.util.Scanner;

class Node {
    int data;
    Node right;
    Node down;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.down = null;
    }
}

public class SkipList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.right == null || current.right.data > data) {
                    Node temp = current.right;
                    current.right = newNode;
                    newNode.right = temp;
                    break;
                }
                current = current.right;
            }
        }
    }

    public void display() {
        Node current = head;
        System.out.println("The entered skip list is:");
        while (current != null) {
            Node temp = current;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
            System.out.println();
            current = current.down;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SkipList list = new SkipList();

        System.out.print("Enter the number of elements in the skip list: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the skip list:");
        for (int i = 0; i < size; i++) {
            list.insert(scanner.nextInt());
        }

        list.display();
        scanner.close();

    }
}
