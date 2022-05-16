package o.resolved;

public class Main {

	public static void main(String[] args) {
		Employee empMada = new FTEEmployee(1, "Mada", 2000);
		System.out.println(empMada.toString() + " bonus: " + empMada.calculateBonus());
	}

}
