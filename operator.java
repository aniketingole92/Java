public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 3;
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3 (integer division)
        System.out.println(a % b); // 1 (modulus)
        
        // Assignment operators
        a += 5; // a = a + 5
        b *= 2; // b = b * 2
        
        // Comparison operators
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        
        // Logical operators
        boolean x = true, y = false;
        System.out.println(x && y); // AND - false
        System.out.println(x || y); // OR - true
        System.out.println(!x);    // NOT - false
        
        // Ternary operator
        int max = (a > b) ? a : b;
    }
}
