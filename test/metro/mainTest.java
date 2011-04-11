package metro;


import org.junit.Before;
import org.junit.Test;

public class mainTest {
		
	private Station[] stationsAttendues = new Station[10];
	private Coordonnee coorUnA = new Coordonnee (0,0);
	private Station UnA = new Station("UnA",40,coorUnA);
	private Coordonnee coorUnB = new Coordonnee (10,0);
	private Station UnB = new Station("UnB",40,coorUnB);
	private Coordonnee coorUnC = new Coordonnee (20,0);
	private Station UnC = new Station("UnC",40,coorUnC);
	private Coordonnee coorUnD = new Coordonnee (30,0);
	private Station UnD = new Station("UnD",40,coorUnD);
	
	Station[0].add(UnA);
	Station[1].add(UnB);
	Station[2].add(UnC);
	Station[3].add(UnD);
	
	@Before
	public void setUp() throws Exception {	
	}

}