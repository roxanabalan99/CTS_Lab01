package builder_solved;

public class Main {

	public static void main(String[] args) {
		User u = new User.UserBuilder("a@gmail.com", "a@gmail.com", "a", "b").address("Bucharest").build();
		User u2 = new User.UserBuilder("a@gmail.com", "a@gmail.com", "a", "b").phoneNo("0740123456").build();

		System.out.println(u);
		System.out.println(u2);

	}

}
