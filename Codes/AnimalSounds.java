class AnimalAS {
    void sound() { System.out.println("Animal makes a sound."); }
}
class CatAS extends AnimalAS {
    void sound() { System.out.println("Meow"); }
}
public class AnimalSounds {
    public static void main(String[] args) {
        new CatAS().sound();
    }
}
