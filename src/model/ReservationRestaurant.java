package model;

public class ReservationRestaurant extends Reservation{
	
	private int service;
	private int table;
		
	public ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour, mois);
		this.service = service;
		this.table = table;
	}
	
	public String toString() {
		String stringService;
		if (service == 1) {
			stringService = "premier";
		} else {
			stringService = "deuxi�me";
		}
		return "Le " + jour + "/" + mois + "\nTable " + table + " pour le " + stringService + " service."; 
	}

}
