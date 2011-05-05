package metro;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static Coordonnee ask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la latitude :");
		int latitude = sc.nextInt();
		System.out.println("Entrer la longitude :");
		int longitude = sc.nextInt();
		Coordonnee c = new Coordonnee(latitude,longitude);
		return c;
		
	}
	
	public static Station[] laPlusProche(Station[] station, Coordonnee c) {
		int i = 0; 
		for (int j = 0; j <station.length ; j++) {
			if  (Math.sqrt((Math.pow((station[j].getX()-c.getX()),2)+Math.pow(station[j].getY()-c.getY(),2))) <= 50) {
				i++;
			}
		}
		
		Station[] l = new Station[i];
		i=0;
		
		for (int j = 0; j <station.length ; j++) {
			if  (Math.sqrt((Math.pow((station[j].getX()-c.getX()),2)+Math.pow(station[j].getY()-c.getY(),2))) <= 50) {
				l[i] = station[j];
				i++;
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
		Troncon tron2 = new Troncon (2, unB, unC, 50);
		Troncon tron3 = new Troncon (3, unC, unD, 100);
		Troncon tron4 = new Troncon (4, unD, unE, 60);
		Troncon tron5 = new Troncon (5, unE, unF, 40);
		Troncon tron6 = new Troncon (6, unF, unG, 40);
		Troncon tron7 = new Troncon (7, unG, unH, 40);
		Troncon tron8 = new Troncon (8, unH, unI, 40);
		Troncon tron9 = new Troncon (9, unI, unJ, 40);
		Troncon tron10 = new Troncon (10, unJ, unK, 40);
		
		Troncon tron65 = new Troncon (65, unB, unA, 40);
		Troncon tron66 = new Troncon (66, unC, unB, 50);
		Troncon tron67 = new Troncon (67, unD, unC, 30);
		Troncon tron68 = new Troncon (68, unE, unD, 60);
		Troncon tron69 = new Troncon (69, unF, unE, 40);
		Troncon tron70 = new Troncon (70, unG, unF, 40);
		Troncon tron71 = new Troncon (71, unH, unG, 40);
		Troncon tron72 = new Troncon (72, unI, unH, 40);
		Troncon tron73 = new Troncon (73, unJ, unI, 40);
		Troncon tron74 = new Troncon (74, unK, unJ, 40);
		
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

		Troncon tron11 = new Troncon (11, deuxA, deuxB, 70);
		Troncon tron12 = new Troncon (12, deuxB, deuxC, 10);
		Troncon tron13 = new Troncon (13, deuxC, deuxD, 10);
		Troncon tron14 = new Troncon (14, deuxD, deuxE, 20);
		Troncon tron15 = new Troncon (15, deuxE, deuxF, 40);
		Troncon tron16 = new Troncon (16, deuxF, deuxG, 40);
		Troncon tron17 = new Troncon (17, deuxG, deuxH, 40);
		Troncon tron18 = new Troncon (18, deuxH, deuxI, 40);
		Troncon tron19 = new Troncon (19, deuxI, deuxJ, 40);
		Troncon tron20 = new Troncon (20, deuxJ, deuxK, 40);
	
		Troncon tron75 = new Troncon (75, deuxB, deuxA, 70);
		Troncon tron76 = new Troncon (76, deuxC, deuxB, 10);
		Troncon tron77 = new Troncon (77, deuxD, deuxC, 10);
		Troncon tron78 = new Troncon (78, deuxE, deuxD, 20);
		Troncon tron79 = new Troncon (79, deuxF, deuxE, 40);
		Troncon tron80 = new Troncon (80, deuxG, deuxF, 40);
		Troncon tron81 = new Troncon (81, deuxH, deuxG, 40);
		Troncon tron82 = new Troncon (82, deuxI, deuxH, 40);
		Troncon tron83 = new Troncon (83, deuxJ, deuxI, 40);
		Troncon tron84 = new Troncon (84, deuxK, deuxJ, 40);
	
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
		
		Troncon tron85 = new Troncon (85, troisB, troisA, 40);
		Troncon tron86 = new Troncon (86, troisC, troisB, 40);
		Troncon tron87 = new Troncon (87, troisD, troisC, 40);
		Troncon tron88 = new Troncon (88, troisE, troisD, 40);
		Troncon tron89 = new Troncon (89, troisF, troisE, 40);
		Troncon tron90 = new Troncon (90, troisG, troisF, 40);
		Troncon tron91 = new Troncon (91, troisH, troisG, 40);
		Troncon tron92 = new Troncon (92, troisI, troisH, 40);
		Troncon tron93 = new Troncon (93, troisJ, troisI, 40);
		Troncon tron94 = new Troncon (94, troisK, troisJ, 40);
		
		Coordonnee coorQuatreA = new Coordonnee (10,50);
		Station quatreA = new Station ("QuatreA", 40, coorQuatreA);

		//Coordonnee coorQuatreB = new Coordonnee (50,50);
		//Station quatreB = new Station ("QuatreB", 40, coorQuatreB);

		Coordonnee coorQuatreC = new Coordonnee (70,50);
		Station quatreC = new Station ("QuatreC", 40, coorQuatreC);

		//Coordonnee coorQuatreD = new Coordonnee (100,50);
		//Station quatreD = new Station ("QuatreD", 40, coorQuatreD);

		Coordonnee coorQuatreE = new Coordonnee (120,50);
		Station quatreE = new Station ("QuatreE", 40, coorQuatreE);

		Coordonnee coorQuatreF = new Coordonnee (130,50);
		Station quatreF = new Station ("QuatreF", 40, coorQuatreF);

		Coordonnee coorQuatreG = new Coordonnee (140,50);
		Station quatreG = new Station ("QuatreG", 40, coorQuatreG);

		//Coordonnee coorQuatreH = new Coordonnee (150,50);
		//Station quatreH = new Station ("QuatreH", 40, coorQuatreH);

		Coordonnee coorQuatreI = new Coordonnee (160,50);
		Station quatreI = new Station ("QuatreI", 40, coorQuatreI);

		Coordonnee coorQuatreJ = new Coordonnee (200,50);
		Station quatreJ = new Station ("QuatreJ", 40, coorQuatreJ);

		Troncon tron31 = new Troncon (31, quatreA, unC, 40);
		Troncon tron32 = new Troncon (32, unC, quatreC, 15);
		Troncon tron33 = new Troncon (33, quatreC, deuxB, 25);
		Troncon tron34 = new Troncon (34, deuxB, quatreE, 40);
		Troncon tron35 = new Troncon (35, quatreE, quatreF, 40);
		Troncon tron36 = new Troncon (36, quatreF, quatreG, 40);
		Troncon tron37 = new Troncon (37, quatreG, troisC, 40);
		Troncon tron38 = new Troncon (38, troisC, quatreI, 40);
		Troncon tron39 = new Troncon (39, quatreI, quatreJ, 40);
		
		Troncon tron95 = new Troncon (95, unC, quatreA, 40);
		Troncon tron96 = new Troncon (96, quatreC, unC, 15);
		Troncon tron97 = new Troncon (97, deuxB, quatreC, 25);
		Troncon tron98 = new Troncon (98, quatreE, deuxB, 40);
		Troncon tron99 = new Troncon (99, quatreF, quatreE, 40);
		Troncon tron100 = new Troncon (100, quatreG, quatreF, 40);
		Troncon tron101 = new Troncon (101, troisC, quatreG, 40);
		Troncon tron102 = new Troncon (102, quatreI, troisC, 40);
		Troncon tron103 = new Troncon (103, quatreJ, quatreI, 40);
		
		Coordonnee coorCinqA = new Coordonnee (25,100);
		Station cinqA = new Station ("CinqA", 40, coorCinqA);

		//Coordonnee coorCinqB = new Coordonnee (50,100);
		//Station cinqB = new Station ("CinqB", 40, coorCinqB);

		Coordonnee coorCinqC = new Coordonnee (70,100);
		Station cinqC = new Station ("CinqC", 40, coorCinqC);

		Coordonnee coorCinqD = new Coordonnee (90,100);
		Station cinqD = new Station ("CinqD", 40, coorCinqD);

		//Coordonnee coorCinqE = new Coordonnee (100,100);
		//Station cinqE = new Station ("CinqE", 40, coorCinqE);

		Coordonnee coorCinqF = new Coordonnee (110,100);
		Station cinqF = new Station ("CinqF", 40, coorCinqF);

		Coordonnee coorCinqG = new Coordonnee (130,100);
		Station cinqG = new Station ("CinqG", 40, coorCinqG);

		//Coordonnee coorCinqH = new Coordonnee (150,100);
		//Station cinqH = new Station ("CinqH", 40, coorCinqH);

		Coordonnee coorCinqI = new Coordonnee (180,100);
		Station cinqI = new Station ("CinqI", 40, coorCinqI);

		Coordonnee coorCinqJ = new Coordonnee (200,100);
		Station cinqJ = new Station ("CinqJ", 40, coorCinqJ);
	
		Troncon tron40 = new Troncon (40, cinqA, unE, 40);
		Troncon tron41 = new Troncon (41, unE, cinqC, 10);
		Troncon tron42 = new Troncon (42, cinqC, cinqD, 10);
		Troncon tron43 = new Troncon (43, cinqD, deuxE, 10);
		Troncon tron44 = new Troncon (44, deuxE, cinqF, 40);
		Troncon tron45 = new Troncon (45, cinqF, cinqG, 40);
		Troncon tron46 = new Troncon (46, cinqG, troisE, 40);
		Troncon tron47 = new Troncon (47, troisE, cinqI, 40);
		Troncon tron48 = new Troncon (48, cinqI, cinqJ, 40);
	
		Troncon tron104 = new Troncon (104, unE, cinqA, 40);
		Troncon tron105 = new Troncon (105, cinqC, unE, 10);
		Troncon tron106 = new Troncon (106, cinqD, cinqC, 10);
		Troncon tron107 = new Troncon (107, deuxE, cinqD, 10);
		Troncon tron108 = new Troncon (108, cinqF, deuxE, 40);
		Troncon tron109 = new Troncon (109, cinqG, cinqF, 40);
		Troncon tron110 = new Troncon (110, troisE, cinqG, 40);
		Troncon tron111 = new Troncon (111, cinqI, troisE, 40);
		Troncon tron112 = new Troncon (112, cinqJ, cinqI, 40);
		
		Coordonnee coorSixA = new Coordonnee (0,150);
		Station sixA = new Station ("SixA", 40, coorSixA);

		Coordonnee coorSixB = new Coordonnee (20,150);
		Station sixB = new Station ("SixB", 40, coorSixB);

		//Coordonnee coorSixC = new Coordonnee (50,150);
		//Station sixC = new Station ("SixC", 40, coorSixC);

		Coordonnee coorSixD = new Coordonnee (70,150);
		Station sixD = new Station ("SixD", 40, coorSixD);

		Coordonnee coorSixE = new Coordonnee (85,150);
		Station sixE = new Station ("SixE", 40, coorSixE);

		//Coordonnee coorSixF = new Coordonnee (100,150);
		//Station sixF = new Station ("SixF", 40, coorSixF);

		Coordonnee coorSixG = new Coordonnee (120,150);
		Station sixG = new Station ("SixG", 40, coorSixG);

		//Coordonnee coorSixH = new Coordonnee (150,150);
		//Station sixH = new Station ("SixH", 40, coorSixH);

		Coordonnee coorSixI = new Coordonnee (165,150);
		Station sixI = new Station ("SixI", 40, coorSixI);

		Coordonnee coorSixJ = new Coordonnee (200,150);
		Station sixJ = new Station ("SixJ", 40, coorSixJ);
		
		Troncon tron49 = new Troncon (49, sixA, sixB, 40);
		Troncon tron50 = new Troncon (50, sixB, unG, 40);
		Troncon tron51 = new Troncon (51, unG, sixD, 40);
		Troncon tron52 = new Troncon (52, sixD, sixE, 40);
		Troncon tron53 = new Troncon (53, sixE, deuxG, 40);
		Troncon tron54 = new Troncon (54, deuxG, sixG, 40);
		Troncon tron55 = new Troncon (55, sixG, troisG, 40);
		Troncon tron56 = new Troncon (56, troisG, sixI, 40);
		Troncon tron57 = new Troncon (57, sixI, sixJ, 40);
		
		Troncon tron113 = new Troncon (113, sixB, sixA, 40);
		Troncon tron114 = new Troncon (116, unG, sixB, 40);
		Troncon tron115 = new Troncon (117, sixD, unG, 40);
		Troncon tron116 = new Troncon (118, sixE, sixD, 40);
		Troncon tron117 = new Troncon (117, deuxG, sixE, 40);
		Troncon tron118 = new Troncon (118, sixG, deuxG, 40);
		Troncon tron119 = new Troncon (119, troisG, sixG, 40);
		Troncon tron120 = new Troncon (120, sixI, troisG, 40);
		Troncon tron121 = new Troncon (121, sixJ, sixI, 40);
		
		Coordonnee coorSeptA = new Coordonnee (10,200);
		Station septA = new Station ("SeptA", 40, coorSeptA);

		Coordonnee coorSeptB = new Coordonnee (35,200);
		Station septB = new Station ("SeptB", 40, coorSeptB);

		//Coordonnee coorSeptC = new Coordonnee (50,200);
		//Station septC = new Station ("SeptC", 40, coorSeptC);

		Coordonnee coorSeptD = new Coordonnee (75,200);
		Station septD = new Station ("SeptD", 40, coorSeptD);

		//Coordonnee coorSeptE = new Coordonnee (100,200);
		//Station septE = new Station ("SeptE", 40, coorSeptE);

		Coordonnee coorSeptF = new Coordonnee (120,200);
		Station septF = new Station ("SeptF", 40, coorSeptF);

		//Coordonnee coorSeptG = new Coordonnee (150,200);
		//Station septG = new Station ("SeptG", 40, coorSeptG);

		Coordonnee coorSeptH = new Coordonnee (200,200);
		Station septH = new Station ("SeptH", 40, coorSeptH);
		
		Troncon tron58 = new Troncon (58, septA, septB, 40);
		Troncon tron59 = new Troncon (59, septB, unI, 40);
		Troncon tron60 = new Troncon (60, unI, septD, 40);
		Troncon tron61 = new Troncon (61, septD, deuxI, 40);
		Troncon tron62 = new Troncon (62, deuxI, septF, 40);
		Troncon tron63 = new Troncon (63, septF, troisI, 40);
		Troncon tron64 = new Troncon (64, troisI, septH, 40);
		
		Troncon tron122 = new Troncon (122, septB, septA, 40);
		Troncon tron123 = new Troncon (123, unI, septB, 40);
		Troncon tron124 = new Troncon (124, septD, unI, 40);
		Troncon tron125 = new Troncon (125, deuxI, septD, 40);
		Troncon tron126 = new Troncon (126, septF, deuxI, 40);
		Troncon tron127 = new Troncon (127, troisI, septF, 40);
		Troncon tron128 = new Troncon (128, septH, troisI, 40);
		
		Ligne ligneUn = new Ligne("LigneUn");
		ligneUn.ajoutTroncon(tron1);
		ligneUn.ajoutTroncon(tron2);
		ligneUn.ajoutTroncon(tron3);
		ligneUn.ajoutTroncon(tron4);
		ligneUn.ajoutTroncon(tron5);
		ligneUn.ajoutTroncon(tron6);
		ligneUn.ajoutTroncon(tron7);
		ligneUn.ajoutTroncon(tron8);
		ligneUn.ajoutTroncon(tron9);
		ligneUn.ajoutTroncon(tron10);
		
		Ligne ligneUnBis = new Ligne("LigneUnBis");
		ligneUnBis.ajoutTroncon(tron65);
		ligneUnBis.ajoutTroncon(tron66);
		ligneUnBis.ajoutTroncon(tron67);
		ligneUnBis.ajoutTroncon(tron68);
		ligneUnBis.ajoutTroncon(tron69);
		ligneUnBis.ajoutTroncon(tron70);
		ligneUnBis.ajoutTroncon(tron71);
		ligneUnBis.ajoutTroncon(tron72);
		ligneUnBis.ajoutTroncon(tron73);
		ligneUnBis.ajoutTroncon(tron74);
		
		Ligne ligneDeux = new Ligne("LigneDeux");
		ligneDeux.ajoutTroncon(tron11);
		ligneDeux.ajoutTroncon(tron12);
		ligneDeux.ajoutTroncon(tron13);
		ligneDeux.ajoutTroncon(tron14);
		ligneDeux.ajoutTroncon(tron15);
		ligneDeux.ajoutTroncon(tron16);
		ligneDeux.ajoutTroncon(tron17);
		ligneDeux.ajoutTroncon(tron18);
		ligneDeux.ajoutTroncon(tron19);
		ligneDeux.ajoutTroncon(tron20);
		
		Ligne ligneDeuxBis = new Ligne("LigneDeuxBis");
		ligneDeuxBis.ajoutTroncon(tron75);
		ligneDeuxBis.ajoutTroncon(tron76);
		ligneDeuxBis.ajoutTroncon(tron77);
		ligneDeuxBis.ajoutTroncon(tron78);
		ligneDeuxBis.ajoutTroncon(tron79);
		ligneDeuxBis.ajoutTroncon(tron80);
		ligneDeuxBis.ajoutTroncon(tron81);
		ligneDeuxBis.ajoutTroncon(tron82);
		ligneDeuxBis.ajoutTroncon(tron83);
		ligneDeuxBis.ajoutTroncon(tron84);
		
		Ligne ligneTrois = new Ligne("LigneTrois");
		ligneTrois.ajoutTroncon(tron21);
		ligneTrois.ajoutTroncon(tron22);
		ligneTrois.ajoutTroncon(tron23);
		ligneTrois.ajoutTroncon(tron24);
		ligneTrois.ajoutTroncon(tron25);
		ligneTrois.ajoutTroncon(tron26);
		ligneTrois.ajoutTroncon(tron27);
		ligneTrois.ajoutTroncon(tron28);
		ligneTrois.ajoutTroncon(tron29);
		ligneTrois.ajoutTroncon(tron30);
		
		Ligne ligneTroisBis = new Ligne("LigneTroisBis");
		ligneTroisBis.ajoutTroncon(tron85);
		ligneTroisBis.ajoutTroncon(tron86);
		ligneTroisBis.ajoutTroncon(tron87);
		ligneTroisBis.ajoutTroncon(tron88);
		ligneTroisBis.ajoutTroncon(tron89);
		ligneTroisBis.ajoutTroncon(tron90);
		ligneTroisBis.ajoutTroncon(tron91);
		ligneTroisBis.ajoutTroncon(tron92);
		ligneTroisBis.ajoutTroncon(tron93);
		ligneTroisBis.ajoutTroncon(tron94);
		
		Ligne ligneQuatre = new Ligne("LigneQuatre");
		ligneQuatre.ajoutTroncon(tron31);
		ligneQuatre.ajoutTroncon(tron32);
		ligneQuatre.ajoutTroncon(tron33);
		ligneQuatre.ajoutTroncon(tron34);
		ligneQuatre.ajoutTroncon(tron35);
		ligneQuatre.ajoutTroncon(tron36);
		ligneQuatre.ajoutTroncon(tron37);
		ligneQuatre.ajoutTroncon(tron38);
		ligneQuatre.ajoutTroncon(tron39);
		
		Ligne ligneQuatreBis = new Ligne("LigneQuatreBis");
		ligneQuatreBis.ajoutTroncon(tron95);
		ligneQuatreBis.ajoutTroncon(tron96);
		ligneQuatreBis.ajoutTroncon(tron97);
		ligneQuatreBis.ajoutTroncon(tron98);
		ligneQuatreBis.ajoutTroncon(tron99);
		ligneQuatreBis.ajoutTroncon(tron100);
		ligneQuatreBis.ajoutTroncon(tron101);
		ligneQuatreBis.ajoutTroncon(tron102);
		ligneQuatreBis.ajoutTroncon(tron103);
		
		Ligne ligneCinq = new Ligne("LigneCinq");
		ligneCinq.ajoutTroncon(tron40);
		ligneCinq.ajoutTroncon(tron41);
		ligneCinq.ajoutTroncon(tron42);
		ligneCinq.ajoutTroncon(tron43);
		ligneCinq.ajoutTroncon(tron44);
		ligneCinq.ajoutTroncon(tron45);
		ligneCinq.ajoutTroncon(tron46);
		ligneCinq.ajoutTroncon(tron47);
		ligneCinq.ajoutTroncon(tron48);
		
		Ligne ligneCinqBis = new Ligne("LigneCinqBis");
		ligneCinqBis.ajoutTroncon(tron104);
		ligneCinqBis.ajoutTroncon(tron105);
		ligneCinqBis.ajoutTroncon(tron106);
		ligneCinqBis.ajoutTroncon(tron107);
		ligneCinqBis.ajoutTroncon(tron108);
		ligneCinqBis.ajoutTroncon(tron109);
		ligneCinqBis.ajoutTroncon(tron110);
		ligneCinqBis.ajoutTroncon(tron111);
		ligneCinqBis.ajoutTroncon(tron112);
		
		Ligne ligneSix = new Ligne("LigneSix");		
		ligneSix.ajoutTroncon(tron49);
		ligneSix.ajoutTroncon(tron50);
		ligneSix.ajoutTroncon(tron51);
		ligneSix.ajoutTroncon(tron52);
		ligneSix.ajoutTroncon(tron53);
		ligneSix.ajoutTroncon(tron54);
		ligneSix.ajoutTroncon(tron55);
		ligneSix.ajoutTroncon(tron56);
		ligneSix.ajoutTroncon(tron57);
		
		Ligne ligneSixBis = new Ligne("LigneSixBis");
		ligneSixBis.ajoutTroncon(tron113);
		ligneSixBis.ajoutTroncon(tron114);
		ligneSixBis.ajoutTroncon(tron115);
		ligneSixBis.ajoutTroncon(tron116);
		ligneSixBis.ajoutTroncon(tron117);
		ligneSixBis.ajoutTroncon(tron118);
		ligneSixBis.ajoutTroncon(tron119);
		ligneSixBis.ajoutTroncon(tron120);
		ligneSixBis.ajoutTroncon(tron121);
		
		Ligne ligneSept = new Ligne("LigneSept");
		ligneSept.ajoutTroncon(tron58);
		ligneSept.ajoutTroncon(tron59);
		ligneSept.ajoutTroncon(tron60);
		ligneSept.ajoutTroncon(tron61);
		ligneSept.ajoutTroncon(tron62);
		ligneSept.ajoutTroncon(tron63);
		ligneSept.ajoutTroncon(tron64);
		
		Ligne ligneSeptBis = new Ligne("LigneSeptBis");
		ligneSeptBis.ajoutTroncon(tron122);
		ligneSeptBis.ajoutTroncon(tron123);
		ligneSeptBis.ajoutTroncon(tron124);
		ligneSeptBis.ajoutTroncon(tron125);
		ligneSeptBis.ajoutTroncon(tron126);
		ligneSeptBis.ajoutTroncon(tron127);
		ligneSeptBis.ajoutTroncon(tron128);
		
		ArrayList<Ligne> lignes = new ArrayList<Ligne>();
		lignes.add(ligneUn);
		lignes.add(ligneDeux);
		lignes.add(ligneTrois);
		lignes.add(ligneQuatre);
		lignes.add(ligneCinq);
		lignes.add(ligneSix);
		lignes.add(ligneSept);
		lignes.add(ligneUnBis);
		lignes.add(ligneDeuxBis);
		lignes.add(ligneTroisBis);
		lignes.add(ligneQuatreBis);
		lignes.add(ligneCinqBis);
		lignes.add(ligneSixBis);
		lignes.add(ligneSeptBis);
		
		ArrayList<Station> stations = new ArrayList<Station>();
		
		stations.add(unA);
		stations.add(unB);
		stations.add(unC);
		stations.add(unD);
		stations.add(unE);
		stations.add(unF);
		stations.add(unG);
		stations.add(unH);
		stations.add(unI);
		stations.add(unJ);
		stations.add(unK);
		
		stations.add(deuxA);
		stations.add(deuxB);
		stations.add(deuxC);
		stations.add(deuxD);
		stations.add(deuxE);
		stations.add(deuxF);
		stations.add(deuxG);
		stations.add(deuxH);
		stations.add(deuxI);
		stations.add(deuxJ);
		stations.add(deuxK);

		stations.add(troisA);
		stations.add(troisB);
		stations.add(troisC);
		stations.add(troisD);
		stations.add(troisE);
		stations.add(troisF);
		stations.add(troisG);
		stations.add(troisH);
		stations.add(troisI);
		stations.add(troisJ);
		stations.add(troisK);
		
		stations.add(quatreA);
		//listeStation[34]=quatreB;
		//listeStation[34]=unC;
		stations.add(quatreC);
		//listeStation[36]=quatreD;
		//listeStation[35]=deuxB;
		stations.add(quatreE);
		stations.add(quatreF);
		stations.add(quatreG);
		//listeStation[40]=quatreH;
		//listeStation[40]=troisC;
		stations.add(quatreI);
		stations.add(quatreJ);
	
		stations.add(cinqA);
		//listeStation[44]=cinqB;
		//listeStation[44]=unE;
		stations.add(cinqC);
		stations.add(cinqD);
		//listeStation[47]=cinqE;
		//listeStation[47]=deuxE;
		stations.add(cinqF);
		stations.add(cinqG);
		//listeStation[50]=cinqH;
		//listeStation[50]=troisE;
		stations.add(cinqI);
		stations.add(cinqJ);
		
		stations.add(sixA);
		stations.add(sixB);
		//listeStation[55]=sixC;
		//listeStation[55]=unG;
		stations.add(sixD);
		stations.add(sixE);
		//listeStation[58]=sixF;
		//listeStation[58]=deuxG;
		stations.add(sixG);
		//listeStation[60]=sixH;
		//listeStation[60]=troisG;
		stations.add(sixI);
		stations.add(sixJ);
		
		stations.add(septA);
		stations.add(septB);
		//listeStation[65]=septC;
		//listeStation[65]=unI;
		stations.add(septD);
		//listeStation[67]=septE;
		//listeStation[67]=deuxI;
		stations.add(septF);
		//listeStation[69]=septG;
		//listeStation[69]=troisI;
		stations.add(septH);

		ArrayList<Troncon> troncons = new ArrayList<Troncon>();
		for(Ligne ligne : lignes){
			troncons.addAll(ligne.getTroncon());
		}
		
//		Coordonnee a = ask();
//		for (Station e : laPlusProche(stations.toArray(new Station[1]),a)) {
//			System.out.println(e.getNom());
//		}
		
		Graph graph = new Graph(lignes, troncons);
		DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(graph);
		
		System.out.println("temps");
		dijkstraAlgorithm.execute(unA);
		LinkedList<Station> path = dijkstraAlgorithm.getPath(cinqD);
		for(Station station : path){
			System.out.println(station.getNom());
		}
		
		List<Station> stationsParcours = new LinkedList<Station>();
		stationsParcours.add(unC);
		stationsParcours.add(quatreE);
		stationsParcours.add(cinqG);
		stationsParcours.add(troisD);
		
		
		System.out.println("PLUS +++");
		path = dijkstraAlgorithm.getPath(stationsParcours);
		for(Station station : path){
			System.out.println(station.getNom());
		}
		
	}
}


