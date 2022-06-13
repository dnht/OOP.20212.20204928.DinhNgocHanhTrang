package hust.soict.dsai.aims.media;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	// author
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println(authorName + " is already in the list");
		}else {
			authors.add(authorName);
			System.out.println(authorName + " has been added");
		}
	}
	public void removeAuthor(String authorName){
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println(authorName +" has been removed");
		}else {
			System.out.print(authorName +" is not in the list");
		}
	}
	private String content;
	// constructor
	public Book(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now() ;
		this.id = nbMedia + 1;
		nbMedia += 1;
	}
	//toString()
	public String toString(){
		return "Book - "+title +" - "+category+"\nAuthors: " + authors.toString();
	}
}
