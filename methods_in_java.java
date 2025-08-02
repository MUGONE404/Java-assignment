import java.util.Scanner;

public class NumberComparison {

    public void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int largest = num1;
        int smallest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " smallest number.");

        scanner.close();
    }
    public static void main(String[] args) {
        NumberComparison comparison = new NumberComparison();
        comparison.findLargestAndSmallest();
    }
}
