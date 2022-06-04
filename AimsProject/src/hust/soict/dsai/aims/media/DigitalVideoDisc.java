package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public class DigitalVideoDisc {
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.dateAdded = LocalDate.now(); 
		this.id = nbDigitalVideoDisc + 1;
		nbDigitalVideoDisc += 1;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbDigitalVideoDisc + 1;
		nbDigitalVideoDisc += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbDigitalVideoDisc + 1;
		nbDigitalVideoDisc += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbDigitalVideoDisc + 1;
		nbDigitalVideoDisc += 1;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	private String director;
	private int length;
	private LocalDate dateAdded;

	private static int nbDigitalVideoDisc = 0;
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
}
