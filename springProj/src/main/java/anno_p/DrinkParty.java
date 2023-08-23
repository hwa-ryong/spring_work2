package anno_p;

public class DrinkParty {
	String name;
	
}

class Drink {
	String name;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}
	
}

class Dish {
	String name;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + "]";
	}
	
}
