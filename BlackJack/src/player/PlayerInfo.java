package player;

import java.util.ArrayList;

public class PlayerInfo {
	private ArrayList<Player> participant;

	public ArrayList<Player> getParticipant() {
		return participant;
	}

	public PlayerInfo() {
		this.participant = new ArrayList<Player>();
	}
	
	public void join(Player p) {
		this.participant.add(p);
	}
	
	public void exit(Player p) {
		int index = this.findPlayer(p);
		if (index < 0) {
			System.out.println("플레이어를 찾을 수 없습니다.");
		}
		else {
			this.participant.remove(index);	
		}
	}
	
	private int findPlayer(Player p) {
		for (int i = 0; i < participant.size(); i++) {
			if (participant.get(i).getId().equals(p.getId())) {
				return i;
			}
		}
		return -1;
	}
	
}
