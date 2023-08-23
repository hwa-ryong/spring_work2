package anno_p.cof.cof1;


import anno_p.cof.sub1.Water;
import anno_p.cof.sub2.BeanBean;


public class Americano {
	
	String name = "아메리카노"; 
	
	Water water;
	
	BeanBean bean;
	
	int price = 1500;

	public Americano(String name, Water water, BeanBean bean, int price) {
		super();
		this.name = name;
		this.water = water;
		this.bean = bean;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Americano [name=" + name + ", water=" + water + ", bean=" + bean + ", price=" + price + "]";
	}

}
