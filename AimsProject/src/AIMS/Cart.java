package AIMS;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
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
			if (itemOrdered[i] == disc) {
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
	
	
	
	
}
