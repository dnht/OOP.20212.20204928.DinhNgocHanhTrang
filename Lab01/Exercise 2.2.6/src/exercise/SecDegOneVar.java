package exercise;
import java.util.Scanner;
public class SecDegOneVar {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		//ax^2 + bx + c = 0
		System.out.println("Solve the equation: ax^2 + bx + c = 0 (a != 0)");
		double a,b,c;
		do{
			System.out.println("Please enter a non-zero value for a");
			System.out.print("a = ");
			a = input.nextInt();
		}while (a == 0);
		System.out.print("b = ");
		b = input.nextInt();
		System.out.print("c = ");
		c = input.nextInt();
		//solve
		double D = b*b - 4*a*c;
		double d = Math.sqrt(D);
		if (D < 0) {
			System.out.println("No solution!");
		}else if (D == 0) {
			System.out.println("The equation has a double solution: x1 = x2 = " + (-b/(2*a)));
		}else {
			System.out.println("The equation has 2 diffenrent solution:");
			System.out.println("x1 = "+ ((-b + d)/(2*a)) + "\nx2 = "+ ((-b - d)/(2*a)));
		}
	}
}
