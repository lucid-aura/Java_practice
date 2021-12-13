import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);	
		
	//	String student[][] = null;
				
		String student[][] = {		//   국어    영어   수학 
				{ "홍길동", "1999-01-23", "100", "90", "75" },	
				{ "성춘향", "2010-07-04", "90", "100", "95" },
				{ "일지매", "2001-03-05", "85", "95", "100" },				
		};
		
				
		// 학생들의 정보를 2차원배열에 입력을 받는다	(이름, 생년월일, 국어, 영어, 수학)
		/*
		System.out.print("학생 수 = ");
		int count = sc.nextInt();
		student = new String[count][5];	
		/**/
				
		/*
		for (int i = 0; i < student.length; i++) {
			System.out.print("이름:");
			String name = sc.next();
			
			System.out.print("생년월일:");
			String birth = sc.next();
			
			System.out.print("국어:");
			String lang = sc.next();
			
			System.out.print("영어:");
			String eng = sc.next();
			
			System.out.print("수학:");
			String math = sc.next();
			
			student[i][0] = name;
			student[i][1] = birth;
			student[i][2] = lang;
			student[i][3] = eng;
			student[i][4] = math;
		}
		/**/
		
		// 함수로 수정
	//	String student[][] = input();
		
		
		/*
		//					0        1          2      3       4  
		String title[] = { "이름:", "생년월일:", "국어:", "영어:", "수학:" };
		
		for (int i = 0; i < student.length; i++) {			
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(title[j]);
				String column = sc.next();				
				student[i][j] = column;
			}			
		}
		/**/
				
		/*
		// 각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점
		int sum[] = new int[student.length];
		int temp;	// 1명분에 대한 성적의 합계			
		for (int j = 0; j < student.length; j++) {
			temp = 0;
			for (int k = 2; k < student[j].length; k++) {		// 1명당 성적의 합계 루프문
				temp = temp + Integer.parseInt(student[j][k]);
			}
			sum[j] = temp;
		}			
	//	System.out.println(Arrays.toString(sum));
		
		for (int i = 0; i < sum.length; i++) {
			System.out.print(student[i][0] + "의 총점:" + sum[i] + "\n");
		}
			
		
		// 학생들의 국어점수의 총점은?
		int langSum = 0;
		for (int i = 0; i < student.length; i++) {
			langSum = langSum + Integer.parseInt(student[i][2]);
		}
		System.out.println("국어의 합계점수:" + langSum);
		
		
		// 영어 점수의 최고점수는 몇 점인가?
		int max = Integer.parseInt(student[0][3]);
		for (int i = 1; i < student.length; i++) {
			int eng = Integer.parseInt(student[i][3]);			
			if(eng > max) {
				max = eng;
			}
		}
		System.out.println("영어의 최고점수:" + max);
		
		
		// 수학 점수의 최저점수는 몇 점인가?
		int min = Integer.parseInt(student[0][4]);
		for (int i = 1; i < student.length; i++) {
			int math = Integer.parseInt(student[i][4]);
			if(math < min) {
				min = math;
			}
		}
		System.out.println("수학의 최저점수:" + min);
		
		
		// 학급에서 1등은 누구인가? 이름을 출력하라.
		int top = sum[0];	
		int index = 0;
		for (int i = 0; i < sum.length; i++) {
			if(sum[i] > top) {
				top = sum[i];
				index = i;
			}
		}
		System.out.println("클래스의 1등은 " + student[index][0] + "님입니다");
		/**/
		
		
		// 함수로 수정
		int sum[] = sumFunc(student);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(student[i][0] + "의 총점:" + sum[i] + "\n");
		}
		
		int langSum = languageSum(student);
		System.out.println("국어의 합계점수:" + langSum);
		
		int index = classTop(sum);
		System.out.println("클래스의 1등은 " + student[index][0] + "님입니다");
		
	}
	
	static String[][] input(){
		Scanner sc = new Scanner(System.in);	
		
		String student[][] = null;
		
		System.out.print("학생 수 = ");
		int count = sc.nextInt();
		student = new String[count][5];	
		
		for (int i = 0; i < student.length; i++) {
			System.out.print("이름:");
			String name = sc.next();
			
			System.out.print("생년월일:");
			String birth = sc.next();
			
			System.out.print("국어:");
			String lang = sc.next();
			
			System.out.print("영어:");
			String eng = sc.next();
			
			System.out.print("수학:");
			String math = sc.next();
			
			student[i][0] = name;
			student[i][1] = birth;
			student[i][2] = lang;
			student[i][3] = eng;
			student[i][4] = math;
		}
		
		return student;
	}
	
	static int[] sumFunc(String[][] student) {
		// 각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점
		int sum[] = new int[student.length];
		int temp;	// 1명분에 대한 성적의 합계			
		for (int j = 0; j < student.length; j++) {
			temp = 0;
			for (int k = 2; k < student[j].length; k++) {		// 1명당 성적의 합계 루프문
				temp = temp + Integer.parseInt(student[j][k]);
			}
			sum[j] = temp;
		}	
		
		return sum;
	}
	
	static int languageSum(String student[][]) {
		int langSum = 0;
		for (int i = 0; i < student.length; i++) {
			langSum = langSum + Integer.parseInt(student[i][2]);
		}
		return langSum;
	}
	
	static int classTop(int sum[]) {
		int top = sum[0];	
		int index = 0;
		for (int i = 0; i < sum.length; i++) {
			if(sum[i] > top) {
				top = sum[i];
				index = i;
			}
		}
		return index;
	}
	
	
}









