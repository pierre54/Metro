package metro;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class mainTest {
	
	private Station[] stations= new Station[4];
	private Station[] stationsAttendues= new Station[2];
	private Coordonnee coorUnA = new Coordonnee(0,0);
	private Station unA = new Station("UnA",40,coorUnA);
	private Coordonnee coorUnB = new Coordonnee(60,0);
	private Station unB = new Station("UnB",40,coorUnB);
	private Coordonnee coorUnC = new Coordonnee(110,0);
	private Station unC = new Station("UnC",40,coorUnC);
	private Coordonnee coorUnD = new Coordonnee(200,0);
	private Station unD = new Station("UnD",40,coorUnD);
	private Coordonnee homme = new Coordonnee(80,0);
	
	@Before
	public void setUp() throws Exception {
		stationsAttendues[0]= unB;
		stationsAttendues[1]= unC;
		
		stations[0]= unA;
		stations[1]= unB;
		stations[2]= unC;
		stations[3]= unD;
		
	}
	
	@Test
	public void testlaPlusProche(){
		System.out.println("stationLaPlusProche");
		stationsAttendues[0]= unB;
		stationsAttendues[1]= unC;
		
		Station[] a = main.laPlusProche(stations, homme);
		assertArrayEquals(" : Le test a échoué.",stationsAttendues, a);
	}
	
	
}
