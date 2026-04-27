package JavaCodes.Codes;
class Vehicle {
    public void run() {
        System.out.println("Vehicle can run");
    }
}

class Car extends Vehicle {
    public void fuel() {
        System.out.println("Car uses fuel");
    }
}

class ElectricCar extends Car {
    public void battery() {
        System.out.println("Electric car uses battery");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.fuel();
        e.battery();
        e.run();
    }
}
