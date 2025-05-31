class Vehicle {  // Parent class
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {  // Child class
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();  // Calls the child class method
    }
}
