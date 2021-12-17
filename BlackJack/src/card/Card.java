package card;

public class Card {
	public static String[] PATTERN = { "스페이드", "다이아", "하트", "클로버" };
	public static int[] card = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	public static int[] score = {0,2,3,4,5,6,7,8,9,10,10,10,10};
	private String pattern = "";
	private int number;

	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Card() {
		this.pattern = "Invalid";
		this.number = -1;
	}
	public Card(String pattern, int number) {
		this.pattern = pattern;
		this.number = number;
	}
}
