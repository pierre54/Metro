package metro;

import java.util.*;


import javax.swing.text.html.HTMLDocument.Iterator;

public class DijkstraAlgorithm {

	private final Graph graph;
	private final List<Troncon> troncons;
	private Set<Station> settledStations;
	private Set<Station> unSettledSations;
	private Map<Station, Station> predecesseurs;
	private Map<Station, Integer> cout;

	public DijkstraAlgorithm(Graph graph) {
		this.graph = graph;
		this.troncons = new ArrayList<Troncon>(graph.getTroncons());
	}

	public void execute(Station source) {
		settledStations = new HashSet<Station>();
		unSettledSations = new HashSet<Station>();
		cout = new HashMap<Station, Integer>();
		predecesseurs = new HashMap<Station, Station>();
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

	private int getCout(Station node, Station target) {
		for (Troncon troncon : troncons) {
			if (troncon.getDepart().equals(node)&& troncon.getArrive().equals(target)) {
				return troncon.getDuree() + troncon.getDepart().getTpsArret();
			}
		}
		throw new RuntimeException("Should not happen");
	}

	private List<Station> getNeighbors(Station node) {
		List<Station> neighbors = new ArrayList<Station>();
		for (Troncon troncon : troncons) {
			if (troncon.getDepart().equals(node) && !isSettled(troncon.getArrive())) {
				neighbors.add(troncon.getArrive());
			}
		}
		return neighbors;
	}

	private Station getMinimum(Set<Station> vertexes) {
		Station minimum = (Station) vertexes.iterator().next();
		for (Station vertex : vertexes) {
			if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
				minimum = vertex;
			}
		}
		return minimum;
	}

	private boolean isSettled(Station vertex) {
		return settledStations.contains(vertex);
	}

	private int getShortestDistance(Station destination) {
		Integer d = cout.get(destination);
		if (d == null) {
			return Integer.MAX_VALUE;
		} else {
			return d;
		}
	}

	/*
	 * This method returns the path from the source to the selected target and
	 * NULL if no path exists
	 */
	public LinkedList<Station> getPath(Station target) {
		LinkedList<Station> path = new LinkedList<Station>();
		Station step = target;
		// Check if a path exists
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
		// Put it into the correct order
		Collections.reverse(path);
		
		return path;
	}
	
	public LinkedList<Station> getPath(List<Station> stations){
		// iterator sur station
		java.util.Iterator<Station> iterator = stations.iterator();
		
		// les deux premiere station
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