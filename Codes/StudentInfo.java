class StudentSI {
    String name;
    int age;
    StudentSI(String n, int a) { name = n; age = a; }
    void show() { System.out.println(name + " is " + age + " years old."); }
}
public class StudentInfo {
    public static void main(String[] args) {
        new StudentSI("Akshit", 20).show();
    }
}
