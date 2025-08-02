public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = new int[15];

        // Step 1: Take 15 integers from user
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        // Step 2: Print the values stored in the array
        System.out.println("\nValues in the array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println(); // new line

        // Step 3: Ask user to search for a number
        System.out.print("\nEnter a number to search in the array: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < 15; i++) {
            if (originalArray[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number not found in this array.");
        }

        // Step 4: Create reversed array
        int[] reversedArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reversedArray[i] = originalArray[14 - i];
        }

        System.out.println("\nReversed array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        // Step 5: Calculate sum and product
        int sum = 0;
        long product = 1;

        for (int i = 0; i < 15; i++) {
            sum += originalArray[i];
            product *= originalArray[i];
        }

        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
} 
 
