package factory;

public class Main {

	public static void main(String[] args) {
		IWeapon weapon;
		try {
			weapon = WeaponFactory.createWeapon(630);
			weapon.power();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
