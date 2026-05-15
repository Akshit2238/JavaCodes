abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();
    }
}
