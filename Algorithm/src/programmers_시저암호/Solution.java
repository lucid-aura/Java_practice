package programmers_시저암호;

public class Solution {

	public static void main(String[] args) {
		String s = "AB";
		int n = 3;
        String answer = "";
        for (int i = 0; i<s.length(); i++) {
        	if (s.charAt(i) == ' ') {
        		answer += " ";
        	}
        	else if ((int)s.charAt(i) < 91) {
        		answer += (char)((((int)s.charAt(i) - (int)'A' + n)%26) + (int)'A');
        	}
        	else {
        		answer += (char)((((int)s.charAt(i) - (int)'a' + n)%26) + (int)'a');
        	}
        	
        }
        System.out.println(answer);
        //return answer;
	}

}
