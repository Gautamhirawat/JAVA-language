import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] sparseArray = new int[size];

        // Input array elements from the user
        System.out.println("Enter the elements of the array (enter 0 for default values):");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sparseArray[i] = scanner.nextInt();
        }

        // Display the entire array with default values
        System.out.println("The entered array is:");

        Map<Integer, Integer> nonzeroElements = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (sparseArray[i] != 0) {
                nonzeroElements.put(i, sparseArray[i]);
            }
        }

        for (int i = 0; i < size; i++) {
            if (nonzeroElements.containsKey(i)) {
                System.out.print(nonzeroElements.get(i) + " ");
            } else {
                System.out.print("0 ");
            }
        }
        scanner.close();
    }
}
