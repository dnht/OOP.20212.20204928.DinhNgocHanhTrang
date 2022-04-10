package exercise;
import java.util.Scanner;
public class StarTriangle {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2*n-1); j++) {
				if (j > (n-i) && j < (n+i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
