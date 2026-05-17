class Circle {
    double radius;
    Circle(double r) { radius = r; }
    void printArea() { System.out.println("Area: " + (Math.PI * radius * radius)); }
}
public class CircleAreaOOP {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.printArea();
    }
}
