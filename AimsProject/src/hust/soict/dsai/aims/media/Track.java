package hust.soict.dsai.aims.media;

public class Track implements Playable, Comparable<Track>{

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
	//override equals
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Track)) {
			return false;
		}
		Track other = (Track) o;
		boolean titleEquals = (this.title == null && other.title == null)
				|| (this.title != null && this.title.equals(other.title));
		return this.length == other.length && titleEquals;
				
	}
	// compareTo()
	public int compareTo(Track o) {
		if (this.title.compareTo(o.title) == 0) {
			if (this.length > o.length) {
				return 1;
			}else if (this.length < o.length) {
				return -1;
			}else {
				return 0;
			}
		}
		return this.title.compareTo(o.title);
	}
	
}
