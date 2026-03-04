// The long data type is used to store large whole numbers that exceed the range of an int.
// The range of values it can store is from -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 - 1).
// A long in Java takes up 8 bytes of memory, which is equal to 64 bits.
// This data type is particularly useful when dealing with large calculations or data sets.

// Syntax:

// long variableName = valueL;
// The L suffix is required when assigning large numbers to indicate a long literal.

class DataTypeslong {
    public static void main(String[] args) {
        long distanceToMoon = 384_400_000L; // Using _ for better readability in large numbers
        System.out.println("Distance to the Moon: " + distanceToMoon + " meters");
    }
}