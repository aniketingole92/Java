class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void accelerate() {
        System.out.println("Bike is accelerating");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.run(); // Inherited method
        myBike.accelerate();
    }
}