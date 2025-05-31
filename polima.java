class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {  // Method overriding
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Upcasting
        Animal myCat = new Cat();
        
        myAnimal.sound();
        myDog.sound();  // Runtime polymorphism
        myCat.sound();
    }
}
