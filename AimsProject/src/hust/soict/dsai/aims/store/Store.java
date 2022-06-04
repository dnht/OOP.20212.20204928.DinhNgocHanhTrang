package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	public static final int max = 1000;
	public DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[max];
	public int qtyAvailable = 0; 
	
	//add DVD
	public void addDVD(DigitalVideoDisc disc){
		if (qtyAvailable == max ) {
			System.out.println("The store is almost full");
		}
		else {
			itemsInStore[qtyAvailable] = disc;
			System.out.println("The disc has been added");
			qtyAvailable++;
		}
		
	}
	//remove DVD
	public void removeDVD(DigitalVideoDisc disc) {
		int count = 0;
		for (int i = 0; i < qtyAvailable; i++) {
			if (itemsInStore[i].equals(disc)) {
				count ++;
				itemsInStore[i] = itemsInStore[i+1];
				for (int j = i+1; j < qtyAvailable; j++) {
					itemsInStore[j] = itemsInStore[j+1];
				}
			}
		}
		System.out.println("The disc has been removed");
		qtyAvailable -= count;
	}
	
}
