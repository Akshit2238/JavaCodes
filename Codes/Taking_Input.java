package JavaCodes.Codes;
import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String Name = scanner.nextLine();

        System.out.println("Age:");
        int Age = scanner.nextInt();

        System.out.println("Salary:");
        double salary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("Salary:" + salary);

        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Age:");
        int age = scanner.nextInt();
        System.out.println("Salary:");
        double salary1 = scanner.nextDouble();

        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("Salary:" + salary);

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary1);
        scanner.close();

    }
}

