package ro.ase.acs.classes;

public class Utils {

	public Utils() {
		
	}
	
	public static int getMin(int vector[], int elem) {
		if(vector.length > 0) {
			int min = vector[0];
			
			for(int i = 0; i<vector.length; i++) {
				if (vector[i] < min)
					min = vector[i];
			}
			
			return min;
		}
		else return 0;
	}
}
