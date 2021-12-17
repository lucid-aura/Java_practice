package game;

import java.util.ArrayList;

import card.Card;
import card.Deck;
import main.MainClass;
import player.PlayerInfo;

public class Game {
	private GameBoard gameboard;
	private PlayerInfo playerinfo;
	private Deck deck;
	private ArrayList<ArrayList<Card>> hands; // 각 플레이어가 가진 카드들
	private ArrayList<Integer> scores; // 각 플레이어의 현재 점수 (21초과 패배)
	
	public Game(PlayerInfo playerinfo) {
		this.playerinfo = playerinfo;
		this.gameboard = new GameBoard(this.playerinfo);
		this.deck = new Deck();
		this.scores = new ArrayList<Integer>();
		this.hands = new ArrayList<ArrayList<Card>>();
		for (int i = 0; i < this.playerinfo.getParticipant().size(); i++) {
			hands.add(new ArrayList<Card>());
			scores.add(0);
		}
	}
	
	public void playGame() {
		// 시작 - 첫 드로우
		gameboard.setDraw_count(gameboard.getDraw_count()+1);
		for (int i = 0; i < playerinfo.getParticipant().size(); i++) {
			Card drawCard = drawDeck();
			hands.get(i).add(drawCard);
			showResult(i);
		}
		// 다음 라운드
	}

	private void showResult(int index) {
		System.out.println(gameboard.getDraw_count() + " " + index);
		Card new_card = hands.get(index).get(gameboard.getDraw_count()-1); 
		int score = calcScore(new_card, scores.get(index));
		System.out.println("뽑은 카드를 더한 당신의 점수는 : " + score + " 점 입니다.");
		scores.set(index, score);
		
	}

	private Card drawDeck() {
		Card card = new Card();
		card = deck.drawCard();
		return card;
	}
	
	private void betting(int betMoney) {
		boolean able = true;
		for (int i = 0; i < playerinfo.getParticipant().size(); i++) {
			if (playerinfo.getParticipant().get(i).getMoney() < betMoney) {
				able = false;
			}
		}
		if (able) {
			gameboard.setBetMoney(betMoney);
		}
		else {
			System.out.println("배팅할 금액이 모자랍니다. 배팅 금액을 다시 정해주세요.");
		}
	}
	
	private int calcScore(Card card, int score) {
		if (card.getNumber()-1 == 0) {
			String choice = "";
			do{
				System.out.print("에이스가 나왔습니다. 1이나 11 중 어떤 숫자를 더하겠습니까?(1 or 11) : ");
				choice =  MainClass.sc.next();
			}while(!choice.equals("1") && !choice .equals("11"));
			if (choice.equals("1")) {
				score += 1;
			}
			else {
				score += 11;
			}
			
		}
		else {
			score += Card.score[card.getNumber()-1];
		}
		return score;
	
	}
}
