import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Create a jagged array with varying column lengths
        int[][] jaggedArray = new int[rows][];

        // Input array elements from the user
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int columns = scanner.nextInt();

            // Create a new row with the specified number of columns
            jaggedArray[i] = new int[columns];

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < columns; j++) {
                System.out.print("Element " + (j + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Display the entire array
        System.out.println("The entered jagged array is:");

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        scanner.close();
    }
}
