package decorator;

public class DecoratorPizza extends APizza {
	protected APizza pizza;

	public DecoratorPizza(APizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getIngredients() {
		return pizza.getIngredients();
	}

	@Override
	public float getCost() {
		return pizza.getCost();
	}

}
