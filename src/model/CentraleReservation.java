package model;

import java.util.Iterator;

public class CentraleReservation {
	private EntiteReservable[] entites;
	private int nbEntite;
	
	public CentraleReservation(EntiteReservable[] entites) {
		this.entites = entites;
		nbEntite = 0;
	}
	
	
	public int ajouterEntite(EntiteReservable entite) {
		entites[nbEntite] = entite;
		nbEntite++;
		return nbEntite;
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		int[] possibilites = new int[nbEntite];
		for (int i = 0; i < nbEntite; i++) {
			EntiteReservable entite = entites[i];
			if(entite.estLibre(formulaire)) {
				possibilites[i] = entite.getId();
			} else {
				possibilites[i] = 0;
			}
		}
		
		return possibilites;
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		formulaire.setIdentificationEntite(entites[numEntite].getId());
		ReservationRestaurant reservation = new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), formulaire.getIdentificationEntite());
		return reservation;
	}
}
