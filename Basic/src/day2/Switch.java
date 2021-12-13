package day2;

public class Switch {
	public static void main(String args[]) {
		/*
		 *	switch
		 *
		 *	형식:
		 *		switch( 대상이 되는 변수 ) {
		 *			case 값1:
		 *				처리1;
		 *				break;
		 *
		 *			case 값2:
		 *				처리2;
		 *				break;
		 *
		 *				...
		 *
		 *			default:
		 *				마지막 처리;
		*/
		
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("number는 1입니다.");
			break;
		case 2:
			System.out.println("number는 2입니다.");
			break;
		case 3:
			System.out.println("number는 3입니다.");
			break;
		default:
			System.out.println("number는 "+ number +"입니다.");
			break;
		}
	}
}
