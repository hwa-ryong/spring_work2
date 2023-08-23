package anno_p.cof.cof1;



import anno_p.cof.sub1.Water;
import anno_p.cof.sub2.BeanBean;


public class Latte {
	
	String name = "카페라떼";
	
	Water water;
	
	BeanBean bean;
	
	int price = 3000;

	public Latte(String name, Water water, BeanBean bean, int price) {
		super();
		this.name = name;
		this.water = water;
		this.bean = bean;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Latte [name=" + name + ", water=" + water + ", bean=" + bean + ", price=" + price + "]";
	}
	
	
}
