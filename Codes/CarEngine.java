class Engine {
    void start() { System.out.println("Engine started."); }
}
class Car {
    Engine e = new Engine();
    void run() { e.start(); System.out.println("Car running."); }
}
public class CarEngine {
    public static void main(String[] args) {
        new Car().run();
    }
}
