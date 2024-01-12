import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();

        System.out.print("Enter elements to add at the front (space-separated): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()

        String[] frontElements = scanner.nextLine().split(" ");
        for (String element : frontElements) {
            deque.addFirst(Integer.parseInt(element));
        }

        System.out.print("Enter elements to add at the end (space-separated): ");
        String[] endElements = scanner.nextLine().split(" ");
        for (String element : endElements) {
            deque.addLast(Integer.parseInt(element));
        }

        System.out.println("Deque elements: " + deque);

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("Deque elements after removal: " + deque);

        scanner.close();
    }
}
