package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.*;

public class Store {
	public static final int max = 1000;
	public ArrayList<Media> itemsInStore = new
			ArrayList<Media>(max);
	public int qtyAvailable = 0; 
	
	//add media
	public void addMedia(Media md1){ //add bang doi tuong
		if (qtyAvailable == max ) {
			System.out.println("The store is almost full");
		}
		else {
			itemsInStore.add(md1);
			qtyAvailable++;
		}
	}
	//remove media
	public void removeMedia(Media md) {
		if (itemsInStore.contains(md)) {
			itemsInStore.remove(md);
			qtyAvailable--;
		}
		else {
			System.out.println(md +"is not in the store");
		}
	}
	
}
