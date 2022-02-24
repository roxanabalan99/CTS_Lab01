package ro.ase.acs.classes;
import ro.ase.acs.classes.Utils;

public class Main {

	public static void main(String[] args) {
		int vector[] = {7, 8, 15, 44, 32};
		
		int minim = Utils.getMin(vector, 0);
		System.out.println(minim);
	}

}
