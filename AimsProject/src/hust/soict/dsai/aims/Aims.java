package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import java.util.Scanner;

public class Aims {

	public static void main(String[] args) {
		//Create a new cart 
		Cart anOrder = new Cart();
		//Create new dvd objects and add them to the cart 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		
		//print total cost of the items in the cart 
		System.out.println("Total Cost is: ");
		anOrder.totalCost();
		
		//Check removeDigitalVideoDisc method
		anOrder.removeDigitalVideoDisc(dvd3);
		
		Store store1 = new Store();
		
	}
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("-------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("-------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	public static void storeMenu() {
		System.out.println("Option: ");
		System.out.println("-------------------------");
		System.out.println("1. See a DVD's details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("-------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	public static void DVDdetail(Store store) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the title of the DVD: ");
		String search = input.next();
		for (int i = 0; i < store.qtyAvailable; i++) {
			if (search.toLowerCase().equals(store.itemsInStore[i].getTitle().toLowerCase())){
				System.out.println("Found: "+store.itemsInStore[i].toString());
			}
		}
	}
	public static void addtocart(Store store, Cart cart) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the title of the DVD: ");
		String search = input.next();
		for (int i = 0; i < store.qtyAvailable; i++) {
			if (search.toLowerCase().equals(store.itemsInStore[i].getTitle().toLowerCase())){
				cart.addDigitalVideoDisc(store.itemsInStore[i]);
				System.out.println("Added");
			}
		}
		System.out.println(cart.qtyOrdered);
	}
	public static void updatestore(Store store) {
		System.out.println("1. Add a DVD \n 2. Remove a DVD");
		System.out.println("Please choose:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.println("Enter the DVD");
		String dvd = input.next();
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("---------------------------");
		System.out.println("1. Filter DVDs in cart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place Order");
		System.out.println("0. Back");
		System.out.println("---------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	

}
