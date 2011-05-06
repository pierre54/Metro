package metro;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class dijkstraTest {

	private Station depart = new Station("une",5,new Coordonnee(15,20));
	private Station arrivee = new Station("deux",3,new Coordonnee(35,50));
	private Station loin = new Station("trois",15,new Coordonnee(1000,1000));
	private Troncon t1;
	private Troncon t2;
	private List<Troncon> troncons;
	private Ligne ligne;
	private List<Ligne> lignes;
	private Graph graph;
	private DijkstraAlgorithm d;
	private Set<Station> stations;
	private List<Station> listeStations;
	
	@Before
	public void setUp() throws Exception {
		t1 = new Troncon(1,depart,arrivee,40);
		t2 = new Troncon(2,arrivee,loin,200);
		
		troncons = new ArrayList<Troncon>();
		troncons.add(t1);
		troncons.add(t2);
		
		ligne = new Ligne("ligne");
		ligne.ajoutTroncon(t1);
		ligne.ajoutTroncon(t2);
		
		lignes = new ArrayList<Ligne>();
		graph = new Graph(lignes,troncons);
		
		d = new DijkstraAlgorithm(graph);
		d.execute(depart);
		
		stations = new HashSet<Station>();
		stations.add(depart);
		stations.add(arrivee);
		
		listeStations = new ArrayList<Station>();
		listeStations.add(depart);
		listeStations.add(loin);
	}
	
	@Test
	public void testGetCout(){
		int coutVoulu = 45;
		int coutObtenu = d.getCout(depart, arrivee);
		
		assertEquals("le test de getCout a échoué",coutVoulu,coutObtenu);
	}
	
	@Test
	public void testGetNeighbors(){
		List<Station> stationsVoulues = new ArrayList<Station>();
		
		List<Station> stationsObtenues = d.getNeighbors(depart);
		
		assertEquals("le test de getNeighbors a échoué",stationsVoulues,stationsObtenues);
	}
	
	@Test
	public void testGetMinimum(){
		Station stationVoulue = depart;
		Station stationObtenue = d.getMinimum(stations);
		
		assertEquals("le test de getMinimum a échoué",stationVoulue,stationObtenue);
	}
	
	@Test
	public void testIssettled(){
		boolean resVoulu= true;
		boolean resObtenu = d.isSettled(depart);
		
		assertEquals("le test de isSettled a échoué",resVoulu,resObtenu);
	}
	
	@Test
	public void testGetShortestDistance(){
		int coutVoulu =  45;
		int coutObtenu = d.getShortestDistance(arrivee);
		
		assertEquals("le test de getShortestDistance a échoué",coutVoulu,coutObtenu);
	}
	
	@Test
	public void testGetPath(){
		LinkedList<Station> pathVoulu = new LinkedList<Station>();
		pathVoulu.add(depart);
		pathVoulu.add(arrivee);
		
		LinkedList<Station> pathObtenu = d.getPath(arrivee);
		
		assertEquals("le test de getPath à une station a échoué",pathVoulu,pathObtenu);
	}
	
	@Test
	public void testGetPath2(){
		ArrayList<Station> pathVoulu = new ArrayList<Station>();
		pathVoulu.add(depart);
		pathVoulu.add(arrivee);
		pathVoulu.add(loin);
		
		LinkedList<Station> pathObtenu = d.getPath(listeStations);

		assertEquals("le test de getShortestDistance à une liste de stations a échoué",pathVoulu,pathObtenu);
	}
	
}
