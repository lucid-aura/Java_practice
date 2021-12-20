package single;

import java.util.ArrayList;
import java.util.List;

import dto.StudentDto;

public class Singleton {
	private static Singleton single = null;
	public List<StudentDto> list = null;
	
	private Singleton() {
		list = new ArrayList<StudentDto>();
	}
	
	public  static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
	
}
