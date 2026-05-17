class ShapeSA {
    void area() { System.out.println("Area depends on shape."); }
}
class RectangleSA extends ShapeSA {
    void area(int l, int w) { System.out.println("Area: " + (l * w)); }
}
public class ShapeArea {
    public static void main(String[] args) {
        new RectangleSA().area(5, 4);
    }
}
