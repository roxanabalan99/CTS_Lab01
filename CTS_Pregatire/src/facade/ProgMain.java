package facade;

public class ProgMain {

	public static void main(String[] args) {
		//Brut - fara facade:
		//5:
		Hotel hotel = new Hotel("London Hilton");
		hotel.roomBooking("London");
		
		Airline airline = new Airline("BlueAir");
		Flight toGo = new Flight("Bucharest", "London", airline);
		Flight back = new Flight("London", "Bucharest", airline);
		
		//7:
		Facade.reservation("Bucharest", "London");
		
	}

}
