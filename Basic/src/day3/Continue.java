package day3;

public class Continue {

	public static void main(String[] args) {
		// continue 아래 코드들은 생략
		for (int i = 0; i< 10; i++) {
			
			System.out.println("i = " + i);
			System.out.println("for start");
			if (i > 3) {
				continue;
			}
			System.out.println("for end");}
		
		
		// w++ 가 continue로 인해 생략되므로 무한루프에 걸린다.
		int w = 0;
		while(w < 10) {
			System.out.println("w = " + w);
			System.out.println("while start");
			
			if (w > 3) {
				continue;
			}
			System.out.println("while end");
			
			w++;
		}
	}

}
