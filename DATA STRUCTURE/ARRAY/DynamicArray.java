import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the dynamic array: ");
        int size = scanner.nextInt();

        // Create a dynamic array (ArrayList) to store integers
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            dynamicArray.add(scanner.nextInt());
        }

        // Display the entire array
        System.out.println("The entered dynamic array is:");

        for (int element : dynamicArray) {
            System.out.print(element + " ");
        }
        scanner.close();
        
    }
}
