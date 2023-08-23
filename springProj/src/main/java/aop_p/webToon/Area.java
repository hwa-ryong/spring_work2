package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Area {
	
	int doole;
	int are3;
	
	public String Circle(int r, int PI) {
		are3 = (int)(r*r*PI);
		System.out.println("원의 넓이는 " + are3);
		return "원의 넓이";
	}
	
	public String Circle2(int r, int PI) {
		doole = (int)(2*r*PI);
		System.out.println("원의 둘레는 " + doole);
		return "원의 둘레";
	}
	
	public String Square(int a, int b) {
		are3 = a * b;
		System.out.println("직사각형의 넓이는 " + are3);
		return "직사각형의 넓이";
	}
	
	public String Square2(int a, int b) {
		doole = (a+b)*2;
		System.out.println("직사각형의 둘레는 " + doole);
		return "직사각형의 둘레";
	}
	
	public String Triangle(int c, int d) {
		are3 = (c*d)/2;
		System.out.println("직각삼각형의 넓이는 " + are3);
		return "직각삼각형의 넓이";
	}
	
	public String Triangle2(int c, int d, int e) {
		doole = c+d+e;
		System.out.println("직각삼각형의 둘레는 " + doole);
		return "직각삼각형의 둘레";
	}
}
