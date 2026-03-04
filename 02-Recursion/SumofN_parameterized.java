public class SumofN_parameterized {
    // The function takes 'i' (current number) and 'sum' (accumulated total)
    public static void f(int i, int sum) {
        // Base Case: If we have gone below 1, print the final sum
        if (i < 1) {
            System.out.println(sum);
            return;
        }

        // Recursive Call: 
        // 1. Decrement i (i - 1)
        // 2. Add current i to the sum (sum + i)
        f(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 3; // Example input from your image
        f(n, 0);   // Start with the number n and an initial sum of 0
    }
}
