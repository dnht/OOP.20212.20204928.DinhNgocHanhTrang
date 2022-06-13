package hust.soict.dsai.test.media;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.*;
public class TestMediaCompareTo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Collection collection = new ArrayList();
		//create new instance
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Barbie1","Animation",20);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Barbie2","Animation",21);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Barbie3","Animation",23);
		//add the DVD to the ArrayList
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);
		
		//itarete & output
		// unsorted order
		java.util.Iterator iterator = collection.iterator();
		System.out.println("-----------------------------");
		System.out.println("The DVDs currently in the order are: ");
		
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		//Sort based on CompareTo
		java.util.Collections.sort((java.util.List)collection);
		
		//
		iterator = collection.iterator();
		System.out.println("-----------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("-----------------------------");
	}

}
