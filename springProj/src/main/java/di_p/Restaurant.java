package di_p;

public class Restaurant {
	
	public Menu breakfast() {
		return new Menu("라면", 1500);
	}
	
	public Menu lunch() {
		return new Menu("순대 국밥", 9000);
	}
	
	public Menu dinner() {
		return new Menu("삼겹살", 13000);
	}
}
