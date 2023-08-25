package aaa.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinData {
	
	//@NotEmpty(message = "아이디가 없오")
	@Size(min = 3, max = 10)
	String pid;
	
	String pname;
	String pw1;
	String pw2;
	String email;
	String phone;
	int age;
}
