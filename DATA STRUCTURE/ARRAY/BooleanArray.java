import java.util.Scanner;

public class BooleanArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the boolean array: ");
        int size = scanner.nextInt();

        // Create a boolean array with the specified size
        boolean[] boolArray = new boolean[size];

        // Input array elements from the user
        System.out.println("Enter the elements of the array (0 for false, 1 for true):");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int inputValue = scanner.nextInt();

            // Convert user input to boolean (0 is false, any other value is true)
            boolArray[i] = (inputValue != 0);
        }

        // Display the entire boolean array
        System.out.println("The entered boolean array is:");

        for (boolean element : boolArray) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
