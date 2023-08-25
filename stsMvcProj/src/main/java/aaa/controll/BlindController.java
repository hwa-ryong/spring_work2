package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Blind;

@Controller
@RequestMapping("/blind")
public class BlindController {
	
	@RequestMapping("blind")
	String blind(Blind bl) {
		return "blind/blind";
	}
}
