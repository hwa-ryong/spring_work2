package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.HambugerSet;

public class Hambuguer_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/first.xml");
		
		HambugerSet hs1 = context.getBean("hs1",HambugerSet.class);
		System.out.println(hs1);
		
		
	}

}
