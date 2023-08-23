package di_p;

import java.util.Arrays;

public class Student {
	String name;
	int [] arr;
	int tot, avg, rk;
	
	
		public Student(String name, int[] arr) {
		this.name = name;
		this.arr = arr;
		
		calc();
		

	}
	
	void calc() {
		tot = 0;
		for(int i = 0; i<arr.length; i++) {
			tot += arr[i];
		}
		
		avg = tot / arr.length;
		
	}
	
	void rank(Student [] together) { 
		int rk = 1;
		for(Student std : together) {
			if(avg < std.avg) {
				rk++;
			}
		}
		 
	
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", arr=" + Arrays.toString(arr) + ", tot=" + tot + ", avg=" + avg + ", rk="
				+ rk + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRk() {
		return rk;
	}

	public void setRk(int rk) {
		this.rk = rk;
	}

	
	
}
