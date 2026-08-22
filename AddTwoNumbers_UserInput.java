import java.util.Scanner;
public class AddTwoNumbers_UserInput {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
	System.out.print("Enter First Number:");
	int number1 = scan.nextInt();
	
	System.out.print("Enter Second Number:");
	int number2 = scan.nextInt();
	
	int add= number1+number2;

	System.out.println("Addition of two numbers:" +add );
 }
}
