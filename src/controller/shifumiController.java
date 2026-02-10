package controller;

import java.util.Scanner;

public class shifumiController {
	
	static void shifumi() {
		Scanner sc = new Scanner(System.in);
		int score_o=0,score_j=0, a, x=0, y=0, total=0, t=1;
			System.out.println("");
			System.out.println("Jeu du shifumi, vous jouez contre l'ordinateur. Le premier à 3 victoires gagne.");
			System.out.println("En combien de manche se déroule la partie : 3, 5 ou 10");
			a=sc.nextInt();
			total=a/2;
			while(a>0) {
				System.out.println("************");
				System.out.println("Manche " + t);
				t=t+1;
				System.out.println("Pour jouer: pierre = 1, papier = 2, ciseaux = 3");
				System.out.println("Jouez !");
				x=sc.nextInt();
				y=(int)(Math.random()*(3-1))+1;
				if(x<4) {
					if(x==1) {
						if(y==2) {
							score_o=score_o+1;
							System.out.println("L'ordinateur a joué papier, il gagne un point");
						}
						else {
							if(y==3){
								score_j=score_j+1;
								System.out.println("L'ordinateur a joué ciseaux, vous gagner un point");
							}
							else {
								System.out.println("Vous avez tous les deux joué pierre, le score ne change pas");
							}
						}				
					}
					if(x==2) {
						if(y==3) {
							score_o=score_o+1;
							System.out.println("L'ordinateur a joué ciseaux, il gagne un point");
						}
						else {
							if(y==1){
								score_j=score_j+1;
								System.out.println("L'ordinateur a joué pierre, vous gagner un point");
							}
							else {
								System.out.println("Vous avez tous les deux joué papier, le score ne change pas");
							}
						}
					}
					if(x==3) {
						if(y==1) {
							score_o=score_o+1;
							System.out.println("L'ordinateur a joué pierre, il gagne un point");
						}
						else {
							if(y==2){
								score_j=score_j+1;
								System.out.println("L'ordinateur a joué papier, vous gagner un point");
							}
							else {
								System.out.println("Vous avez tous les deux joué ciseaux, le score ne change pas");
							}
						}
					}
					System.out.println("");
					System.out.println("Joueur " + score_j);
					System.out.println("Ordinateur " + score_o);
					System.out.println("");
					a=a-1;
					}
				else {
					t=t-1;
				}
				}
			if(score_j>score_o) {
				System.out.println("Vous avez gagné !");
			}
			else {
				if(score_o>score_j) {
					System.out.println("L'ordinateur a gagné !");
				}
				else {
					System.out.println("Egalité");
				}
			}
		}

}
