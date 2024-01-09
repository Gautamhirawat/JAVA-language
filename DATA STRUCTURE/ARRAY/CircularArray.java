import java.util.Scanner;

public class CircularArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the circular array: ");
        int size = scanner.nextInt();

        // Create a circular array with the specified size
        int[] circularArray = new int[size];

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            circularArray[i] = scanner.nextInt();
        }

        // Display the entire circular array
        System.out.println("The entered circular array is:");

        int startIndex = 2; // Start index for demonstration purposes

        for (int i = 0; i < size; i++) {
            int index = (startIndex + i) % size;
            System.out.print(circularArray[index] + " ");
        }
        scanner.close();
    }
}
