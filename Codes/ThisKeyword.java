class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }
}

public class ThisKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Ankit");
        s1.display();
    }
}
