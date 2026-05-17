class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
    void show() { System.out.println("Point: (" + x + ", " + y + ")"); }
}
public class Point2D {
    public static void main(String[] args) {
        new Point(10, 20).show();
    }
}
