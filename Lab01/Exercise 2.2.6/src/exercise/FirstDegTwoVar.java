package exercise;
import java.util.Scanner;
public class FirstDegTwoVar {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		//a1x1 + a2x2 = a3
		//b1x1 + b2x2 = b3
		System.out.println("Solve the system of equation:");
		System.out.println("a1x1 + a2x2 = a3 \nb1x1 + b2x2 = b3");
		double a1,a2,a3,b1,b2,b3;
		System.out.print("a1 = ");
		a1 = input.nextInt();
		System.out.print("a2 = ");
		a2 = input.nextInt();
		System.out.print("a3 = ");
		a3 = input.nextInt();
		System.out.print("b1 = ");
		b1 = input.nextInt();
		System.out.print("b2 = ");
		b2 = input.nextInt();
		System.out.print("b3 = ");
		b3 = input.nextInt();
		//solve
		double D,D1,D2;
		D = a1*b2 - a2*b1;
		D1 = a2*b3 - a3*b2;
		D2 = a3*b1 - a1*b3;
		if (D != 0) {
			System.out.println("The anwser is: x1 = "+(D1/D)+" ; x2 = "+(D2/D));
		}else {
			if (D1 != 0 || D2 != 0) {
				System.out.println("No solution!");
			}else {
				System.out.println("Infinite solution!");
			}
		}
		
	}
}
