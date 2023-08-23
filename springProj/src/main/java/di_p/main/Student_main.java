package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Student;

public class Student_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/student.xml");
				
		
		Student std1 = (Student)context.getBean("std1");
		System.out.println(std1);
		Student std2 = (Student)context.getBean("std2");
		System.out.println(std2);
		Student std3 = (Student)context.getBean("std3");
		System.out.println(std3);
		Student std4 = (Student)context.getBean("std4");
		System.out.println(std4);
		Student std5 = (Student)context.getBean("std5");
		System.out.println(std5);
		
		
		
		
		
		
	}

}
