package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class BanMain {
	
	//2중 배열 느낌
	HashMap<String, String[]>data;
	
	public BanMain() {
		data = new HashMap<>();
		
		data.put("ban1","장동건,장서건,장남건,김동현,이동현,박동현,김찬호,박찬호".split(","));
		data.put("ban2","김남주,서희원,박해진,김슬기,이슬기,박지은,강하늘".split(","));
		data.put("ban3","김민재,고아라,박현준,신승현,탁재훈".split(","));
		data.put("ban4","김혁,이혁,신정환,김예원,이슬기".split(","));
	}
	
	public String [] getName(String name) {
		return data.get(name);
	}
	
	
}
