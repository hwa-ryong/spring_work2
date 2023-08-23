package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Restaurant;

public class Menu_Main {

	public static void main(String[] args) {
			
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/menu.xml","di_xml/ingredient.xml");
		
		Restaurant mn = context.getBean("mn",Restaurant.class);
		
		System.out.println("아침 식단 : " + mn.breakfast());
		
		System.out.println("점심 식단 : " + mn.lunch());
		
		System.out.println("저녁 식단 : " + mn.dinner());
		

	}

}
