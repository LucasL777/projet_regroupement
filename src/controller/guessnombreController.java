package controller;

import java.util.Scanner;

public class guessnombreController {
	
	static void trouve_le_nombre() {
		Scanner sc = new Scanner (System.in);
		int x, y, a=0, nbf, nb1, nb2, c1=1, c2=1; 							//a pour relancer une partie, x et y nombres entrés par les j
		System.out.println("Règles du jeu: deux joueurs s'affrontent pour trouver le nombre mystère entre 1 et le nombre choisis par le joueur");		
		while(a==0) {
			System.out.println("Choisir un nombre de fin");
			nbf = sc.nextInt();
			nb1 = (int)(Math.random()*(nbf-1))+1;
			nb2 = (int)(Math.random()*(nbf-1))+1;
			c1=1;
			c2=1;
			System.out.println("Au joueur 1 de commencer. Entrez un nombre");
			x = sc.nextInt();
			while(x!=nb1) { 												//debut du jeu j1
				if(x<nb1) {
					System.out.println("Plus grand");
					x = sc.nextInt();
					c1 = c1+1;
				}
				else {
					System.out.println("Plus petit");
					x=sc.nextInt();
					c1=c1+1;
				}
			}																//fin du jeu j1
			System.out.println("Le joueur 1 à fini");
			System.out.println("Au joueur 2 de jouer. Entrez un nombre");
			y= sc.nextInt();
			while(y!=nb2) { 												//debut du jeu j2
				if(y<nb2) {
					System.out.println("Plus grand");
					y = sc.nextInt();
					c2=c2+1;
				}
				else {
					System.out.println("Plus petit");
					y = sc.nextInt();
					c2=c2+1;
				}
			} 																//fin du jeu j2
			System.out.println("Le joueur 2 à fini");
			System.out.println("Calcul du nombre de coups des joueurs...");
			System.out.println("Le joueur 1 a fini en " + c1 + " coups.");
			System.out.println("Le joueur 2 a fini en " + c2 + " coups.");
			if(c1<=c2) {
				if(c1==c2) {
					System.out.println("Egalité, la partie va recommencer");
					a=0;
				}
				else {
					System.out.println("Le joueur gagnant est le joueur 1");
					a=1;
					System.out.println("Pour recommencer une partie, tappez 0. Sinon tappez 1");
					a = sc.nextInt();
				}
			}
			else {
				System.out.println("Le joueur gagnant est le joueur 2");
				a=1;
				System.out.println("Pour recommencer une partie, tappez 0. Sinon tappez 1");
				a = sc.nextInt();
			}
			
		}

	}

}
