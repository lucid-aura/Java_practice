package player;

public class Player {
	private String id;
	private int money;
	private int score;
	private boolean live;

	public Player(String id) {
		this.id = id;
		this.money = 0;
		this.score = 0;
		this.live = true;
	}
	
	public Player(String id, int money) {
		this.id = id;
		this.money = money;
		this.score = 0;
		this.live = true;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getId() {
		return id;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
}
