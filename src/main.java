import java.util.ArrayList;
import java.util.Scanner;


public class main {

	public static ArrayList<Station> laPlusProche(ArrayList<Station> station) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la latitude :");
		int latitude = sc.nextInt();
		System.out.println("Entrer la longitude :");
		int longitude = sc.nextInt();
		ArrayList<Station> l = new ArrayList();
		for (Station s : station) {
			 if (((s.getX())-latitude)+(s.getY()-longitude) <= 20) {
				 
				 l.add(s);
			 }
		}
		return l;
		
	}
	public static void main(String[] args) {
	
		Coordonnee coorUnA = new Coordonnee (50,0);
		Station unA = new Station ("UnA", 40, coorUnA);

		Coordonnee coorUnB = new Coordonnee (50,25);
		Station unB = new Station ("UnB", 40, coorUnB);

		Coordonnee coorUnC = new Coordonnee (50,50);
		Station unC = new Station ("UnC", 40, coorUnC);

		Coordonnee coorUnD = new Coordonnee (50, 85);
		Station unD = new Station ("UnD", 40, coorUnD);

		Coordonnee coorUnE = new Coordonnee (50, 100);
		Station unE = new Station ("UnE", 40, coorUnE);

		Coordonnee coorUnF = new Coordonnee (50,140);
		Station unF = new Station ("UnF", 40, coorUnF);

		Coordonnee coorUnG = new Coordonnee (50,150);
		Station unG = new Station ("UnG", 40, coorUnG);

		Coordonnee coorUnH = new Coordonnee (50,170);
		Station unH = new Station ("UnH", 40, coorUnH);

		Coordonnee coorUnI = new Coordonnee (50,200);
		Station unI = new Station ("UnI", 40, coorUnI);

		Coordonnee coorUnJ = new Coordonnee (50,215);
		Station unJ = new Station ("UnJ", 40, coorUnJ);

		Coordonnee coorUnK = new Coordonnee (50,230);
		Station unK = new Station ("UnK", 40, coorUnK);

		Troncon tron1 = new Troncon (1, unA, unB, 40);
		Troncon tron2 = new Troncon (2, unB, unC, 40);
		Troncon tron3 = new Troncon (3, unC, unD, 40);
		Troncon tron4 = new Troncon (4, unD, unE, 40);
		Troncon tron5 = new Troncon (5, unE, unF, 40);
		Troncon tron6 = new Troncon (6, unF, unG, 40);
		Troncon tron7 = new Troncon (7, unG, unH, 40);
		Troncon tron8 = new Troncon (8, unH, unI, 40);
		Troncon tron9 = new Troncon (9, unI, unJ, 40);
		Troncon tron10 = new Troncon (10, unJ, unK, 40);
		
		Coordonnee coorDeuxA = new Coordonnee (100,0);
		Station deuxA = new Station ("DeuxA", 40, coorDeuxA);

		Coordonnee coorDeuxB = new Coordonnee (100,50);
		Station deuxB = new Station ("DeuxB", 40, coorDeuxB);

		Coordonnee coorDeuxC = new Coordonnee (100,60);
		Station deuxC = new Station ("DeuxC", 40, coorDeuxC);

		Coordonnee coorDeuxD = new Coordonnee (100, 90);
		Station deuxD = new Station ("DeuxD", 40, coorDeuxD);

		Coordonnee coorDeuxE = new Coordonnee (100, 100);
		Station deuxE = new Station ("DeuxE", 40, coorDeuxE);

		Coordonnee coorDeuxF = new Coordonnee (100,130);
		Station deuxF = new Station ("DeuxF", 40, coorDeuxF);

		Coordonnee coorDeuxG = new Coordonnee (100,150);
		Station deuxG = new Station ("DeuxG", 40, coorDeuxG);

		Coordonnee coorDeuxH = new Coordonnee (100,170);
		Station deuxH = new Station ("DeuxH", 40, coorDeuxH);

		Coordonnee coorDeuxI = new Coordonnee (100,200);
		Station deuxI = new Station ("DeuxI", 40, coorDeuxI);

		Coordonnee coorDeuxJ = new Coordonnee (100,240);
		Station deuxJ = new Station ("DeuxJ", 40, coorDeuxJ);

		Coordonnee coorDeuxK = new Coordonnee (100,250);
		Station deuxK = new Station ("DeuxK", 40, coorDeuxK);

		Troncon tron11 = new Troncon (11, deuxA, deuxB, 40);
		Troncon tron12 = new Troncon (12, deuxB, deuxC, 40);
		Troncon tron13 = new Troncon (13, deuxC, deuxD, 40);
		Troncon tron14 = new Troncon (14, deuxD, deuxE, 40);
		Troncon tron15 = new Troncon (15, deuxE, deuxF, 40);
		Troncon tron16 = new Troncon (16, deuxF, deuxG, 40);
		Troncon tron17 = new Troncon (17, deuxG, deuxH, 40);
		Troncon tron18 = new Troncon (18, deuxH, deuxI, 40);
		Troncon tron19 = new Troncon (19, deuxI, deuxJ, 40);
		Troncon tron20 = new Troncon (20, deuxJ, deuxK, 40);

		Coordonnee coorTroisA = new Coordonnee (150,0);
		Station troisA = new Station ("TroisA", 40, coorTroisA);

		Coordonnee coorTroisB = new Coordonnee (150,40);
		Station troisB = new Station ("TroisB", 40, coorTroisB);

		Coordonnee coorTroisC = new Coordonnee (150,50);
		Station troisC = new Station ("TroisC", 40, coorTroisC);

		Coordonnee coorTroisD = new Coordonnee (150, 90);
		Station troisD = new Station ("TroisD", 40, coorTroisD);

		Coordonnee coorTroisE = new Coordonnee (150, 100);
		Station troisE = new Station ("TroisE", 40, coorTroisE);

		Coordonnee coorTroisF = new Coordonnee (150,120);
		Station troisF = new Station ("TroisF", 40, coorTroisF);

		Coordonnee coorTroisG = new Coordonnee (150,150);
		Station troisG = new Station ("TroisG", 40, coorTroisG);

		Coordonnee coorTroisH = new Coordonnee (150,175);
		Station troisH = new Station ("TroisH", 40, coorTroisH);

		Coordonnee coorTroisI = new Coordonnee (150,200);
		Station troisI = new Station ("TroisI", 40, coorTroisI);

		Coordonnee coorTroisJ = new Coordonnee (150,220);
		Station troisJ = new Station ("TroisJ", 40, coorTroisJ);

		Coordonnee coorTroisK = new Coordonnee (150,250);
		Station troisK = new Station ("TroisK", 40, coorTroisK);

		Troncon tron21 = new Troncon (21, troisA, troisB, 40);
		Troncon tron22 = new Troncon (22, troisB, troisC, 40);
		Troncon tron23 = new Troncon (23, troisC, troisD, 40);
		Troncon tron24 = new Troncon (24, troisD, troisE, 40);
		Troncon tron25 = new Troncon (25, troisE, troisF, 40);
		Troncon tron26 = new Troncon (26, troisF, troisG, 40);
		Troncon tron27 = new Troncon (27, troisG, troisH, 40);
		Troncon tron28 = new Troncon (28, troisH, troisI, 40);
		Troncon tron29 = new Troncon (29, troisI, troisJ, 40);
		Troncon tron30 = new Troncon (30, troisJ, troisK, 40);

		Coordonnee coorQuatreA = new Coordonnee (10,50);
		Station quatreA = new Station ("QuatreA", 40, coorQuatreA);

		Coordonnee coorQuatreB = new Coordonnee (50,50);
		Station quatreB = new Station ("QuatreB", 40, coorQuatreB);

		Coordonnee coorQuatreC = new Coordonnee (70,50);
		Station quatreC = new Station ("QuatreC", 40, coorQuatreC);

		Coordonnee coorQuatreD = new Coordonnee (100,50);
		Station quatreD = new Station ("QuatreD", 40, coorQuatreD);

		Coordonnee coorQuatreE = new Coordonnee (120,50);
		Station quatreE = new Station ("QuatreE", 40, coorQuatreE);

		Coordonnee coorQuatreF = new Coordonnee (130,50);
		Station quatreF = new Station ("QuatreF", 40, coorQuatreF);

		Coordonnee coorQuatreG = new Coordonnee (140,50);
		Station quatreG = new Station ("QuatreG", 40, coorQuatreG);

		Coordonnee coorQuatreH = new Coordonnee (150,50);
		Station quatreH = new Station ("QuatreH", 40, coorQuatreH);

		Coordonnee coorQuatreI = new Coordonnee (160,50);
		Station quatreI = new Station ("QuatreI", 40, coorQuatreI);

		Coordonnee coorQuatreJ = new Coordonnee (200,50);
		Station quatreJ = new Station ("QuatreJ", 40, coorQuatreJ);

		Troncon tron31 = new Troncon (31, quatreA, quatreB, 40);
		Troncon tron32 = new Troncon (32, quatreB, quatreC, 40);
		Troncon tron33 = new Troncon (33, quatreC, quatreD, 40);
		Troncon tron34 = new Troncon (34, quatreD, quatreE, 40);
		Troncon tron35 = new Troncon (35, quatreE, quatreF, 40);
		Troncon tron36 = new Troncon (36, quatreF, quatreG, 40);
		Troncon tron37 = new Troncon (37, quatreG, quatreH, 40);
		Troncon tron38 = new Troncon (38, quatreH, quatreI, 40);
		Troncon tron39 = new Troncon (39, quatreI, quatreJ, 40);

		Coordonnee coorCinqA = new Coordonnee (25,100);
		Station cinqA = new Station ("CinqA", 40, coorCinqA);

		Coordonnee coorCinqB = new Coordonnee (50,100);
		Station cinqB = new Station ("CinqB", 40, coorCinqB);

		Coordonnee coorCinqC = new Coordonnee (70,100);
		Station cinqC = new Station ("CinqC", 40, coorCinqC);

		Coordonnee coorCinqD = new Coordonnee (90,100);
		Station cinqD = new Station ("CinqD", 40, coorCinqD);

		Coordonnee coorCinqE = new Coordonnee (100,100);
		Station cinqE = new Station ("CinqE", 40, coorCinqE);

		Coordonnee coorCinqF = new Coordonnee (110,100);
		Station cinqF = new Station ("CinqF", 40, coorCinqF);

		Coordonnee coorCinqG = new Coordonnee (130,100);
		Station cinqG = new Station ("CinqG", 40, coorCinqG);

		Coordonnee coorCinqH = new Coordonnee (150,100);
		Station cinqH = new Station ("CinqH", 40, coorCinqH);

		Coordonnee coorCinqI = new Coordonnee (180,100);
		Station cinqI = new Station ("CinqI", 40, coorCinqI);

		Coordonnee coorCinqJ = new Coordonnee (200,100);
		Station cinqJ = new Station ("CinqJ", 40, coorCinqJ);

		Troncon tron40 = new Troncon (40, cinqA, cinqB, 40);
		Troncon tron41 = new Troncon (41, cinqB, cinqC, 40);
		Troncon tron42 = new Troncon (42, cinqC, cinqD, 40);
		Troncon tron43 = new Troncon (43, cinqD, cinqE, 40);
		Troncon tron44 = new Troncon (44, cinqE, cinqF, 40);
		Troncon tron45 = new Troncon (45, cinqF, cinqG, 40);
		Troncon tron46 = new Troncon (46, cinqG, cinqH, 40);
		Troncon tron47 = new Troncon (47, cinqH, cinqI, 40);
		Troncon tron48 = new Troncon (48, cinqI, cinqJ, 40);

		Coordonnee coorSixA = new Coordonnee (0,150);
		Station sixA = new Station ("SixA", 40, coorSixA);

		Coordonnee coorSixB = new Coordonnee (20,150);
		Station sixB = new Station ("SixB", 40, coorSixB);

		Coordonnee coorSixC = new Coordonnee (50,150);
		Station sixC = new Station ("SixC", 40, coorSixC);

		Coordonnee coorSixD = new Coordonnee (70,150);
		Station sixD = new Station ("SixD", 40, coorSixD);

		Coordonnee coorSixE = new Coordonnee (85,150);
		Station sixE = new Station ("SixE", 40, coorSixE);

		Coordonnee coorSixF = new Coordonnee (100,150);
		Station sixF = new Station ("SixF", 40, coorSixF);

		Coordonnee coorSixG = new Coordonnee (120,150);
		Station sixG = new Station ("SixG", 40, coorSixG);

		Coordonnee coorSixH = new Coordonnee (150,150);
		Station sixH = new Station ("SixH", 40, coorSixH);

		Coordonnee coorSixI = new Coordonnee (165,150);
		Station sixI = new Station ("SixI", 40, coorSixI);

		Coordonnee coorSixJ = new Coordonnee (200,150);
		Station sixJ = new Station ("SixJ", 40, coorSixJ);

		Troncon tron49 = new Troncon (49, sixA, sixB, 40);
		Troncon tron50 = new Troncon (50, sixB, sixC, 40);
		Troncon tron51 = new Troncon (51, sixC, sixD, 40);
		Troncon tron52 = new Troncon (52, sixD, sixE, 40);
		Troncon tron53 = new Troncon (53, sixE, sixF, 40);
		Troncon tron54 = new Troncon (54, sixF, sixG, 40);
		Troncon tron55 = new Troncon (55, sixG, sixH, 40);
		Troncon tron56 = new Troncon (56, sixH, sixI, 40);
		Troncon tron57 = new Troncon (57, sixI, sixJ, 40);

		Coordonnee coorSeptA = new Coordonnee (10,200);
		Station septA = new Station ("SeptA", 40, coorSeptA);

		Coordonnee coorSeptB = new Coordonnee (35,200);
		Station septB = new Station ("SeptB", 40, coorSeptB);

		Coordonnee coorSeptC = new Coordonnee (50,200);
		Station septC = new Station ("SeptC", 40, coorSeptC);

		Coordonnee coorSeptD = new Coordonnee (75,200);
		Station septD = new Station ("SeptD", 40, coorSeptD);

		Coordonnee coorSeptE = new Coordonnee (100,200);
		Station septE = new Station ("SeptE", 40, coorSeptE);

		Coordonnee coorSeptF = new Coordonnee (120,200);
		Station septF = new Station ("SeptF", 40, coorSeptF);

		Coordonnee coorSeptG = new Coordonnee (150,200);
		Station septG = new Station ("SeptG", 40, coorSeptG);

		Coordonnee coorSeptH = new Coordonnee (200,200);
		Station septH = new Station ("SeptH", 40, coorSeptH);

		Troncon tron58 = new Troncon (58, septA, septB, 40);
		Troncon tron59 = new Troncon (59, septB, septC, 40);
		Troncon tron60 = new Troncon (60, septC, septD, 40);
		Troncon tron61 = new Troncon (61, septD, septE, 40);
		Troncon tron62 = new Troncon (62, septE, septF, 40);
		Troncon tron63 = new Troncon (63, septF, septG, 40);
		Troncon tron64 = new Troncon (64, septG, septH, 40);

		ArrayList<Troncon> tronconLigneUn = new ArrayList<Troncon>();
		tronconLigneUn.add(tron1);
		tronconLigneUn.add(tron2);
		tronconLigneUn.add(tron3);
		tronconLigneUn.add(tron4);
		tronconLigneUn.add(tron5);
		tronconLigneUn.add(tron6);
		tronconLigneUn.add(tron7);
		tronconLigneUn.add(tron8);
		tronconLigneUn.add(tron9);
		tronconLigneUn.add(tron10);

		ArrayList<Troncon> tronconLigneDeux = new ArrayList<Troncon>();
		tronconLigneDeux.add(tron11);
		tronconLigneDeux.add(tron12);
		tronconLigneDeux.add(tron13);
		tronconLigneDeux.add(tron14);
		tronconLigneDeux.add(tron15);
		tronconLigneDeux.add(tron16);
		tronconLigneDeux.add(tron17);
		tronconLigneDeux.add(tron18);
		tronconLigneDeux.add(tron19);
		tronconLigneDeux.add(tron20);

		ArrayList<Troncon> tronconLigneTrois = new ArrayList<Troncon>();
		tronconLigneTrois.add(tron21);
		tronconLigneTrois.add(tron22);
		tronconLigneTrois.add(tron23);
		tronconLigneTrois.add(tron24);
		tronconLigneTrois.add(tron25);
		tronconLigneTrois.add(tron26);
		tronconLigneTrois.add(tron27);
		tronconLigneTrois.add(tron28);
		tronconLigneTrois.add(tron29);
		tronconLigneTrois.add(tron30);

		ArrayList<Troncon> tronconLigneQuatre = new ArrayList<Troncon>();
		tronconLigneQuatre.add(tron31);
		tronconLigneQuatre.add(tron32);
		tronconLigneQuatre.add(tron33);
		tronconLigneQuatre.add(tron34);
		tronconLigneQuatre.add(tron35);
		tronconLigneQuatre.add(tron36);
		tronconLigneQuatre.add(tron37);
		tronconLigneQuatre.add(tron38);
		tronconLigneQuatre.add(tron39);

		ArrayList<Troncon> tronconLigneCinq = new ArrayList<Troncon>();
		tronconLigneCinq.add(tron40);
		tronconLigneCinq.add(tron41);
		tronconLigneCinq.add(tron42);
		tronconLigneCinq.add(tron43);
		tronconLigneCinq.add(tron44);
		tronconLigneCinq.add(tron45);
		tronconLigneCinq.add(tron46);
		tronconLigneCinq.add(tron47);
		tronconLigneCinq.add(tron48);

		ArrayList<Troncon> tronconLigneSix = new ArrayList<Troncon>();
		tronconLigneSix.add(tron49);
		tronconLigneSix.add(tron50);
		tronconLigneSix.add(tron51);
		tronconLigneSix.add(tron52);
		tronconLigneSix.add(tron53);
		tronconLigneSix.add(tron54);
		tronconLigneSix.add(tron55);
		tronconLigneSix.add(tron56);
		tronconLigneSix.add(tron57);

		ArrayList<Troncon> tronconLigneSept = new ArrayList<Troncon>();
		tronconLigneSept.add(tron58);
		tronconLigneSept.add(tron59);
		tronconLigneSept.add(tron60);
		tronconLigneSept.add(tron61);
		tronconLigneSept.add(tron62);
		tronconLigneSept.add(tron63);
		tronconLigneSept.add(tron64);

		Ligne ligneUn = new Ligne("LigneUn",tronconLigneUn);
		Ligne ligneDeux = new Ligne("LigneDeux",tronconLigneDeux);
		Ligne ligneTrois = new Ligne("LigneTrois",tronconLigneTrois);
		Ligne ligneQuatre = new Ligne("LigneQuatre",tronconLigneQuatre);
		Ligne ligneCinq = new Ligne("LigneCinq",tronconLigneCinq);
		Ligne ligneSix = new Ligne("LigneSix",tronconLigneSix);
		Ligne ligneSept = new Ligne("LigneSept",tronconLigneSept);
		
		ArrayList<Station> listeStation = new ArrayList<Station>();
		listeStation.add(unA);
		listeStation.add(unB);
		listeStation.add(unC);
		listeStation.add(unD);
		listeStation.add(unE);
		listeStation.add(unF);
		listeStation.add(unG);
		listeStation.add(unH);
		listeStation.add(unI);
		listeStation.add(unJ);
		listeStation.add(unK);
		
		listeStation.add(deuxA);
		listeStation.add(deuxB);
		listeStation.add(deuxC);
		listeStation.add(deuxD);
		listeStation.add(deuxE);
		listeStation.add(deuxF);
		listeStation.add(deuxG);
		listeStation.add(deuxH);
		listeStation.add(deuxI);
		listeStation.add(deuxJ);
		listeStation.add(deuxK);

		listeStation.add(troisA);
		listeStation.add(troisB);
		listeStation.add(troisC);
		listeStation.add(troisD);
		listeStation.add(troisE);
		listeStation.add(troisF);
		listeStation.add(troisG);
		listeStation.add(troisH);
		listeStation.add(troisI);
		listeStation.add(troisJ);
		listeStation.add(troisK);
		
		listeStation.add(quatreA);
		listeStation.add(quatreB);
		listeStation.add(quatreC);
		listeStation.add(quatreD);
		listeStation.add(quatreE);
		listeStation.add(quatreF);
		listeStation.add(quatreG);
		listeStation.add(quatreH);
		listeStation.add(quatreI);
		listeStation.add(quatreJ);
		
		listeStation.add(cinqA);
		listeStation.add(cinqB);
		listeStation.add(cinqC);
		listeStation.add(cinqD);
		listeStation.add(cinqE);
		listeStation.add(cinqF);
		listeStation.add(cinqG);
		listeStation.add(cinqH);
		listeStation.add(cinqI);
		listeStation.add(cinqJ);
		
		listeStation.add(sixA);
		listeStation.add(sixB);
		listeStation.add(sixC);
		listeStation.add(sixD);
		listeStation.add(sixE);
		listeStation.add(sixF);
		listeStation.add(sixG);
		listeStation.add(sixH);
		listeStation.add(sixI);
		listeStation.add(sixJ);
		
		listeStation.add(septA);
		listeStation.add(septB);
		listeStation.add(septC);
		listeStation.add(septD);
		listeStation.add(septE);
		listeStation.add(septF);
		listeStation.add(septG);
		listeStation.add(septH);
		
		//laPlusProche(listeStation);
		for (Station e : laPlusProche(listeStation)) {
			System.out.println(e.getNom());
		}
		
		
		}
		
	
}


