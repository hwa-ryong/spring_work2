package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.CoffeeShop;
import di_p.HandPhone;

public class HandPhone_Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/handphone.xml");
		
		System.out.println("핸드폰 : " + context.getBean("hp1"));
		System.out.println("핸드폰 : " + context.getBean("hp2"));
		
		
	}

}
