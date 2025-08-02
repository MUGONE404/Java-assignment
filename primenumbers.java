public class MathProblems {

    public boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
    public void displayFirstTenFibonacci() {
        int a = 1, b = 2;

        System.out.println("\nFirst 10 terms of the Fibonacci sequence:");
        System.out.print(a + ", " + b);

        for (int i = 3; i <= 10; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
    public int sumEvenFibonacci() {
        int a = 1, b = 2;
        int sum = 0;

        while (b <= 4000000) {
            if (b % 2 == 0) {
                sum += b;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
    public static void main(String[] args) {
        MathProblems math = new MathProblems();

        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (math.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        math.displayFirstTenFibonacci();

        int evenSum = math.sumEvenFibonacci();
        System.out.println("\nSum of even Fibonacci numbers not exceeding 4 million: " + evenSum);
    }
}
