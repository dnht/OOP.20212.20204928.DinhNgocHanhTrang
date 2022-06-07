package hust.soict.dsai.aims.media;

public class Disc extends Media {

	public Disc() {
		// TODO Auto-generated constructor stub
	}
	//fields
	private float length;
	private String director;
	public float getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	//constructor
	public Disc(float length, String director) {
		super();
		this.length = length;
		this.director = director;
		this.id = nbMedia + 1;
		nbMedia++;
	}
	//extends
	public class DigitalVideoDisc extends Disc{
		
	}
	public class CompactDisc extends Disc{
		
	}
	

}
