// Class definition
public class Car {
    // Fields (attributes)
    String color;
    int maxSpeed;
    
    // Method
    void displayInfo() {
        System.out.println("Color: " + color + ", Max Speed: " + maxSpeed);
    }
}

// Creating objects
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Object creation
        myCar.color = "Red";
        myCar.maxSpeed = 200;
        myCar.displayInfo();
    }
}
