package exercise;
import java.util.Arrays;
import java.util.Scanner;
public class AddTwoMatrices {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		//size
		System.out.print("The number of row: ");
		int m = input.nextInt();
		System.out.print("The number of column: ");
		int n = input.nextInt();
		//matrices
		int[][] Mat1 = new int [m][n];
		int[][] Mat2 = new int [m][n];
		// matrix 1
		System.out.println("Please enter the first matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Mat1[i][j] =  input.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Mat1[i][j]+ " ");
			}
			System.out.println();
		}
		// matrix 2
		System.out.println("Please enter the second matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Mat2[i][j] =  input.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Mat2[i][j]+ " ");
			}
			System.out.println();
		}
		// add two matrices
		int[][] Result = new int [m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Result[i][j] =  Mat1[i][j] + Mat2[i][j];
			}
		}
		System.out.println("The sum of two matrices is: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Result[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
