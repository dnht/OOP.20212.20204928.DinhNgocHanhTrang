package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.store.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
	public static void main(String[] args) {
		//Create a new cart 
		Cart anOrder = new Cart();
		//Create new dvd objects and add them to the cart 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addMedia(dvd3);
		
		
		//print total cost of the items in the cart 
		System.out.println("Total Cost is: ");
		anOrder.totalCost();
		
		//Check removeDigitalVideoDisc method
		anOrder.removeMedia(dvd3);
		
		/*memory Daemon
		MemoryDaemon md = new MemoryDaemon();
		md.run();
		*/
		//thread
		Thread md = new Thread(new MemoryDaemon());
		md.setDaemon(true);
		md.start();

	}
	// Main Menu
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
	// choose View store
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
	// choose See current cart
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
	// show current cart
	public static void showCart(Cart cart) {
		int cnt = 0;
		for (Media mda : cart.itemsOrdered ) {
			System.out.println((cnt+1)+". " + mda.toString());
			cnt++;
		}
	}
	// detail 
	public static void Mediadetail(Store store, Cart cart) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the title of the Media: ");
		String search = input.next();
		for (int i = 0; i < store.qtyAvailable; i++) {
			if (search.toLowerCase().equals(store.itemsInStore.get(i).getTitle().toLowerCase())){
				System.out.println("Found: "+store.itemsInStore.get(i).toString());
				System.out.println("Do you want to add this Media to the cart?");
				System.out.println("Please choose a number:/n1. Yes/n2. No");
				int ans = input.nextInt();
				if (ans == 1) {
					cart.addMedia(store.itemsInStore.get(i));
				}
			}
			else {
				System.out.println(search + "isn't in the store");
			}
		}
		// show options
		System.out.println("Options: ");
		System.out.println("------------------------------");
		System.out.println("1. Continue searching");
		System.out.println("0. Back");
		System.out.println("Please choose a number: 0-1");
		int ans = input.nextInt();
		if (ans == 1) {
			Mediadetail(store,cart);
		}else {
			cartMenu();
		}
	}
	// add media to cart
	public static void addtocart(Store store, Cart cart) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the title of the Media: ");
		String search = input.next();
		for (int i = 0; i < store.qtyAvailable; i++) {
			if (search.toLowerCase().equals(store.itemsInStore.get(i).getTitle().toLowerCase())){
				cart.addMedia(store.itemsInStore.get(i));
				System.out.println("Added");
			}
		}
		System.out.println(cart.qtyOrdered);
	}
	/*
	// update store
	public static void updatestore(Store store) {
		System.out.println("1. Add a Media to the store \n 2. Remove a Media from the store \n 0. Back");
		System.out.println("Please choose a number: 0-1-2");
		Scanner input = new Scanner(System.in);
		int ans = input.nextInt();
		if (ans == 1) { // add media
			System.out.println("Enter the Media: ");
			String mda = input.next();
			//store.addMedia(mda); // chua biet add media tu input
			System.out.println(mda + " has been added to the store");
		}else if (ans == 2) { //remove media
			System.out.println("Enter the Media: ");
			String mda = input.next();
			if (store.itemsInStore.contains(mda)) {
				//store.removeMedia(mda); //chua biet lam
				System.out.println(mda + " has been removed from the store");
			}else {
				System.out.println(mda + "isn't in the store");
			}
		}else { // back to main Menu
			showMenu();
		}
	}
	*/
	// place order
	public static void placeOrder(Cart cart) {
		System.out.println("Your order has been created: ");
		showCart(cart);
		Media lucky = cart.getALuckyItem(); // get lucky item
		if (lucky != null) {
			System.out.println("You have got a lucky item for free: /n" + lucky.getTitle());
		}
		cart.removeMedia(lucky);
		System.out.println("The total bill is: " + cart.totalCost() + "$");
		
		cart.itemsOrdered.clear();
		cart.qtyOrdered = 0;
	}
	//play media if playable
	public static void Play(ArrayList list) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the ID of the Media you want to play: ");
		int ID = input.nextInt();
		if (list.get(ID - 1) instanceof Book) {
			System.out.println("Cannot play a book!");
		}else if (list.get(ID - 1) instanceof DigitalVideoDisc) {
			((DigitalVideoDisc) list.get(ID - 1)).play();
		}else if (list.get(ID - 1) instanceof CompactDisc) {
			((CompactDisc) list.get(ID - 1)).play();
		}
	}
	
}
