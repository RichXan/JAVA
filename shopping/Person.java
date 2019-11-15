package shopping;

public class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Product Shopping (Market market,String name) {
		return market.sell(name);
	}
}
