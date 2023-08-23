package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.Order;
import aop_p.webToon.Rice;

public class ResMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/restaurant.xml");
		
		Rice ric = context.getBean("rice",Rice.class);
		
		System.out.println(ric.Bob1(8000));
		System.out.println("==================");
		System.out.println(ric.Bob2(7000));
		System.out.println("==================");
		System.out.println(ric.GGigae1(6000));
		System.out.println("==================");
		System.out.println(ric.GGigae2(6500));
		
		
		
	}

}
