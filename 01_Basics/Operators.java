public class Operators {

    public static void main(String[] args) {

        // ==========================================
        // 1. ARITHMETIC OPERATORS
        // ==========================================

        int a = 10;
        int b = 3;

        System.out.println("===== ARITHMETIC OPERATORS =====");

        System.out.println("a + b = " + (a + b));   // Addition
        System.out.println("a - b = " + (a - b));   // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));   // Division
        System.out.println("a % b = " + (a % b));   // Modulus


        // ==========================================
        // 2. UNARY OPERATORS
        // ==========================================

        System.out.println("\n===== UNARY OPERATORS =====");

        int x = 5;

        System.out.println("+x = " + (+x));   // Unary plus
        System.out.println("-x = " + (-x));   // Unary minus

        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After x++ = " + x);

        System.out.println("--x = " + (--x)); // Pre-decrement
        System.out.println("x-- = " + (x--)); // Post-decrement
        System.out.println("After x-- = " + x);

        boolean flag = true;
        System.out.println("!flag = " + (!flag)); // Logical NOT


        // ==========================================
        // 3. RELATIONAL / COMPARISON OPERATORS
        // ==========================================

        System.out.println("\n===== RELATIONAL OPERATORS =====");

        a = 10;
        b = 3;

        System.out.println("a == b : " + (a == b)); // Equal
        System.out.println("a != b : " + (a != b)); // Not equal
        System.out.println("a > b  : " + (a > b));  // Greater than
        System.out.println("a < b  : " + (a < b));  // Less than
        System.out.println("a >= b : " + (a >= b)); // Greater/equal
        System.out.println("a <= b : " + (a <= b)); // Less/equal


        // ==========================================
        // 4. LOGICAL OPERATORS
        // ==========================================

        System.out.println("\n===== LOGICAL OPERATORS =====");

        boolean p = true;
        boolean q = false;

        System.out.println("p && q = " + (p && q)); // AND
        System.out.println("p || q = " + (p || q)); // OR
        System.out.println("!p     = " + (!p));     // NOT


        // ==========================================
        // 5. ASSIGNMENT OPERATORS
        // ==========================================

        System.out.println("\n===== ASSIGNMENT OPERATORS =====");

        int n = 10;

        System.out.println("n = " + n);

        n += 5;
        System.out.println("n += 5  -> " + n);

        n -= 3;
        System.out.println("n -= 3  -> " + n);

        n *= 2;
        System.out.println("n *= 2  -> " + n);

        n /= 4;
        System.out.println("n /= 4  -> " + n);

        n %= 3;
        System.out.println("n %= 3  -> " + n);


        // ==========================================
        // 6. BITWISE OPERATORS
        // ==========================================

        System.out.println("\n===== BITWISE OPERATORS =====");

        a = 5;  // Binary: 0101
        b = 3;  // Binary: 0011

        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("~a    = " + (~a));    // Bitwise NOT


        // ==========================================
        // 7. SHIFT OPERATORS
        // ==========================================

        System.out.println("\n===== SHIFT OPERATORS =====");

        a = 8; // Binary: 1000

        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned right shift


        // ==========================================
        // 8. CONDITIONAL / TERNARY OPERATOR
        // ==========================================

        System.out.println("\n===== TERNARY OPERATOR =====");

        a = 10;
        b = 20;

        int maximum = (a > b) ? a : b;

        System.out.println("Maximum = " + maximum);


        // ==========================================
        // 9. instanceof OPERATOR
        // ==========================================

        System.out.println("\n===== instanceof OPERATOR =====");

        String name = "Java";

        System.out.println(
            "name instanceof String = " + (name instanceof String)
        );


        // ==========================================
        // 10. STRING CONCATENATION (+)
        // ==========================================

        System.out.println("\n===== STRING CONCATENATION =====");

        String firstName = "Java";
        String lastName = "Programming";

        System.out.println(firstName + " " + lastName);

        System.out.println("Value of a = " + a);


        // ==========================================
        // END
        // ==========================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}