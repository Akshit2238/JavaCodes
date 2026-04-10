package Codes;
class Transport{
    void move(){
        System.out.println("Transport moves");
    }
    void fuel(){
        System.out.println("Transport uses fuels");
    }
}
class Bus extends Transport{
    void move(){
        System.out.println("Bus moves on road");
    }
    void fuel(){
        System.out.println("Bus uses fuels");
    }
}
class Train extends Transport{
    void move(){
        System.out.println("Train runs on track");
    }
    void fuel(){
        System.out.println("Train consumes electricity");
    }
}
class Aeroplane  extends Transport{
    void move(){
        System.out.println("Aeroplane fly");
    }
    void fuel(){
        System.out.println("Aeroplane uses aviation fuels");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Transport t1= new Bus();
        t1.move();
        t1.fuel();
        Transport t3= new Aeroplane();
        t3.move();
        t3.fuel();
    }
}

