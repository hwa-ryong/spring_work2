package aaa;

public class test {

	public static void main(String[] args) {
		
		/*
		 * String str1 = "Hello"; String str2 = "abcde";
		 * 
		 * StringBuffer str = new StringBuffer(str1); String reverse =
		 * str.reverse().toString();
		 * 
		 * System.out.println(str1); System.out.println(reverse);
		 */
		/*
		 * String str = "wwhwgsdfsdf.google.casdffsdhomsdf";
		 * 
		 * System.out.println(str.replaceAll(".*?(google).*", "$1").toUpperCase());
		 */
		//("\\.") \\는 뒤에 .을 인식시킴.
		String g = "wwwsdfs.google.comaaa".split("\\.")[1].toUpperCase();
		System.out.println(g);
			 
			   

	}

}
