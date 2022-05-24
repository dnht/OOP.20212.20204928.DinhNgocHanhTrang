package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if (qtyOrdered == MAX_NUMBERS_ORDERED ) {
			System.out.println("The cart is almost full");
		}
		else {
			itemOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered++;
		}
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int count = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].equals(disc)) {
				count ++;
				itemOrdered[i] = itemOrdered[i+1];
				for (int j = i+1; j < qtyOrdered; j++) {
					itemOrdered[j] = itemOrdered[j+1];
				}
			}
		}
		System.out.println("The disc has been removed");
		qtyOrdered -= count;
	}
	public void totalCost() {
		float sum = 0;
		for (int i =0; i < qtyOrdered; i++ ) {
			sum += itemOrdered[i].getCost();
		}
		System.out.println(sum);
	}
	
	// working with method overloading
	// 10.1
	public void addDigitalVideoDisc (DigitalVideoDisc [] dvdList) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED ) {
			System.out.println("The cart is almost full");
		}
		else {
			for (int i = 0; i < dvdList.length; i++) {
				itemOrdered[qtyOrdered] = dvdList[i];
				System.out.println(dvdList[i]+ " has been added");
				qtyOrdered++;
				if (qtyOrdered == MAX_NUMBERS_ORDERED) {
					System.out.println("The cart is almost full");
					break;
				}
			}
		}
	}
	
	// 10.2
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		if (qtyOrdered == MAX_NUMBERS_ORDERED ) {
			System.out.println("The cart is almost full");
		}
		else {
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			if (qtyOrdered == MAX_NUMBERS_ORDERED ) {
				System.out.println("The cart is almost full");
			}
			else{
				itemOrdered[qtyOrdered] = dvd2;
				qtyOrdered++;
			}
		}
	}
	//sort cart by cost
	public void sortByCost() {
		DigitalVideoDisc temp = itemOrdered[0];
		for (int i = 0; i < qtyOrdered - 1; i++) {
			for (int j = i + 1; j < qtyOrdered; j++) {
				if (itemOrdered[i].getCost() > itemOrdered[j].getCost()) {
					temp = itemOrdered[j];
					itemOrdered[j] = itemOrdered[i];
					itemOrdered[i] = temp;
				}
			}
		}
		System.out.println("Sort the cart by cost: ");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemOrdered[i].toString());
		}
	}
	//sort cart by title
	public void sortByTitle() {
		DigitalVideoDisc temp = itemOrdered[0];
		for (int i = 0; i < qtyOrdered - 1; i++) {
			for (int j = i + 1; j < qtyOrdered; j++) {
				if (itemOrdered[i].getTitle().compareTo(itemOrdered[j].getTitle()) > 0) {
					temp = itemOrdered[j];
					itemOrdered[j] = itemOrdered[i];
					itemOrdered[i] = temp;
				}
			}
		}
		System.out.println("Sort the cart by title: ");
		for (int i = 0; i < qtyOrdered; i++ ) {
			System.out.println(itemOrdered[i].toString());
		}
	}
	
	//search DVD by ID
	public void searchByID(int j) {
		int cnt = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (j == itemOrdered[i].getID()){
				System.out.println("Found: "+itemOrdered[i].toString());
				cnt += 1;
			}
		}
		if (cnt == 0) {
			System.out.println("Cannot found");
		}
	}
	
	//print the list of DVD in cart order by alpha / cost / length 
	public void showTheCart() {
		//alphabetical
		DigitalVideoDisc[] copy = itemOrdered;
		DigitalVideoDisc temp = copy[0];
		for (int i = 0; i < qtyOrdered - 1; i++) {
			for (int j = i + 1; j < qtyOrdered; j++) {
				if (copy[i].getTitle().compareTo(copy[j].getTitle()) > 0) {
					temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		//price
		DigitalVideoDisc temp2 = copy[0];
		for (int i = 0; i < qtyOrdered - 1; i++) {
			for (int j = i + 1; j < qtyOrdered; j++) {
				if (copy[i].getTitle().equals(copy[j].getTitle())) {
					if (copy[i].getCost() < copy[j].getCost()) {
						temp2 = copy[j];
						copy[j] = copy[i];
						copy[i] = temp2;
					}
				}
			}
		}
		//length
		DigitalVideoDisc temp3 = copy[0];
		for (int i = 0; i < qtyOrdered - 1; i++) {
			for (int j = i + 1; j < qtyOrdered; j++) {
				if (copy[i].getCost() == copy[j].getCost()) {
					if (copy[i].getLength() < copy[j].getLength()) {
						temp3 = copy[j];
						copy[j] = copy[i];
						copy[i] = temp3;
					}
				}
			}
		}
		//print the result
		System.out.println("**********************************CART**********************************");
		System.out.println("Ordered Items: ");
		float sum = 0;
		for (int i = 0; i < qtyOrdered;i++) {
			sum += copy[i].getCost();
			System.out.println(i+1+". " + copy[i].toString());
		}
		System.out.println("Total cost: "+sum);
		System.out.println("************************************************************************");
	} //end
	
	//search cart by title
	public void searchByTitle(String key) {
		int cnt = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].isMatch(key)){
				System.out.println("Found: "+itemOrdered[i].toString());
				cnt += 1;
			}
		}
		if (cnt == 0) {
			System.out.println("Cannot found");
		}
	}
	
	
}
