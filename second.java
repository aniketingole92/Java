class Car {
    String color;
    void start() {
        System.out.println("Car started!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.start();
    }
}