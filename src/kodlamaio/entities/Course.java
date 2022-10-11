package kodlamaio.entities;

public class Course {

	private int id;
	private String courseName;
	private double price;
	private String imageUrl;

	public Course(int id, String courseName, double price, String imageUrl) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
