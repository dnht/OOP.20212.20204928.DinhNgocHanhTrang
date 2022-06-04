package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public class Media {
	// add fields
	private int id;
	private String title;
	private String category;
	private float cost;
	private int nbMedia = 0;
	private LocalDate dateAdded;
	
	// accessor methods
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	//extend 
	public class Book extends Media{
		
	}
	public class DigitalVideoDisc extends Media{
		
	}
	public Media() {
		// TODO Auto-generated constructor stub
	}

}
