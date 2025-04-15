package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPersonne;
	private int service;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonne, int service) {
		super(jour, mois);
		this.nbPersonne = nbPersonne;
		this.service = service;
		
	}
	
	
	public void setIdentificationEntite(int entite) {
		super.entite = entite;
	}
	
	
	public int getIdentificationEntite() {
		return super.entite;
	}
	
	public int getJour() {
		return super.jour;
	}

	public int getNombrePersonnes() {
		return nbPersonne;
	}

	public int getNumService() {
		return service;
	}
	
	public int getMois() {
		return super.mois;
	}
}
