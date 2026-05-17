class Shape {
    void area() { System.out.println("Area depends on shape."); }
}
class Rectangle extends Shape {
    void area(int l, int w) { System.out.println("Area: " + (l * w)); }
}
public class ShapeArea {
    public static void main(String[] args) {
        new Rectangle().area(5, 4);
    }
}
