package di_p;

import java.util.List;
import java.util.TreeSet;

public class Exam {

	List<Stud> studs;

	public List<Stud> getStuds() {
		return studs;
	}
	
	// 리스트 한꺼번에 가지고 왔는데 등수도 계산해줘.
	public void setStuds(List<Stud> studs) {
		this.studs = studs;
		
		for (Stud st : studs) {
			st.rankCalc(studs);
		}
	}
	
	public TreeSet<Stud> getSet(){
		return new TreeSet(studs);
	}
	
	
}

