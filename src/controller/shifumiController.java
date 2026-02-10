package controller;

import view.shifumiView;
import java.util.Random;

public class shifumiController {
	
	public void initialize() {
		shifumiView frame = new shifumiView();
	}
	
	
	
	// 0 = aucun choix
	// 1 = pierre
	// 2 = feuille
	// 3 = ciseaux
	
	
	public static int rock() {
		System.out.println("Le player joue rock");
		return 1;
	}
	
	public static int paper() {
		System.out.println("Le player joue paper");
		return 2;
	}
	
	public static int scissors() {
		System.out.println("Le player joue scissors");
		return 3;
	}
	
	public static int computerChoice() throws InterruptedException {
		System.out.println("L'ordinateur joue");
		Thread.sleep(2000);
		Random rand = new Random();
        int tirage = rand.nextInt(3) + 1;
        return tirage;
	}
	
	public static String compare(int player, int computer) {
		String egalite = "Egalité";
		String win = "Vous gagnez";
		String loose = "Vous perdez";
		System.out.println("Les jeu sont comparés");
		if(player == computer) {
			System.out.println(egalite);
			return egalite;
		}
		else if((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)){
			System.out.println(win);
			return win;
		}
		System.out.println(loose);
		return loose;
	}
	
	public static int addScore(int score_person) {
		score_person += 1;
		System.out.println("Le score est ajouté");
		return score_person;
	}
	
	public static String result(int score_player, int score_computer) {
		String msg = "Fin du jeu. ";
		String resume = "Le jeu continue. ";
		System.out.println("Vérification des résultats");
		if(score_player == 3) {
			return msg + "Le joueur gagne !"; 
		}
		else if(score_computer == 3) {
			return msg + "L'ordinateur gagne !";
		}
		System.out.println(resume);
		return resume;
	}

}
