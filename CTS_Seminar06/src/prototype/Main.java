package prototype;

public class Main {

	public static void main(String args[]) throws CloneNotSupportedException{
		Bookshop carturesti = Bookshop.loadDataFromDB("carturesti");
		System.out.println(carturesti);
		
		//System.out.println("Shallow copy");
		//Bookshop diverta = carturesti;
		//diverta.getBooks().remove(3);
		//System.out.println(carturesti);
		//System.out.println();
		
		System.out.println("Deep copy");
		Bookshop libra = (Bookshop)carturesti.clone();
		libra.getBooks().remove(3);
		System.out.println(carturesti);
		System.out.println(libra);
	}
	
}
