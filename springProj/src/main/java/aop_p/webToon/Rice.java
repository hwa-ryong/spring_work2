package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Rice {
	
	String name;
	int price;
	
	
	public String Bob1(int price) {
		
		System.out.println("제육덮밥 " + price + "원");
		return "제육덮밥";
	}
	
	public String Bob2(int price) {
		
		System.out.println("불고기덮밥 " + price + "원");
		return "불고기덮밥";
	}
	
	public String GGigae1(int price) {
		
		System.out.println("김치찌개 " + price + "원");
		return "김치찌개";
	}
	
	public String GGigae2(int price) {
		
		System.out.println("된장찌개 " + price + "원");
		return "된장찌개";
	}

}




