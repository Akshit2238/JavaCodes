class Bike {
    Bike() {
        System.out.println("Bike is created");
    }
}

public class DefaultConstructor {
    public static void main(String args[]) {
        Bike b = new Bike();
        System.out.println("Instantiated: " + b.getClass().getSimpleName());
    }
}
