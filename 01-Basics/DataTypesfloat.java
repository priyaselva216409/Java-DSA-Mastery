// The float data type is used to store numbers with decimal points (like 3.14).
// It can hold values that are very small (like 0.0001) or very large (like 1000000.0), but it has less precision than double.
// A float takes up 4 bytes of memory, which is equal to 32 bits. This means it can represent a wide range of decimal values but might not be as accurate for very precise calculations.
// Syntax:
// float variableName = valueF;
// float variable must have an 'f' or 'F' suffix when assigning a value; otherwise, Java assumes it as a double by default.

class Codechef {
    public static void main(String[] args) {
        float price = 19.99f; // Declaring and assigning a float variable
        System.out.println("Item Price: " + price);
    }
}