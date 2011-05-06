package metro;

import org.junit.*;
import static org.junit.Assert.*;

public class stationTest {

	Coordonnee c = new Coordonnee(15,50);
	Coordonnee c2 = new Coordonnee(150,500);
	Station s = new Station("premiere station", 14,c);
	
	@Before
	public void setUp() throws Exception {}
	
	@Test
	public void testEquals(){
		Station s2 = new Station("premiere station", 40,c2);
		
		assertEquals("le test d'equals de Station a échoué",s2,s);
	}
}
