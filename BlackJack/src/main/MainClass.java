package main;

import java.util.Scanner;

import game.Game;
import player.Player;
import player.PlayerInfo;

public class MainClass {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		PlayerInfo playerinfo = new PlayerInfo();
		playerinfo.join(new Player("홍길동", 1000));
		Game game = new Game(playerinfo);
		game.playGame();
		
		
	}
}
