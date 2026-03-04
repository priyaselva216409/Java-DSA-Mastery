// Literals - Integer, Float, Double

// Now, let's explore another type of token: Literals.

// System.out.println(200);
// In the statement above, 200 is being printed. But what exactly is this 200? It is a literal—specifically, an integer literal.

// An integer is one of the data types available in Java, which we will discuss in detail in the next module.

// In Java, literals are fixed values that remain unchanged during program execution. They are essential for defining constants in code. This section explores Integer, Float, and Double literals.

// All the data types and their usage will be covered in the next module. Here, we just want you to understand what a literal is.

public class Literals {

    public static void main(String[] args) {
        //INTEGER LITERAL
        System.out.println(42);       // Decimal integer literal
        System.out.println(052);      // Octal integer literal
        System.out.println(0x2A);     // Hexadecimal integer literal

        //FLOAT LITERAL
        System.out.println(3.14f);    // Float literal
        System.out.println(0.1f);     // Float literal
        System.out.println(2.5e3f);   // Float literal with scientific notation
        
        //DOUBLE LITERAL
        System.out.println(3.14);     // Double literal
        System.out.println(0.1);      // Double literal
        System.out.println(2.5e3);    // Double literal with scientific notation

        //CHARACTER LITERAL - Character literals represent a single character and are enclosed in single quotes (')
        System.out.println('A');  // Character literal
        System.out.println('$');  // Character literal
    
        //STRING LITERAL-String literals represent a sequence of characters and are enclosed in double quotes (")
        System.out.println("Hello, World!");  // String literal
        System.out.println("Java is fun!");   // String literal
        
        //BOOLEAN LITERAL-Boolean literals represent true or false values in Java
        System.out.println(true);   // Boolean literal
        System.out.println(false);  // Boolean literal
    }
}
