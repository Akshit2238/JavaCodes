class Animal {
    void sound() { System.out.println("Animal makes a sound."); }
}
class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}
public class AnimalSounds {
    public static void main(String[] args) {
        new Cat().sound();
    }
}
