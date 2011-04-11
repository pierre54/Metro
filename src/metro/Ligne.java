package metro;

public class Ligne {

	private String nom;
	private Troncon[] troncons;
	
	public Ligne (String nom, Troncon[] tr) {
		this.nom = nom;
		this.troncons=tr; 
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final Troncon[] getTroncon() {
		return troncons;
	}

	public final void setTroncon(Troncon[] tr) {
		this.troncons = tr;
	}
}
