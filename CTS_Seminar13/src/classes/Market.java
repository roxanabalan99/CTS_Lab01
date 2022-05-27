package classes;

public class Market {

	private String name;
	private int area;
	private TypeMarket type;
	public Market(String name, int area, TypeMarket type) {
		super();
		this.name = name;
		this.area = area;
		this.type = type;
	}
	public Market() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public TypeMarket getType() {
		return type;
	}
	public void setType(TypeMarket type) {
		this.type = type;
	}
	
	
	
	
}
