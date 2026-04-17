public class Constroctor {
    int a;
    String name;

    Constroctor() {
        a = 0;
        name = null;
    }
    void show() {
        System.out.println(a+" "+name);
    }
    public static void main(String[] args) {
        Constroctor c = new Constroctor();
        c.show();
    }
}
