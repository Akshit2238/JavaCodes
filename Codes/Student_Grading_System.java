import java.util.Scanner;
public class Student_Grading_System {
    public static void main(String[] args) {
    	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Number of Students:");
	int size = scan.nextInt();
    scan.nextLine();
	
	String Student[] = new String[size];
	
	for(int i=0;i<size;i++) {
		System.out.print("Enter Student Name:");
		String name = scan.nextLine();
		Student[i] = name;
	}
	
	int grades[]= new int[size];
	
	for(int i=0;i<size;i++) {
	System.out.print("Enter a grade For "+Student[i]+":");
	int grade = scan.nextInt();
	while(grade>100) {
		System.out.println("Invalid Input");
		System.out.println("==========================");
		if(grade>100) {
			System.out.print("Enter Score again:");
			int scoreA = scan.nextInt();
			grade = scoreA;
		}
	}	 
	grades[i]= grade;	
	}
	
	for (int i=0;i<size;i++) {
		System.out.println("==========================");
		System.out.println("Name:"+Student[i]+"\nGrade:"+grades[i]);
		if(grades[i]>=90) {
			System.out.println("A");
		}
		else if(grades[i]>80 && grades[i]<90) {
			System.out.println("B");
		}
		else if(grades[i]>70 && grades[i]<80) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		System.out.println("=============================");
	}

 }
}
