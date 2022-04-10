package exercise;

import java.util.Arrays;

public class Array {
	public static void main (String args[]) {
		double[] number = {1789,2035,1899,1456,2013};
		//sort the array
		Arrays.sort(number);
		System.out.println("Sorted array: "+ Arrays.toString(number));
		//calculate the sum & average value
		double sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		double average = sum /number.length;
		System.out.println("The sum is: "+sum );
		System.out.println("The average value is: " + average);
	}
}
