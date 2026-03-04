public class factorial_functional {
    /**
     * Functional recursion to calculate factorial.
     * Returns n! (n * n-1 * n-2 ... * 1)
     */
    public static int f(int n) {
        // Base Case: Factorial of 0 or 1 is 1
        // If we reach 0, we return 1 to multiply with the rest
        if (n == 0) {
            return 1;
        }

        // Recursive Step: return n * f(n - 1)
        // Similar to the sum logic, but using multiplication
        return n * f(n - 1);
    }

    public static void main(String[] args) {
        int n = 4; 
        // Example: 4! = 4 * 3 * 2 * 1 = 24
        System.out.println("Factorial of " + n + " is: " + f(n));
    }
}