package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coffee_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/bean2.xml");
		
		
		System.out.println(context.getBean("w1"));
		System.out.println(context.getBean("bb"));
		System.out.println(context.getBean("cf1"));
		System.out.println(context.getBean("cf2"));
		System.out.println(context.getBean("cf3"));
	}

}
