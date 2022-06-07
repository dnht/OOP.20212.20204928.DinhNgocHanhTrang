package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;

public class StoreTest {
	public static void main(String arg[]) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", " Science Fiction",
				"George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		store.addMedia(dvd3);
		
		store.removeMedia(dvd3);
	}
}
