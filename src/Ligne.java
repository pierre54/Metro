import java.util.ArrayList;


public class Ligne {

	private String nom;
	private ArrayList<Troncon> troncons;
	
	public Ligne (String nom, ArrayList<Troncon> tr) {
		this.nom = nom;
		this.troncons=tr; 
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final ArrayList<Troncon> getTroncon() {
		return troncons;
	}

	public final void setTroncon(ArrayList<Troncon> tr) {
		this.troncons = tr;
	}
}
