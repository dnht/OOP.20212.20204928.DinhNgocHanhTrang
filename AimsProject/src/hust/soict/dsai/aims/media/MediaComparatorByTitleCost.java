package hust.soict.dsai.aims.media;
import java.util.Collections;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	//sort by title
	Collections.sort(collection, Compare);
	
	Comparator<Media> Compare = new Comparator<Media>(){
		@Override
		public int compare(Media t1, Media t2){
			if(t1.title != t2.title) {
				return t1.getTitle().compareTo(t2.getTitle());
			}
			else {
				return t1.getCost() > t2.getCost() ? 1 : -1;
			}
		}
	};
	public MediaComparatorByTitleCost() {
		super();
	}
}
