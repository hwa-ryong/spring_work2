package aop_p.webToon;

public class Order {
	
	int tot, cnt;
	
	void add(Rice rc) {
		tot += rc.price;
		cnt ++;
	}

	@Override
	public String toString() {
		return "Order [tot=" + tot + ", cnt=" + cnt + "]";
	}

	
}
