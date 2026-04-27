package JavaCodes;

abstract class vehicle {
    int No_Of_Wheels;

    abstract void start();
}

class Car extends vehicle {
    public Car() {
        No_Of_Wheels = 4;
    }

    void start() {
        System.out.println("Car is starting");
    }
}

class scooter extends vehicle {
    public scooter() {
        No_Of_Wheels = 2;
    }

    void start() {
        System.out.println("Scooter is starting");
    }
}

public class Abstract_Example {
    public static void main(String[] args) {
        vehicle myCar = new Car();
        myCar.start();
    }
}