package anno_p.cof.cof1;



import anno_p.cof.sub1.Water;
import anno_p.cof.sub2.BeanBean;

public class Maggiatto {
	
	String name = "카라멜마끼아또";
	
	Water water;
	
	BeanBean bean;
	
	int price = 3500;

	public Maggiatto(String name, Water water, BeanBean bean, int price) {
		super();
		this.name = name;
		this.water = water;
		this.bean = bean;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Maggiatto [name=" + name + ", water=" + water + ", bean=" + bean + ", price=" + price + "]";
	}

	
	
	
	
}
