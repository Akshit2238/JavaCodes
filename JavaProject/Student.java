package JavaProject;

/**
 * Student class — encapsulates roll number, name, and marks.
 * Demonstrates: Encapsulation, Constructors, Getters/Setters
 */
public class Student {

    // ── Private fields (Encapsulation) ──────────────────────────────────────
    private int    rollNo;
    private String name;
    private double marks;

    // ── Constructor ─────────────────────────────────────────────────────────
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name   = name;
        this.marks  = marks;
    }

    // ── Getters ─────────────────────────────────────────────────────────────
    public int    getRollNo() { return rollNo; }
    public String getName()   { return name;   }
    public double getMarks()  { return marks;  }

    // ── Setters ─────────────────────────────────────────────────────────────
    public void setName(String name)   { this.name  = name;  }
    public void setMarks(double marks) { this.marks = marks; }

    // ── Grade Logic ─────────────────────────────────────────────────────────
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }

    // ── Display ─────────────────────────────────────────────────────────────
    public void displayDetails() {
        System.out.println("┌─────────────────────────────────┐");
        System.out.printf("│ Roll No : %-23d│%n", rollNo);
        System.out.printf("│ Name    : %-23s│%n", name);
        System.out.printf("│ Marks   : %-23.2f│%n", marks);
        System.out.printf("│ Grade   : %-23s│%n", calculateGrade());
        System.out.println("└─────────────────────────────────┘");
    }

    // ── CSV Representation (for file I/O) ───────────────────────────────────
    public String toCSV() {
        return rollNo + "," + name + "," + marks;
    }

    // ── Parse from CSV ──────────────────────────────────────────────────────
    public static Student fromCSV(String line) {
        String[] parts = line.split(",");
        return new Student(Integer.parseInt(parts[0].trim()),
                           parts[1].trim(),
                           Double.parseDouble(parts[2].trim()));
    }
}
