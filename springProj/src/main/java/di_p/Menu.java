package di_p;

public class Menu {
	String name;
	int price;
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "메뉴 [name=" + name + ", price=" + price + "]";
	}
	
	
}
