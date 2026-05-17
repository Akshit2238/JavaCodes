package JavaProject;

import java.util.Scanner;

/**
 * Main — menu-driven entry point for the Student Management System.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc      = new Scanner(System.in);
        StudentManager mgr = new StudentManager();

        // Load existing records from file at startup
        mgr.loadFromFile();

        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("❌ Please enter a valid number.\n");
                sc.next();
                continue;
            }

            System.out.println();

            switch (choice) {
                case 1  -> mgr.addStudent(sc);
                case 2  -> mgr.viewStudents();
                case 3  -> mgr.searchStudent(sc);
                case 4  -> mgr.updateStudent(sc);
                case 5  -> mgr.deleteStudent(sc);
                case 6  -> mgr.calculateGrade(sc);
                case 7  -> mgr.sortByMarks();
                case 8  -> mgr.saveToFile();
                case 9  -> {
                    mgr.saveToFile();          // auto-save on exit
                    System.out.println("👋 Goodbye! Records saved.");
                    running = false;
                }
                default -> System.out.println("❌ Invalid choice. Choose 1–9.\n");
            }

            System.out.println(); // spacing
        }

        sc.close();
    }

    // ── Menu Display ─────────────────────────────────────────────────────────
    private static void printMenu() {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║    STUDENT MANAGEMENT SYSTEM  v1.0    ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║  1. Add Student                       ║");
        System.out.println("║  2. View All Students                 ║");
        System.out.println("║  3. Search Student by Roll No.        ║");
        System.out.println("║  4. Update Student                    ║");
        System.out.println("║  5. Delete Student                    ║");
        System.out.println("║  6. Calculate Grade                   ║");
        System.out.println("║  7. Sort Students by Marks            ║");
        System.out.println("║  8. Save Records to File              ║");
        System.out.println("║  9. Exit                              ║");
        System.out.println("╚═══════════════════════════════════════╝");
    }
}
