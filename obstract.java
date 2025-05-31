// Abstract class
abstract class Shape {
    abstract void draw();  // Abstract method
    
    void display() {  // Concrete method
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();  // Upcasting
        s.draw();
        s.display();
    }
}
