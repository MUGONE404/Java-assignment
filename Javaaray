import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a) Create and fill array with 15 integers
        int[] numbers = new int[15];
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // a) Print original array
        System.out.println("\nValues in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // b) Check for a number
        System.out.print("\nEnter a number to search: ");
        int searchNum = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNum) {
                System.out.println("The number found at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // c) Create and fill reversed array
        int[] reversedNumbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }

        // c) Print reversed array
        System.out.println("\nValues in reversed array:");
        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.print(reversedNumbers[i] + " ");
        }
        System.out.println();

        // d) Calculate sum and product
        long sum = 0;  // Using long to handle larger sums
        long product = 1;  // Using long to handle larger products
        for (int num : numbers) {
            sum += num;
            product *= num;
        }

        // d) Print sum and product
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
}
