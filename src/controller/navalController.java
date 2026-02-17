package controller;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class navalController {

	private Set<String> naviresJoueur;
	private Set<String> naviresOrdi;

	private Set<String> tirsJoueur;
	private Set<String> tirsOrdi;

	private boolean tourJoueur = true;

	private final int NB_NAVIRE = 11;

	public navalController(Set<String> positionsJoueur) {

		this.naviresJoueur = new HashSet<>(positionsJoueur);
		this.naviresOrdi = new HashSet<>();
		this.tirsJoueur = new HashSet<>();
		this.tirsOrdi = new HashSet<>();

		placerNaviresOrdi();
	}

	// Placement aléatoire des 11 navires 1x1
	private void placerNaviresOrdi() {

		Random rand = new Random();

		while(naviresOrdi.size() < NB_NAVIRE) {

			char ligne = (char) ('A' + rand.nextInt(6));
			int colonne = rand.nextInt(6) + 1;

			String position = "" + ligne + colonne;

			naviresOrdi.add(position);
		}
	}

	// Tour du joueur
	public String tirJoueur(String position) {

		if(!tourJoueur)
			return "Pas ton tour";

		if(tirsJoueur.contains(position))
			return "Déjà joué";

		tirsJoueur.add(position);

		if(naviresOrdi.contains(position)) {
			naviresOrdi.remove(position);
			tourJoueur = false;
			return "Touché";
		} else {
			tourJoueur = false;
			return "Raté";
		}
	}

	// Tour de l'ordinateur
	public String tirOrdi() {

		Random rand = new Random();
		String position;

		do {
			char ligne = (char) ('A' + rand.nextInt(6));
			int colonne = rand.nextInt(6) + 1;
			position = "" + ligne + colonne;
		} while(tirsOrdi.contains(position));

		tirsOrdi.add(position);

		if(naviresJoueur.contains(position)) {
			naviresJoueur.remove(position);
			tourJoueur = true;
			return "Ordi touche en " + position;
		} else {
			tourJoueur = true;
			return "Ordi rate en " + position;
		}
	}

	public boolean victoireJoueur() {
		return naviresOrdi.isEmpty();
	}

	public boolean victoireOrdi() {
		return naviresJoueur.isEmpty();
	}

	public boolean isTourJoueur() {
		return tourJoueur;
	}
}
