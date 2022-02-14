package writing;

public class BootTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.isbn = "21424";
		book1.title = "Java pro";
		book1.author = "김하나";
		book1.publisher = "Jaen.kr";
		book1.price = 15000;
		book1.desc = "";
		
		Book book2 = new Book();
		book2.isbn = "35355";
		book2.title = "OOAD 분석, 설계";
		book2.author = "소나무";
		book2.publisher = "Jaen.kr";
		book2.price = 30000;
		book2.desc = "";
		
		Book book3 = new Book();
		book3.isbn = "35535";
		book3.title = "Java World";
		book3.author = "편집부";
		book3.publisher = "androidjava.com";
		book3.price = 7000;
		book3.desc = "2013.2";
		
		Magazine magazine1 = new Magazine();
		magazine1.isbn = "35535";
		magazine1.title = "Java World";
		magazine1.author = "편집부";
		magazine1.publisher = "androidjava.com";
		magazine1.year = 2013;
		magazine1.month = 2;
		magazine1.price = 7000;
		magazine1.desc = "";
		
		System.out.println("*********************** 도서목록 **************************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
	
		/* 
		 * 35535 번째 Java World가 도서목록에 있어서 2013.2가 desc라는 가정하에 과제 진행
		 * 구현에서는 Book클래스로 잡아서 했으나 만약 2013.2가 year, month인 Magazine일 경우
		 * 50번째 라인을 주석 해제하여 Magazine의 toString으로도 출력
		 */
		// System.out.println(magazine1.toString());
	}

}
