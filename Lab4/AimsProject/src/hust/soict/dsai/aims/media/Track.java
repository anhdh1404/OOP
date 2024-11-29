package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private int length;
	private String title;
	
	public int getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        return ((Track)obj).getTitle() == this.getTitle() && ((Track)obj).getLength() == this.getLength();
    }
}
	
	
	


