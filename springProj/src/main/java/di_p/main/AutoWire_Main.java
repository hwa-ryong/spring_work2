package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;

public class AutoWire_Main {

	public static void main(String[] args) {
		
		//xml 여러개를 가져와도 상관이 없다.
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/autowire.xml", "di_xml/autoparts.xml");

		System.out.println("car1 : " + context.getBean("car1"));
		System.out.println("car2 : " + context.getBean("car2"));
		System.out.println("car3 : " + context.getBean("car3"));
		System.out.println("car3 : " + context.getBean("car4"));
		
		
	
	}

}
