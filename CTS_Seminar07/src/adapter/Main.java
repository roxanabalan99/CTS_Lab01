package adapter;

public class Main {

	public static void main(String[] args) {
		
		IDiscountA disca = new AdapterA2B();
		System.out.println(disca.calculateDiscountA(100));
		
		IDiscountB discb = new AdapterB2A();
		Customer c = new Customer();
		System.out.println(discb.calculateDiscountB(c));
	}

}
