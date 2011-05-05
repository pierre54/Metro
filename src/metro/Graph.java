package metro;

import java.util.List;

public class Graph {
	private final List<Ligne> lignes;
	private final List<Troncon> troncons;

	public Graph(List<Ligne> lignes, List<Troncon> edges) {
		this.lignes = lignes;
		this.troncons = edges;
	}

	public List<Ligne> getLignes(){
		return lignes;
	}

	public List<Troncon> getTroncons() {
		return troncons;
	}
	
	
	
}