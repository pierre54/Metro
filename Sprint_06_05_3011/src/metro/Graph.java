package metro;

import java.util.List;

public class Graph {
	private final List<Ligne> lignes;
	private final List<Troncon> troncons;

	public Graph(List<Ligne> lignes, List<Troncon> troncons) {
		this.lignes = lignes;
		this.troncons = troncons;
	}

	public List<Ligne> getLignes(){
		return lignes;
	}

	public List<Troncon> getTroncons() {
		return troncons;
	}
	
	
	
}