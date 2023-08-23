package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Component_main2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/component2.xml");

		
		//System.out.println(context.getBean("wm1"));
		
		System.out.println(context.getBean("coffee"));
		System.out.println("============================================================================");
		System.out.println(context.getBean("ameri"));
		System.out.println(context.getBean("latte"));
		System.out.println(context.getBean("maggiatto"));
		
		context.close();
		
				
	}

}
