package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.Area;




public class AreaMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/area.xml");
		
		Area are = context.getBean("area",Area.class);
		
		System.out.println("area.Circle:"+are.Circle(2,3));
		System.out.println("---------------");
		System.out.println("area.Circle2:"+are.Circle2(2,3));
		System.out.println("---------------");
		System.out.println("area.Square:"+are.Square(5,6));
		System.out.println("---------------");
		System.out.println("area.Square2:"+are.Square2(5,6));
		System.out.println("---------------");
		System.out.println("area.Triangle:"+are.Triangle(3,4));
		System.out.println("---------------");
		System.out.println("area.Triangle2:"+are.Triangle2(3,4,5));
		System.out.println("---------------");
		
		
	}

}
