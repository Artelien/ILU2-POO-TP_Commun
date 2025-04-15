package model;

public abstract class EntiteReservable {
	private CalendrierAnnuel calendrier;
	private int id;
	
	public EntiteReservable() {
		calendrier = new CalendrierAnnuel();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean estLibre(Formulaire formulaire) {
		return calendrier.estLibre(formulaire.getMois(), formulaire.getJour());
	}
	
	public abstract boolean compatible();
	public abstract Reservation reserver();
	
}
