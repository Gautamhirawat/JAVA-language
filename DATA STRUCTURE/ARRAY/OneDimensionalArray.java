import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Display the entire array
        System.out.println("The entered array is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
