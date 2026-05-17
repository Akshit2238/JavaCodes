package JavaProject;

/**
 * GraduateStudent — extends Student.
 * Demonstrates: Inheritance, Polymorphism (method overriding)
 */
public class GraduateStudent extends Student {

    private String researchTopic;

    // ── Constructor ─────────────────────────────────────────────────────────
    public GraduateStudent(int rollNo, String name, double marks, String researchTopic) {
        super(rollNo, name, marks);           // Call parent constructor
        this.researchTopic = researchTopic;
    }

    // ── Getter / Setter ─────────────────────────────────────────────────────
    public String getResearchTopic()              { return researchTopic; }
    public void   setResearchTopic(String topic)  { this.researchTopic = topic; }

    // ── Polymorphism: Override displayDetails() ──────────────────────────────
    @Override
    public void displayDetails() {
        System.out.println("┌─────────────────────────────────────┐");
        System.out.printf( "│ [GRADUATE STUDENT]                  │%n");
        System.out.printf( "│ Roll No : %-27d│%n", getRollNo());
        System.out.printf( "│ Name    : %-27s│%n", getName());
        System.out.printf( "│ Marks   : %-27.2f│%n", getMarks());
        System.out.printf( "│ Grade   : %-27s│%n", calculateGrade());
        System.out.printf( "│ Research: %-27s│%n", researchTopic);
        System.out.println("└─────────────────────────────────────┘");
    }

    // ── CSV Representation ───────────────────────────────────────────────────
    @Override
    public String toCSV() {
        return super.toCSV() + "," + researchTopic + ",GRAD";
    }
}
