package hust.soict.dsai.aims.utils;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class DVDUtils {
	public static boolean compareByCost(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		if (o1.getCost() == o2.getCost()) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean compareByTitle(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String Name_1 = o1.getTitle();
		String Name_2 = o2.getTitle();
		if (Name_1.equals(Name_2)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] list) {
		DigitalVideoDisc temp = list[0];
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i].getCost() > list[j].getCost()) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
		
	}
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] list) {
		DigitalVideoDisc temp = list[0];
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i].getTitle().compareTo(list[j].getTitle()) > 0) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
	}
	
}
