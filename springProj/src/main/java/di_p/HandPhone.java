package di_p;

import java.util.List;

public class HandPhone {
	
	String name;
	Camera cam;
	Battery bat;
	List<Display> dis;
	
	public HandPhone() {
		
	}
	
	public HandPhone(String name, Camera cam, Battery bat, List<Display> disdis) {
		super();
		this.name = name;
		this.cam = cam;
		this.bat = bat;
		this.dis = disdis;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public void setBat(Battery bat) {
		this.bat = bat;
	}

	public void setDis(List<Display> dis) {
		this.dis = dis;
	}

	@Override
	public String toString() {
		return  name + "\n" + cam + "\n" + bat + "\n" + dis + "\n";
	}
	
	
}



