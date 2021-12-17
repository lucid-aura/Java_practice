package main;

import java.util.Scanner;

import dao.StudentDao;

public class MainClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		StudentDao dao = new StudentDao();
//		dao.fileRead();
		
		// menu
		while(true) {
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 삭제");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 모두 출력");
//			System.out.println("6. 파일로 저장");
			System.out.println("6. 종료");
			
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.delete();
				break;
			case 3:
				dao.select();
				break;
			case 4:
				dao.update();
				break;
			case 5:
				dao.alldata();
				break;
//			case 6:
//				dao.fileWrite();
//				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
