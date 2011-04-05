import java.util.Scanner;


public class main {

	
	public static void main(String[] args) {
	
		Coordonnee Coorzola = new Coordonnee (102.65476 , 117.34587);
		Coordonnee CoorPorteItalie = new Coordonnee (48.81899 , 2.36025);
		Station zola  = new Station("Zola",40,Coorzola );
		//Station GareDeLest = new Station("Gare de l'est", 40, 107.876 , 127.655);
		Station PorteItalie = new Station ("Porte d'italie",40,CoorPorteItalie);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la latitude :");
		int latitude = sc.nextInt();
		System.out.println("Entrer la longitude :");
		int longitude = sc.nextInt();
		}
		
	
}


