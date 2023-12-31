package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.BanData;
import aaa.model.BanMain;
import aaa.model.MenuData;
import aaa.model.SeasonMain;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/ban")
public class BanController {
	
	@Resource
	BanMain bm;
	
	@ModelAttribute("banNav")
	Object headerNav() {
		ArrayList<BanData>res = new ArrayList<>();
		res.add(new BanData("ban1", "1반"));
		res.add(new BanData("ban2", "2반"));
		res.add(new BanData("ban3", "3반"));
		res.add(new BanData("ban4", "4반"));
		return res;
	}
	
	@ModelAttribute("mainCt")
	Object mainContent(
			@RequestParam(value = "bb", defaultValue = "ban1") String bb) {
		
		return bm.getName(bb);
	}
	
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		
		return "Footer";
	}
	

	@RequestMapping("classclass")
	String template() {
		return "ban/template";
	}
}
