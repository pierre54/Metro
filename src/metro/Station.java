package metro;


public class Station {

	private String nom; 
	private int tpsArret; 
	private boolean incident;
	private Coordonnee c;
	
	
	public Station (String nom, int tpsArret, Coordonnee c) {
		this.nom = nom;
		this.tpsArret = tpsArret;
		this.incident = false;
		this.c = c;
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTpsArret() {
		return tpsArret;
	}

	public void setTpsArret(int tpsArret) {
		this.tpsArret = tpsArret;
	}

	public boolean isIncident() {
		return incident;
	}

	public void setIncident(boolean incident) {
		this.incident = incident;
	}

	public double getX() {
		return c.getX();
	}


	public double getY() {
		return c.getY();
	}


	public Station laPlusProche(Coordonnee c) {
		return null;
	}
}
