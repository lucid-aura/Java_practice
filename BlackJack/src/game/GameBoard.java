package game;

import java.util.ArrayList;

import player.Player;
import player.PlayerInfo;

public class GameBoard {
	private ArrayList<String> id;
	private ArrayList<Integer> money;
	private int betMoney;
	private int draw_count;
	
	public int getDraw_count() {
		return draw_count;
	}

	public void setDraw_count(int draw_count) {
		this.draw_count = draw_count;
	}

	public int getBetMoney() {
		return betMoney;
	}

	public void setBetMoney(int betMoney) {
		this.betMoney = betMoney;
	}

	public GameBoard(PlayerInfo playerInfo) {
		draw_count = 0;
		id = new ArrayList<String>();
		money = new ArrayList<Integer>();

		for (int i = 0; i < playerInfo.getParticipant().size(); i++) {

			id.add(playerInfo.getParticipant().get(i).getId());
			money.add(playerInfo.getParticipant().get(i).getMoney());
		}
	}
}
