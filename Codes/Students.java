package Codes;
public class Students {
    String name;
    int rollno;
    int age;

    void SetName(String nm) {
        name = nm;
    }

    void SetRollNo(int rn) {
        rollno = rn;
    }

    void SetAge(int a) {
        age = a;
    }

    void DisplayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        Students s4 = new Students();
        Students s5 = new Students();

        s1.SetName("Akshit");
        s1.SetRollNo(11);
        s1.SetAge(12);
        s2.SetName("Manjot");
        s2.SetRollNo(13);
        s2.SetAge(14);
        s3.SetName("Vansh");
        s3.SetRollNo(15);
        s3.SetAge(16);
        s4.SetName("Priyanshu");
        s4.SetRollNo(17);
        s4.SetAge(18);
        s5.SetName("Krish");
        s5.SetRollNo(19);
        s5.SetAge(20);

        s1.DisplayInfo();
        System.out.println("\n");
        s2.DisplayInfo();
        System.out.println("\n");
        s3.DisplayInfo();
        System.out.println("\n");
        s4.DisplayInfo();
        System.out.println("\n");
        s5.DisplayInfo();
    }
}

