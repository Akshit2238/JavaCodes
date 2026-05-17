class Student {
    String name;
    int age;
    Student(String n, int a) { name = n; age = a; }
    void show() { System.out.println(name + " is " + age + " years old."); }
}
public class StudentInfo {
    public static void main(String[] args) {
        new Student("Akshit", 20).show();
    }
}
