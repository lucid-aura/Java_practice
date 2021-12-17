package card;

public class Deck extends Card{
	private Card[][] cards = new Card[4][13];
	private boolean[][] select = new boolean[4][13];
	
	public Deck() {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = new Card(Card.PATTERN[i], Card.card[j]);
				select[i][j] = false;
			}
		}
	}
	
	public Card drawCard() {
		int i = -1;
		int j = -1;
		
		do {
			i = (int)(Math.random() * 3);
			j = (int)(Math.random() * 13);
		}while(select[i][j]);
		
		select[i][j] = true;
		return cards[i][j];
	}
}
