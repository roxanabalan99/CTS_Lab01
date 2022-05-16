package facade;

public class Facade {

	//6:
	public static void reservation(String initialLocation, String destination) {
		Hotel hotel = new Hotel("London Hilton");
		hotel.roomBooking(destination);
		
		Airline airline = new Airline("BlueAir");
		Flight toGo = new Flight(initialLocation, destination, airline);
		Flight back = new Flight(destination, initialLocation, airline);
		System.out.println("Reservation complete!");
	}
}
