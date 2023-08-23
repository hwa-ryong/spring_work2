package anno_p.cof;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import anno_p.cof.cof1.Americano;
import anno_p.cof.cof1.Latte;
import anno_p.cof.cof1.Maggiatto;
import anno_p.cof.sub1.Water;
import anno_p.cof.sub2.BeanBean;
import jakarta.annotation.Resource;

@Configuration
public class Coffee {
	
	
	@Bean
	Water w1() {
		return new Water("물");
	}
	
	@Bean(name="bb")
	BeanBean b1() {
		return new BeanBean();
	}
	
	
	@Bean
	Americano cf1() {
		return new Americano("아메리카노", w1(), b1(), 1500);
	}
	
	@Bean
	Latte cf2() {
		return new Latte("라떼", w1(), b1(), 3000);
	};
	
	@Bean
	Maggiatto cf3() {
		return new Maggiatto("캬라멜마끼아또", w1(), b1(), 3500);
	};
	
	
	
}
