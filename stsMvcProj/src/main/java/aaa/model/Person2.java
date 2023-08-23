package aaa.model;

import lombok.Data;

@Data
public class Person2 {
	
	String id, pw, pname, birth, gender;
	
	public Person2() {
		
	}

	public Person2(String id, String pw, String pname, String birth, String gender) {
		super();
		this.id = id;
		this.pw = pw;
		this.pname = pname;
		this.birth = birth;
		this.gender = gender;
	}
	
	
}
