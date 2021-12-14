package assign9;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	int getTotal(int kor, int eng, int math) {
		return this.kor+this.eng+this.math;
	}
	
	double getAverage() {
		return this.getTotal(this.kor, this.eng, this.math)/3;
	}
	
//	public Student(String name, int ban, int no, int kor, int eng, int math) {
//		super();
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}

}
