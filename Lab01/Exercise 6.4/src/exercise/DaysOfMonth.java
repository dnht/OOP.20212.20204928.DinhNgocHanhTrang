package exercise;
import java.util.Scanner;
public class DaysOfMonth {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		//valid input list 
		String[] Month = {"January", "February","March","April","May","June","July", "August","September","October", "November", "December"};
		String[] Abbr = {"Jan.", "Feb.","Mar.","Apr.","May","June","July", "Aug.","Sept.","Oct.", "Nov.", "Dec."};
		String[] Letter = {"Jan", "Feb","Mar","Apr","May","Jun","Jul", "Aug","Sep","Oct", "Nov", "Dec"};
		String[] Number = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		
		//user enter a month
		int count = 0;
		String strMonth;
		do{
			System.out.print("Please enter a valid Month: ");
			strMonth = input.nextLine();
			count = 0;
			for (int i = 0; i < 12; i++) {
				if (Month[i].equals(strMonth)){
					count += (i+1);
					break;
				}else if (Abbr[i].equals(strMonth)) {
					count += (i+1);
					break;
				}else if (Letter[i].equals(strMonth)) {
					count += (i+1);
					break;
				}else if (Number[i].equals(strMonth)) {
					count += (i+1);
					break;
				}
			}
		}while (count == 0);
		System.out.println("Valid input!");
		
		//user enter a year
		System.out.print("Please enter a valid Year(number-only): ");
		int iYear = input.nextInt();
		
		//Count the day
		if (count == 1 || count == 3 || count == 5 ||count == 7 || count == 8 || count == 10 || count == 12) {
			System.out.println(Month[count-1] + " of " +iYear +": 31 days!");
		}else if (count == 4 || count == 6 || count == 9 || count == 11) {
			System.out.println(Month[count-1] + " of " +iYear +": 30 days!");
		}else {
			if (iYear %4 == 0){
				if (iYear % 100 == 0) {
					if (iYear % 400 == 0) {
						System.out.println(Month[count-1]+" of "+iYear+": 29 days!");
					}else {
						System.out.println(Month[count-1]+" of "+iYear+": 28 days!");
					}
				}else {
					System.out.println(Month[count-1]+" of "+iYear+": 29 days!");
				}
			}else {
				System.out.println(Month[count-1]+" of "+iYear+": 28 days!");
			}
		}
	}
}
