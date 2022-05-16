package facade;

public class Hotel {

	//1:
	private String name;

	public Hotel(String name) {
		super();
		this.name = name;
	}
	
	public void roomBooking(String location) {
		System.out.println("Hotel "+name+" at location "+location);
	}
	
}
