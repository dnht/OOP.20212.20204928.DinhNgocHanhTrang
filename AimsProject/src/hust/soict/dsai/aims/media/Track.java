package hust.soict.dsai.aims.media;

public class Track implements Playable {

	public Track() {
		// TODO Auto-generated constructor stub
	}
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	//playable
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		if (this.getLength()<= 0) {
			System.out.println("This track cannot be played");
		}
	}
	
}
