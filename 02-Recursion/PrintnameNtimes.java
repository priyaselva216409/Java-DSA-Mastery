public class PrintnameNtimes {
    
    public static void main(String[] args) {
        int n = 5; // You can change this to any value
        // Starting the recursion with i = 1 and target = n
        printName(1, n);
    }

    public static void printName(int i, int n) {
        // Base Condition: If counter i is greater than n, stop
        if (i > n) {
            return;
        }

        // Action: Print the name
        System.out.println("chinna");

        // Recursive Call: Increment i by 1 for the next call
        printName(i + 1, n);
    }
}