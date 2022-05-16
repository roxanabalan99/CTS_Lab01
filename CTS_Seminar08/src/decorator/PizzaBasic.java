package decorator;

public class PizzaBasic extends APizza{

	@Override
	public String getIngredients() {
		return "mozzarella, tomato";
	}

	@Override
	public float getCost() {
		
		return 20;
	}

}
