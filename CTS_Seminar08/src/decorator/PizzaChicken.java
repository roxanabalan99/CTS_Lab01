package decorator;

public class PizzaChicken extends DecoratorPizza{

	public PizzaChicken(APizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() +", chicken";
	}

	@Override
	public float getCost() {

		return super.getCost()+10;
	}
	
	

}
