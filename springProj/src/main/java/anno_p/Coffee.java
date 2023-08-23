package anno_p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Coffee {
	
	String name;
	int price;
	
	@Autowired(required = false)
	Coffeebean cfb;
	
	@Autowired
	@Qualifier("igd3")
	Ingredient igd;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void setCfb(Coffeebean cfb) {
		this.cfb = cfb;
	}
	
	
	public void setIgd(Ingredient igd) {
		this.igd = igd;
	}
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", cfb=" + cfb + ", igd=" + igd + "]";
	}
	
	
	
}

class Coffeebean {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coffeebean [name=" + name + "]";
	}
	
	
}

class Ingredient {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + "]";
	}
	
	
}
