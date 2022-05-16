package solid.resolved;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		IOperation add = new AddOperation();
		
		calculator.calculate(10, 2, add);
	}

}
