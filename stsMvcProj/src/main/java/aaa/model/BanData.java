package aaa.model;

import lombok.Data;

@Data
public class BanData {
	
	String url, txt;

	public BanData(String url, String txt) {
		super();
		this.url = url;
		this.txt = txt;
	}
	
	
}
