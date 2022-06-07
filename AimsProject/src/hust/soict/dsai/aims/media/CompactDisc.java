package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return this.artist;
	}

	public CompactDisc(String artist, ArrayList<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}
	public float getLength() {
		int sum = 0;
		for (Track i : tracks) {
			sum += i.getLength();
		}
		return sum;
	}
	//addTrack
	public void addTrack(Track trk) {
		if (tracks.contains(trk)) {
			System.out.println("The track is already in the list");
		}
		else {
			tracks.add(trk);
			System.out.println(trk + "has been added");
		}
	}
	//removeTrack
	public void removeTrack(Track trk) {
		if (tracks.contains(trk)) {
			tracks.remove(trk);
			System.out.println(trk + "has been removed");
		}
		else {
			System.out.println("Cannot find this track");
		}
	}
	//playable
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for (Track i : tracks) {
			i.play();
		}
		System.out.println("The end!");
	}
	
}
