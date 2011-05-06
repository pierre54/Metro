package metro;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class mainTest {
	
	private Station[] stations= new Station[4];
	private Station[] stationsAttendues= new Station[2];
	private Coordonnee coorUnA = new Coordonnee(0,0);
	private Station unA = new Station("UnA",40,coorUnA);
	private Coordonnee coorUnB = new Coordonnee(50,85);
	private Station unB = new Station("UnB",40,coorUnB);
	private Coordonnee coorUnC = new Coordonnee(110,0);
	private Station unC = new Station("UnC",40,coorUnC);
	private Coordonnee coorUnD = new Coordonnee(200,0);
	private Station unD = new Station("UnD",40,coorUnD);
	private Coordonnee homme = new Coordonnee(50,85);
	private ArrayList<Troncon> troncons= new ArrayList<Troncon>();
	private Troncon t1 = new Troncon(0, unA, unB, 0);
	private Troncon t2 = new Troncon(1, unB, unC, 0);
	private Troncon t3 = new Troncon(2, unC, unD, 0);
	private Troncon t4 = new Troncon(3, unD, unA, 0);
	
	@Before
	public void setUp() throws Exception {
		stationsAttendues[0]= unB;
		stationsAttendues[1]= unC;
		
		stations[0]= unA;
		stations[1]= unB;
		stations[2]= unC;
		stations[3]= unD;	
		
		
		
		troncons.add(t1);
		troncons.add(t2);
		troncons.add(t3);
		troncons.add(t4);
		
	}
	
	@Test
	public void testlaPlusProche(){
		Station a = Main.laPlusProche(stationsAttendues, homme);
		assertEquals("Le test de la methode laPlusProche a échoué.",stationsAttendues[0], a);
	}

	@Test
	public void testClearTroncons(){
		unC.setIncident(true);
		ArrayList<Troncon> tronconsVoulu = new ArrayList<Troncon>();
		tronconsVoulu.add(t1);
		tronconsVoulu.add(t4);
		
		ArrayList<Troncon> tronconsTest = Main.clearTroncons(troncons);
		
		assertEquals("",tronconsVoulu,tronconsTest);
	}
	
	
}
