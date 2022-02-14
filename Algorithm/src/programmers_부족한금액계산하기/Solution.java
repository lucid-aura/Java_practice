package programmers_부족한금액계산하기;

public class Solution {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long total = (long)price*count*(1+count) / 2;
		if (total > money) {
			System.out.println(total - money);
		}
		else {
			System.out.println(0);
		}
		// 짝수임에도 불구하고 xx
		/*
		int price = 3;
		int money = 20;
		int count = 4;
		long total = 0; // 10;
		for (int i = 0; i<count; i++) {
			total += (i+1)*price;
		}
		if (total > money) {
			System.out.println(total - money);
		}
		else {
			System.out.println(0);
		}
		*/
		
		/* 등차수열 n*첫값*(끝값)/2 = price*(price*count)*count/2
		 * count*(price + price*count)/2 = count*(price*(1+count))/2 = price*count*(count + 1)/2
		*/
		/*
		long total = price*count*(count+1)/2;
		long answer = (total-money < 0) ? 0 : total-money; 
		System.out.println((total-money < 0 ? 0 : total-money));
		*/
	
        //return answer;
	}

}
