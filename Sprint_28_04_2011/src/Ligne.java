package metro;

import java.util.List;
import java.util.LinkedList;


public class Ligne{

	private String nom;
	private List<Troncon> troncons;
	
	public Ligne(){
		troncons = new LinkedList<Troncon>();
	}
	
	public Ligne (String nom) {
		this();
		this.nom = nom;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}
	
	public final void ajoutTroncon(Troncon troncon){
		troncons.add(troncon);
	}
	
	public final void supprimeTroncon(Troncon troncon){
		troncons.remove(troncon);
	}
	
	public final List<Troncon> getTroncon(){
		return troncons;
	}

}
