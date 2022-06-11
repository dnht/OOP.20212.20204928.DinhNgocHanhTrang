package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.dateAdded = LocalDate.now(); 
		this.id = nbMedia + 1;
		nbMedia += 1;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbMedia + 1;
		nbMedia += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbMedia + 1;
		nbMedia += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbMedia + 1;
		nbMedia += 1;
	}
	public String getDirector() {
		return director;
	}
	public float getLength() {
		return length;
	}
	private String director;
	private int length;

	public String toString() {
		return "DVD - " +title + " - " + category + " - " + director +" - " +length +": "+cost +"$";
	}
	public boolean isMatch(String title) {
		if (this.title.toLowerCase().contains(title.toLowerCase())) {
			return true;
		}else {
			return false;
		}
	}
	
	//playable
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		if(this.getLength() <= 0) {
			System.out.println("This DVD cannot br played");
		}
	}
}
