public class SumofN_functional {
    /**
     * Functional recursion to calculate sum.
     * This function returns the sum of all numbers from n down to 0.
     */
    public static int f(int n) {
        // Base Case: If n reaches 0, the sum of numbers up to 0 is just 0.
        // As seen in the image: if (n == 0) return 0;
        if (n == 0) {
            return 0;
        }

        // Recursive Step: return n + f(n - 1)
        // This adds the current n to the result of the sum of (n - 1) numbers.
        return n + f(n - 1);
    }

    public static void main(String[] args) {
        int n = 3; // Example input from your image
        
        // We call the function and print the returned value.
        // As seen in the image: print(f(n))
        System.out.println(f(n));
    }
}