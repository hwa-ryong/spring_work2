package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Member;
import aaa.model.StudentData;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {
	
	
	@RequestMapping("login1")
	String login1(HttpServletResponse response) {
		
		response.addCookie(new Cookie("pid","aaa"));
		response.addCookie(new Cookie("pw","1234"));
		return "login/login1";
	}
	
	@RequestMapping("delete1")
	@ResponseBody
	String delete1(HttpServletResponse response) {
		Cookie coo = new Cookie("pid","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("pw","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		return "login/loginForm";
	}
	
	@RequestMapping("loginForm")
	ModelAndView loginForm(
			@CookieValue(value = "pid", defaultValue = "없음" ) String pid,
			@CookieValue(value = "pw", defaultValue= "1111") String pw) {
		
		ModelAndView mav = new ModelAndView("login/loginForm");
		mav.addObject("pid",pid);
		mav.addObject("pw",pw);
		return mav;
	}
	
}
