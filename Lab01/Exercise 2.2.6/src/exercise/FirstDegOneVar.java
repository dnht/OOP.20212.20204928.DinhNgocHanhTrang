package exercise;
import java.util.Scanner;
public class FirstDegOneVar {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		//ax + b = 0 (a != 0)
		System.out.println("Solve the equation ax + b = 0");
		double a = 0;
		do {
			System.out.println("Please enter a non-zero value for a\na = ");
			a = input.nextInt();
		}while (a == 0);
		System.out.println("b = ");
		double b = input.nextInt();
		//solve
		System.out.println("The answer is: x = " + (-b/a));
		
	}
}
