package decorator;

public class Main {

	public static void main(String[] args) {
		APizza pizzaBasic = new PizzaBasic();
		System.out.println(pizzaBasic.getIngredients()+pizzaBasic.getCost());
		
		APizza pizzaChicken = new PizzaChicken(pizzaBasic);
		System.out.println(pizzaChicken.getIngredients()+pizzaChicken.getCost());
	}
}
