package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import dto.StudentDto;

//데이터의 접근, 관리
public class StudentDao {
	Scanner sc = new Scanner(System.in);

	StudentDto student[] = new StudentDto[20]; // 20개의 공간을 가지는 StudentDto 타입의 변수 student배열 선언(객체 생성x)
	private int count; // 입력된 개수를 저장할 int 타입 변수 count 선언
	
	public StudentDao() { // 기본 생성자 : count만 0으로 초기화 한다. 
		count = 0;
	}
	
	// CRUD
	public void insert() { // 학생 추가
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
		// 각각 number, name, height, eng, math라는 이름을 가진 변수에 각 타입에 맞는 값을 스캐너를 통해 키보드로 입력받고
		student[count] = new StudentDto(number, name, height, eng, math); 
		// StudentDto객체를 생성하고(오버로드한 생성자를 통해서) 위에서 선언한 student 배열에 count번째 자리에 추가
		this.count++;
		// 객체를 하나 추가했으므로 count 숫자도 1 증가해준다.
	}
	
	public void delete() { // 학생 삭제
		System.out.print("삭제하실 학생의 이름 = ");
		String name = sc.next();
		int index = targetIndex(name); // targetIndex 함수를 호출해서 학생의 이름과 일치하는 위치를 변수 index에 할당한다.
		
		if (index < 0) { // index가 음수라는 것은 일치하는 학생이 없다는 뜻이다.(함수의 return 값으로 작성자가 정한 것)
			System.out.println("일치하는 학생이 없습니다."); // 출력 후 선택지로 돌아감
		}
		else { // index가 양수라면 (일치하는 위치를 받았다면)
			this.student[index].setEng(0);
			this.student[index].setHeight(0);
			this.student[index].setMath(0);
			this.student[index].setName("");
			this.student[index].setNumber(0);
			this.count--; 
			System.out.println("삭제가 완료되었습니다.");
			//  student라는 이름을 가진 배열의 index 위치에 있는  StudentDto 타입 값을  StudentDto의 멤버 함수인 setter를 통해 값을 0과 ""로 변경  
		}
		
	}
	
	public void select() { // 검색
		System.out.print("검색하실 학생의 이름 = ");
		String name = sc.next();
		int index = targetIndex(name);
		System.out.println(this.student[index].toString());
		// Scanner를 통해 입력받은 문자열과 일치하는 이름을 가진 위치를 targetIndex 함수를 통해서 찾고 해당 index 위치에 있는 StudentDto 타입의 값을 toString()함수로 출력한다.
	}

	public void update() { // 수정
		System.out.print("수정하실 학생의 이름 = ");
		String name = sc.next();
		int index = targetIndex(name);
		if (index < 0) {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return; // return을 적어서 아래의 코드를 진행하지 않고 함수를 끝낸다. 따라서 아래 "수정하실 학생의 데이터" 는 출력되지 않는다.
		}
		System.out.println("수정하실 학생의 데이터");
		
		boolean pass = true; // 무한 반복하는 while문을 탈출하기 위한 스위치로 pass 이름을 가진 boolean 타입의 변수 선언 및 true로 초기화
		while(pass) {
			System.out.println("#1. 번호");
			System.out.println("#2. 이름");
			System.out.println("#3. 신장");
			System.out.println("#4. 영어");
			System.out.println("#5. 수학");
			System.out.println("#6. 취소");
			
			int menuNum = sc.nextInt();
			// switch 문을 통해서 입력받은 menuNum 변수 값이 무엇인지 확인하고 해당 값에 따라 다른 문을 실행한다.
			switch (menuNum) { // index와 studentDao 내부 함수인 setter를 이용하여 입력받은 값으로 변경한다.(각 입력에 맞는 타입 주의! - 변환이 필요하다.)
			case 1:
				System.out.print("변경할 번호를 입력해주세요");
				this.student[index].setNumber(Integer.parseInt(sc.next()));
				pass = false;
				break;
			case 2:
				System.out.print("변경할 이름을 입력해주세요");
				this.student[index].setName(sc.next());
				pass = false;
				break;
			case 3:
				System.out.print("변경할 신장 값을 입력해주세요");
				this.student[index].setHeight(Double.parseDouble(sc.next()));
				pass = false;
				break;
			case 4:
				System.out.print("변경할 영어 점수를 입력해주세요");
				this.student[index].setEng(Integer.parseInt(sc.next()));
				pass = false;
				break;
			case 5:
				System.out.print("변경할 수학 점수를 입력해주세요");
				this.student[index].setMath(Integer.parseInt(sc.next()));
				pass = false;
				break;
			case 6:
				System.out.print("수정을 취소합니다. 처음으로 돌아갑니다.");
				pass = false;
				break;
			default:
				System.out.print("올바른 값을 입력해주세요(1~6)");
				break;

			}
		}
		
	}
	
	public void alldata() { // 전체 조회
		for (int i = 0; i < count; i++) { // for문으로 student배열 전체의 각 원소들을 StudentDao 객체의 toString() 내부함수로 출력한다.
			System.out.println(student[i].toString()); 
		}
	}
	
	public int targetIndex(String name) { // 이름을 파라미터(매개변수)로 입력받았을 때 해당 값과  이름(Student.name)과 일치하는 위치(인덱스)를 반환해주는 함수 
		int index = -1; // 일치하지 않았을 경우 -1(음수)를 return하기 위해 초기화를 -1로 해줌
		for (int i = 0; i < this.count; i++) {
			if (student[i].getName().equals(name)) { // 문자열의 비교함수( String.equals(비교값) )을 통해서 일치 여부를 확인
				index = i; // 일치할 경우 index에 해당 위치(인덱스) 값을 할당(변경) 하고 break를 통해 for문을 바로 빠져나간다.
				break;
			}
		}
		return index; // 해당 위치 정보(인덱스 번호) 반환
	}

	public void fileWrite() { // 파일 쓰기
		File file = new File("c:\\myfile\\students.txt");		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < count; i++) {
				pw.println(student[i].getNumber() + "-" + student[i].getName() + "-" + student[i].getHeight() + "-" + student[i].getEng() + "-"+ student[i].getMath());
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() { // 파일 읽기
		try {
			File file = new File("c:\\myfile\\students.txt");
			// 데이터의 갯수를 파악
			BufferedReader br = new BufferedReader(new FileReader(file));						
			String str;
			while((str = br.readLine()) != null) {
				String[] split = str.split("-");
				student[count] = new StudentDto(Integer.parseInt(split[0]), split[1], Double.parseDouble(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]));
				count++;
			}		
		} catch (Exception e) {			
			System.out.println("지정된 파일을 찾을 수 없으므로 수동 입력으로 목록 작성을 시작합니다.");
		}	
	}
}
