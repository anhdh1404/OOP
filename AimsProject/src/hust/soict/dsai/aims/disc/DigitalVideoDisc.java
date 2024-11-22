package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
	private String title;
	private static int nbDigitalVideoDisc = 0;
	
	private int id;
	
	private void assignUniqueId() {
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		assignUniqueId();
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        assignUniqueId();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        assignUniqueId();
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        assignUniqueId();
      
    
    }
}


