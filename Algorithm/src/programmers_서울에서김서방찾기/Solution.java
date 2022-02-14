package programmers_서울에서김서방찾기;

public class Solution {

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};
		int index = -1;
		for(int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				index = i;
			}
		}
		
        String answer = "김서방은 "+index+"에 있다";
        System.out.println(answer);
        //return answer;
	}

}
