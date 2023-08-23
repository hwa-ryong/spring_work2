package anno_p.cof;

import java.util.Arrays;
import java.util.Scanner;

public class sadsa {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		
		int [] abc = new int[5];
		
		for(int i=0; i<5; i++) {
			abc[i]=sc.nextInt();
		
		}
				
		System.out.println(Arrays.toString(abc));
		
		int max=0; 
		int min=0;
		int sum=0;
		
		for(int i=0; i<5; i++) {
			max=abc[0];
			min=abc[0];
			
			if(max<abc[i]) {
				max= abc[i];
			}
			if(min>abc[i]) {
				min= abc[i];
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);
		
		
	}

}
