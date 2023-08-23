package di_p;

public class Bicycle {
	
	String name;
	Wheel wheel;
	Wheel wheel2;
	Wheel wheel3;
	Handle handle;
	Basket basket;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wheel getWheel2() {
		return wheel2;
	}
	public void setWheel2(Wheel wheel2) {
		this.wheel2 = wheel2;
	}
	public Wheel getWheel3() {
		return wheel3;
	}
	public void setWheel3(Wheel wheel3) {
		this.wheel3 = wheel3;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Handle getHandle() {
		return handle;
	}
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	@Override
	public String toString() {
		return name + " " + wheel + wheel2 + wheel3 + " " + handle + " " + basket;
	}
	
	
	
}
