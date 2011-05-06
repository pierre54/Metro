package metro;

import java.util.*;

public class DijkstraAlgorithm {

	private final Graph graph;
	private final List<Troncon> troncons;
	private Set<Station> settledStations;
	private Set<Station> unSettledSations;
	private Map<Station, Station> predecesseurs;
	private Map<Station, Integer> cout;
	
	/**Constructeur*/
	public DijkstraAlgorithm(Graph graph) {
		this.graph = graph;
		this.troncons = new ArrayList<Troncon>(graph.getTroncons());
		settledStations = new HashSet<Station>();
		unSettledSations = new HashSet<Station>();
		cout = new HashMap<Station, Integer>();
		predecesseurs = new HashMap<Station, Station>();
	}

	/**Placement du depart de l'utilisateur*/
	public void execute(Station source) {
		cout.put(source, 0);
		unSettledSations.add(source);
		while (unSettledSations.size() > 0) {
			Station node = getMinimum(unSettledSations);
			settledStations.add(node);
			unSettledSations.remove(node);
			findMinimalDistances(node);
		}
	}

	private void findMinimalDistances(Station node) {
		List<Station> adjacentNodes = getNeighbors(node);
		for (Station target : adjacentNodes) {
			if (getShortestDistance(target) > getShortestDistance(node)+ getCout(node, target)) {
				cout.put(target, getShortestDistance(node)+ getCout(node, target));
				predecesseurs.put(target, node);
				unSettledSations.add(target);
			}
		}
	}

	/**Methode getCout qui renvoie le cout necessaire pour passer d'un noeud depart a un noeud cible*/
	public int getCout(Station node, Station target) {
		for (Troncon troncon : troncons) {
			if (troncon.getDepart().equals(node)&& troncon.getArrive().equals(target)) {
				return troncon.getDuree() + troncon.getDepart().getTpsArret();
			}
		}
		throw new RuntimeException("Should not happen");
	}

	/**Renvoie la liste des noeuds voisins au noeud courant*/
	public List<Station> getNeighbors(Station node) {
		List<Station> neighbors = new ArrayList<Station>();
		for (Troncon troncon : troncons) {
			if (troncon.getDepart().equals(node) && !isSettled(troncon.getArrive())) {
				neighbors.add(troncon.getArrive());
			}
		}
		return neighbors;
	}

	/**Renvoie la station à la distance minimale de la premiere station de la liste*/
	public Station getMinimum(Set<Station> stations) {
		Station minimum = (Station) stations.iterator().next();
		for (Station s : stations) {
			if (getShortestDistance(s) < getShortestDistance(minimum)) {
				minimum = s;
			}
		}
		return minimum;
	}

	
	public boolean isSettled(Station station) {
		return settledStations.contains(station);
	}

	/**Recupère le cout d'une destination*/
	public int getShortestDistance(Station destination) {
		Integer d = cout.get(destination);
		if (d == null) {
			return Integer.MAX_VALUE;
		} 
		else {
			return d;
		}
	}

	/**Methode getPath qui renvoie le chemin vers le cible depuis la source, ou renvoie null sinon*/
	public LinkedList<Station> getPath(Station target) {
		LinkedList<Station> path = new LinkedList<Station>();
		Station step = target;
		//On regarde si un chemin existe deja
		if(predecesseurs==null){
			predecesseurs = new HashMap<Station, Station>();
		}
		if (predecesseurs.get(step) == null) {
			return null;
		}
		path.add(step);
		while (predecesseurs.get(step) != null) {
			step = predecesseurs.get(step);
			path.add(step);
		}
		
		Collections.reverse(path);
		
		return path;
	}
	
	/**Methode getPath qui renvoie le chemin entre le premier element le la liste et le dernier en passant par tous les autres elements.*/
	public LinkedList<Station> getPath(List<Station> stations){
		// iterator sur station
		java.util.Iterator<Station> iterator = stations.iterator();
		
		// les deux premieres stations
		Station station1 = iterator.next();
		Station station2 = iterator.next();
		
		// dij 1->2
		DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(graph);
		dijkstraAlgorithm.execute(station1);
		LinkedList<Station> ret = dijkstraAlgorithm.getPath(station2);
		
		//dij sur le reste
		while(iterator.hasNext()){
			station1=station2;
			station2=iterator.next();
			dijkstraAlgorithm.execute(station1);
			LinkedList<Station> ret2 = dijkstraAlgorithm.getPath(station2);
			ret2.remove(0);
			ret.addAll(ret2);
		}
		return ret;
	}
}