
import java.util.Scanner;

public class BasicJavaProgram {

    public static void main(String[] args) {

      
        // Variable
        int integerVariable = 42;
        double doubleVariable = 3.14;
        boolean booleanVariable = true;
        char charVariable = 'A';
        String stringVariable = "Java is fun!"; // you can name anything , but it should follow naming rules
      
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Output
        System.out.println("You entered: " + userInput);

        // Conditional statement
        if (userInput > number) {
            System.out.println("The entered number is greater than " + number);
        } else {
            System.out.println("The entered number is not greater than " + number);
        }

        // Loop (for)
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Loop (while)
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration " + i);
            i++;
        }

        // Exception handling (try-catch)
        try {
            int result = divideNumbers(number, userInput);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
         // Exception handling (try-catch-finally)
        try {
            int result = divideNumbers(10, 2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }


    // Method with exception handling
    private static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}


        // Enhanced for loop (for-each)
        System.out.println("Printing elements of intArray:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line


       
    // Method with parameter
    private static void displayMessage(String message) {
        System.out.println(message);
    }


    // Sample class
    static class Dog {
        String name;
        int age;

        Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void bark() {
            System.out.println(name + " says Woof!");
        }
    }
}
