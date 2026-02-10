package controller;

import java.util.Scanner;

public class shifumiController {
	
	// 0 = aucun choix
	// 1 = pierre
	// 2 = feuille
	// 3 = ciseaux
	
	
	static int rock() {
		return 1;
	}
	
	static int paper() {
		return 2;
	}
	
	static int scissors() {
		return 3;
	}
	
	static String compare(int player, int computer) {
		String egalite = "Egalité entre les joueurs";
		String win = "Vous gagnez";
		String loose = "Vous perdez";
		if(player == computer) {
			return egalite;
		}
		else if((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)){
			return win;
		}
		return loose;
	}
	
	static int addScore(int score_person) {
		score_person += 1;
		return score_person;
	}
	
	static String result(int score_player, int score_computer) {
		String msg = "Fin du jeu.";
		String resume = "Le jeu continue.";
		if(score_player > 2) {
			return msg + "Le joueur gagne !"; 
		}
		else if(score_computer > 2) {
			return msg + "L'ordinateur gagne !";
		}
		return resume;
	}

}
