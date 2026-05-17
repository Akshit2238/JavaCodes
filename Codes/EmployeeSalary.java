class Employee {
    double salary = 50000;
}
class Programmer extends Employee {
    int bonus = 10000;
}
public class EmployeeSalary {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Salary: " + p.salary);
        System.out.println("Bonus: " + p.bonus);
    }
}
