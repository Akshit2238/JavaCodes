package JavaProject;

import java.util.*;
import java.io.*;

/**
 * StudentManager — handles all CRUD operations on Student records.
 * Demonstrates: Abstraction, ArrayList, File I/O, Sorting
 */
public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();
    private static final String FILE_NAME = "JavaProject/students.csv";

    // ────────────────────────────────────────────────────────────────────────
    // 1. ADD STUDENT
    // ────────────────────────────────────────────────────────────────────────
    public void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number : ");
        int roll = readInt(sc);

        if (isDuplicateRoll(roll)) {
            System.out.println("❌ Roll number " + roll + " already exists!");
            return;
        }

        sc.nextLine(); // consume newline
        System.out.print("Enter Name        : ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Marks (0-100): ");
        double marks = readMarks(sc);

        System.out.print("Is Graduate Student? (y/n): ");
        String choice = sc.next().trim().toLowerCase();

        Student s;
        if (choice.equals("y")) {
            sc.nextLine();
            System.out.print("Enter Research Topic: ");
            String topic = sc.nextLine().trim();
            s = new GraduateStudent(roll, name, marks, topic);
        } else {
            s = new Student(roll, name, marks);
        }

        students.add(s);
        System.out.println("✅ Student added successfully!");
    }

    // ────────────────────────────────────────────────────────────────────────
    // 2. VIEW ALL STUDENTS
    // ────────────────────────────────────────────────────────────────────────
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️  No students found.");
            return;
        }
        System.out.println("\n===== ALL STUDENTS (" + students.size() + ") =====");
        for (Student s : students) {
            s.displayDetails();
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // 3. SEARCH STUDENT BY ROLL NUMBER
    // ────────────────────────────────────────────────────────────────────────
    public void searchStudent(Scanner sc) {
        System.out.print("Enter Roll Number to search: ");
        int roll = readInt(sc);
        Student found = findByRoll(roll);
        if (found == null) {
            System.out.println("❌ Student with roll " + roll + " not found.");
        } else {
            System.out.println("\n===== STUDENT FOUND =====");
            found.displayDetails();
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // 4. UPDATE STUDENT
    // ────────────────────────────────────────────────────────────────────────
    public void updateStudent(Scanner sc) {
        System.out.print("Enter Roll Number to update: ");
        int roll = readInt(sc);
        Student s = findByRoll(roll);

        if (s == null) {
            System.out.println("❌ Student not found.");
            return;
        }

        sc.nextLine();
        System.out.print("New Name (leave blank to keep '" + s.getName() + "'): ");
        String name = sc.nextLine().trim();
        if (!name.isEmpty()) s.setName(name);

        System.out.print("New Marks (enter -1 to keep " + s.getMarks() + "): ");
        double marks = readDouble(sc);
        if (marks >= 0 && marks <= 100) s.setMarks(marks);

        System.out.println("✅ Student updated successfully!");
        s.displayDetails();
    }

    // ────────────────────────────────────────────────────────────────────────
    // 5. DELETE STUDENT
    // ────────────────────────────────────────────────────────────────────────
    public void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll Number to delete: ");
        int roll = readInt(sc);
        Student s = findByRoll(roll);

        if (s == null) {
            System.out.println("❌ Student not found.");
            return;
        }

        System.out.print("Are you sure you want to delete '" + s.getName() + "'? (y/n): ");
        String confirm = sc.next().trim().toLowerCase();
        if (confirm.equals("y")) {
            students.remove(s);
            System.out.println("✅ Student deleted successfully!");
        } else {
            System.out.println("ℹ️  Deletion cancelled.");
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // 6. CALCULATE GRADE (for a specific student)
    // ────────────────────────────────────────────────────────────────────────
    public void calculateGrade(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int roll = readInt(sc);
        Student s = findByRoll(roll);

        if (s == null) {
            System.out.println("❌ Student not found.");
            return;
        }

        System.out.println("\n📊 " + s.getName() + " → Marks: " + s.getMarks()
                + " → Grade: " + s.calculateGrade());
    }

    // ────────────────────────────────────────────────────────────────────────
    // 7. SORT STUDENTS BY MARKS (descending)
    // ────────────────────────────────────────────────────────────────────────
    public void sortByMarks() {
        if (students.isEmpty()) {
            System.out.println("⚠️  No students to sort.");
            return;
        }
        students.sort((a, b) -> Double.compare(b.getMarks(), a.getMarks()));
        System.out.println("✅ Students sorted by marks (highest first):");
        viewStudents();
    }

    // ────────────────────────────────────────────────────────────────────────
    // 8. SAVE TO FILE
    // ────────────────────────────────────────────────────────────────────────
    public void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                pw.println(s.toCSV());
            }
            System.out.println("✅ Records saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("❌ Error saving file: " + e.getMessage());
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // 9. LOAD FROM FILE
    // ────────────────────────────────────────────────────────────────────────
    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    students.add(Student.fromCSV(line));
                    count++;
                }
            }
            if (count > 0)
                System.out.println("ℹ️  Loaded " + count + " records from file.");
        } catch (IOException e) {
            System.out.println("❌ Error loading file: " + e.getMessage());
        }
    }

    // ────────────────────────────────────────────────────────────────────────
    // HELPER METHODS
    // ────────────────────────────────────────────────────────────────────────
    private Student findByRoll(int roll) {
        for (Student s : students)
            if (s.getRollNo() == roll) return s;
        return null;
    }

    private boolean isDuplicateRoll(int roll) {
        return findByRoll(roll) != null;
    }

    private int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("⚠️  Invalid input. Enter a number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("⚠️  Invalid input. Enter a decimal number: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    private double readMarks(Scanner sc) {
        double m;
        do {
            m = readDouble(sc);
            if (m < 0 || m > 100)
                System.out.print("⚠️  Marks must be 0–100. Try again: ");
        } while (m < 0 || m > 100);
        return m;
    }
}
