package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDto;
import file.FileProc;
import single.Singleton;

//데이터의 접근, 관리
public class StudentDao {
	Scanner sc = new Scanner(System.in);

	FileProc fp = null;
	private ArrayList<StudentDto> student= new ArrayList<StudentDto>();
	
	public StudentDao() {		
//		student.add(new StudentDto(1001, "홍길동", 171.1, 90, 85));
//		student.add(new StudentDto(1002, "성춘향", 165.3, 100, 90));
//		student.add(new StudentDto(1003, "일지매", 182.6, 80, 95));

		fp = new FileProc("student");
		fp.CreateFile();
		
		fp.Load();
	}
	
	// CRUD
	public void insert() {	// 추가
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();

		Singleton s = Singleton.getInstance();
		
		s.list.add(new StudentDto(number, name, height, eng, math));

	}
	public void delete() {	// 삭제
		System.out.print("삭제할 학생명 = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}
		else {
			Singleton s = Singleton.getInstance();
			
			System.out.println(s.list.remove(index).getName() + "의 데이터를 삭제하였습니다");
		
		}		
		
	}
	public void select() {	// 검색한 후에 출력
		System.out.print("검색할 학생명 = ");
		String name = sc.next();

		int index = search(name);
		
		// 출력
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}else {
			Singleton s = Singleton.getInstance();
			StudentDto dto = s.list.get(index);
			System.out.println(dto.toString());
		}		
	}
	
	public void update() {	// 수정
		System.out.print("수정할 학생명 = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}
		else {
			System.out.print("영어 점수 = ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 = ");
			int math = sc.nextInt();
			
			Singleton s = Singleton.getInstance();
			s.list.get(index).setEng(eng);
			s.list.get(index).setMath(math);
			System.out.println("데이터를 수정하였습니다");
		}
	}
	
	public int search(String name) {		
		int index = -1;
		Singleton s = Singleton.getInstance();
		
		for (int i = 0; i < s.list.size(); i++) {
			StudentDto val = s.list.get(i);
			if (val.getName().equals(name)) {
				index = i;
				break;
			}
		}
		System.out.println(index);

		return index;
	}
	
	public void alldata() {
		Singleton s = Singleton.getInstance();
		
		for (StudentDto st : s.list) {
			System.out.println(st.toString());
		}
		
//		for (int i = 0; i < s.list.size(); i++) {
//			StudentDto dto = s.list.get(i);
//			if(dto != null && !dto.getName().equals("")) {
//				System.out.println(dto.toString());
//			}
//		}
	}
	
	public void dataSave() {
		fp.Write();
	}
}





