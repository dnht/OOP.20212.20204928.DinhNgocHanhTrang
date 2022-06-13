package hust.soict.dsai.aims.media;
import java.time.LocalDate;

public abstract class Media implements Comparable<Media> {
	// add fields
	protected int id;
	public String title;
	protected String category;
	protected float cost;
	protected static int nbMedia = 0;
	protected LocalDate dateAdded;
	
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
	public class Disc extends Media{
		
	}
	// override equals()
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Media)) {
			return false;
		}
		Media other = (Media) o;
		return other.id == this.id;
	}
	// compareTo()
	@Override
	public int compareTo(Media obj) {
		if (this.title.compareTo(obj.title) == 0) {
			return this.category.compareTo(obj.category);
		}
		return this.title.compareTo(obj.category);
	}
	// 
	

}
