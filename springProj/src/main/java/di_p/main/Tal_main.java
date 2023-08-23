package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Basket;
import di_p.Bicycle;
import di_p.HandPhone;
import di_p.Handle;
import di_p.Wheel;

public class Tal_main {

	public static void main(String[] args) {
		
		Bicycle b1 = new Bicycle();
		Bicycle pocari = new Bicycle();
		Bicycle mtb = new Bicycle();
		Handle h1 = new Handle();
		Handle h2 = new Handle();
		Handle h3 = new Handle();
		Wheel w1 = new Wheel();
		Wheel w2 = new Wheel();
		Wheel w3 = new Wheel();
		Basket bk = new Basket();
		
		//세발 자전거
		b1.setName("세발자전거");
		w1.setName("앞바퀴");
		w2.setName("뒷바퀴1");
		w3.setName("뒷바퀴2");
		b1.setWheel(w1);
		b1.setWheel(w2);
		b1.setWheel(w3);
		h1.setName("핸들");
		b1.setHandle(h1);
		
		//포카리자전거
		pocari.setName("포카리자전거");
		w2.setName("앞바퀴");
		pocari.setWheel(w2);
		h2.setName("핸들");
		pocari.setHandle(h2);
		bk.setName("바구니");
		pocari.setBasket(bk);
		
		//MTB 
		mtb.setName("MTB");
		w3.setName("앞바퀴");
		mtb.setWheel(w3);
		h3.setName("핸들");
		mtb.setHandle(h3);
		
	
		/*
		 * System.out.println(b1);
		 * 
		 * System.out.println(pocari);
		 * 
		 * System.out.println(mtb);
		 */
		
		System.out.println("============================================");
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/first.xml");
		
		Bicycle b2 = (Bicycle)context.getBean("b2");
		Bicycle pocari1 = (Bicycle)context.getBean("pocari1");
		Bicycle mtb1 = (Bicycle)context.getBean("mtb1");

		System.out.println(b2);
		System.out.println(pocari1);
		System.out.println(mtb1);
		

	}

}
