public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        // Arithmetic operators
        System.out.println(a + b); // 30
        System.out.println(a - b); // -10
        System.out.println(a * b); // 200
        System.out.println(b / a); // 2
        System.out.println(b % a); // 0
        
        // Comparison operators
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        
        // Logical operators
        boolean x = true, y = false;
        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x);    // false
        
        // Assignment operators
        a += 5; // a = a + 5
        System.out.println(a); // 15
    }
}
