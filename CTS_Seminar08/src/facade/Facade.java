package facade;

public class Facade {

	public static void reservation(String iLocation, String dest) {
		Airline company = new Airline("BlueAir");
		Flight toGo = company.flightBooking(iLocation, dest);
		Flight back = company.flightBooking(dest, iLocation);
		
		Hotel hotel = new Hotel("Radisson");
		hotel.roomBooking(dest);
	}
}
