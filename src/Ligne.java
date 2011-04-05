import java.util.ArrayList;


public class Ligne {

	String nom;
	ArrayList troncon;
	
	public Ligne (String nom, ArrayList troncon) {
		this.nom = nom;
		this.troncon = troncon; 
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList getTroncon() {
		return troncon;
	}

	public void setTroncon(ArrayList troncon) {
		this.troncon = troncon;
	}
}
