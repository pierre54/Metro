import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class main {

	
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
		Station[] l = new Station[50];
		int i = 0; 
		for (int j = 0; j <station.length ; j++) {
			if  (Math.sqrt((Math.pow((station[j].getX()-c.getX()),2)+Math.pow(station[j].getY()-c.getY(),2))) <= 50) {
				l[i] = station[j];
				i++;
			}
		}
		return station;
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

		Troncon[] tronconLigneUn = new Troncon[10];
		tronconLigneUn[0]=tron1;
		tronconLigneUn[1]=tron2;
		tronconLigneUn[2]=tron2;
		tronconLigneUn[3]=tron3;
		tronconLigneUn[4]=tron4;
		tronconLigneUn[5]=tron5;
		tronconLigneUn[6]=tron6;
		tronconLigneUn[7]=tron7;
		tronconLigneUn[8]=tron8;
		tronconLigneUn[9]=tron9;
		
		Troncon[] tronconLigneDeux = new Troncon[10];
		tronconLigneDeux[0]=tron10;
		tronconLigneDeux[1]=tron11;
		tronconLigneDeux[2]=tron12;
		tronconLigneDeux[3]=tron13;
		tronconLigneDeux[4]=tron14;
		tronconLigneDeux[5]=tron15;
		tronconLigneDeux[6]=tron16;
		tronconLigneDeux[7]=tron17;
		tronconLigneDeux[8]=tron18;
		tronconLigneDeux[9]=tron19;

		Troncon[] tronconLigneTrois = new Troncon[10];
		tronconLigneTrois[0]=tron21;
		tronconLigneTrois[1]=tron22;
		tronconLigneTrois[2]=tron23;
		tronconLigneTrois[3]=tron24;
		tronconLigneTrois[4]=tron25;
		tronconLigneTrois[5]=tron26;
		tronconLigneTrois[6]=tron27;
		tronconLigneTrois[7]=tron28;
		tronconLigneTrois[8]=tron29;
		tronconLigneTrois[9]=tron30;

		Troncon[] tronconLigneQuatre = new Troncon[9];
		tronconLigneQuatre[0]=tron31;
		tronconLigneQuatre[1]=tron32;
		tronconLigneQuatre[2]=tron33;
		tronconLigneQuatre[3]=tron34;
		tronconLigneQuatre[4]=tron35;
		tronconLigneQuatre[5]=tron36;
		tronconLigneQuatre[6]=tron37;
		tronconLigneQuatre[7]=tron38;
		tronconLigneQuatre[8]=tron39;

		Troncon[] tronconLigneCinq = new Troncon[9];
		tronconLigneCinq[0]=tron40;
		tronconLigneCinq[1]=tron41;
		tronconLigneCinq[2]=tron42;
		tronconLigneCinq[3]=tron43;
		tronconLigneCinq[4]=tron44;
		tronconLigneCinq[5]=tron45;
		tronconLigneCinq[6]=tron46;
		tronconLigneCinq[7]=tron47;
		tronconLigneCinq[8]=tron48;

		Troncon[] tronconLigneSix = new Troncon[9];
		tronconLigneSix[0]=tron49;
		tronconLigneSix[0]=tron50;
		tronconLigneSix[0]=tron51;
		tronconLigneSix[0]=tron52;
		tronconLigneSix[0]=tron53;
		tronconLigneSix[0]=tron54;
		tronconLigneSix[0]=tron55;
		tronconLigneSix[0]=tron56;
		tronconLigneSix[0]=tron57;

		Troncon[] tronconLigneSept = new Troncon[7];
		tronconLigneSept[0]=tron58;
		tronconLigneSept[1]=tron58;
		tronconLigneSept[2]=tron58;
		tronconLigneSept[3]=tron58;
		tronconLigneSept[4]=tron58;
		tronconLigneSept[5]=tron58;
		tronconLigneSept[6]=tron58;

		Ligne ligneUn = new Ligne("LigneUn",tronconLigneUn);
		Ligne ligneDeux = new Ligne("LigneDeux",tronconLigneDeux);
		Ligne ligneTrois = new Ligne("LigneTrois",tronconLigneTrois);
		Ligne ligneQuatre = new Ligne("LigneQuatre",tronconLigneQuatre);
		Ligne ligneCinq = new Ligne("LigneCinq",tronconLigneCinq);
		Ligne ligneSix = new Ligne("LigneSix",tronconLigneSix);
		Ligne ligneSept = new Ligne("LigneSept",tronconLigneSept);
		
		Station[] listeStation = new Station[71];
		listeStation[0]=unA;
		listeStation[1]=unB;
		listeStation[2]=unC;
		listeStation[3]=unD;
		listeStation[4]=unE;
		listeStation[5]=unF;
		listeStation[6]=unG;
		listeStation[7]=unH;
		listeStation[8]=unI;
		listeStation[9]=unJ;
		listeStation[10]=unK;
		
		listeStation[11]=deuxA;
		listeStation[12]=deuxB;
		listeStation[13]=deuxC;
		listeStation[14]=deuxD;
		listeStation[15]=deuxE;
		listeStation[16]=deuxF;
		listeStation[17]=deuxG;
		listeStation[18]=deuxH;
		listeStation[19]=deuxI;
		listeStation[20]=deuxJ;
		listeStation[21]=deuxK;

		listeStation[22]=troisA;
		listeStation[23]=troisB;
		listeStation[24]=troisC;
		listeStation[25]=troisD;
		listeStation[26]=troisE;
		listeStation[27]=troisF;
		listeStation[28]=troisG;
		listeStation[29]=troisH;
		listeStation[30]=troisI;
		listeStation[31]=troisJ;
		listeStation[32]=troisK;
		
		listeStation[33]=quatreA;
		listeStation[34]=quatreB;
		listeStation[35]=quatreC;
		listeStation[36]=quatreD;
		listeStation[37]=quatreE;
		listeStation[38]=quatreF;
		listeStation[39]=quatreG;
		listeStation[40]=quatreH;
		listeStation[41]=quatreI;
		listeStation[42]=quatreJ;
	
		listeStation[43]=cinqA;
		listeStation[44]=cinqB;
		listeStation[45]=cinqC;
		listeStation[46]=cinqD;
		listeStation[47]=cinqE;
		listeStation[48]=cinqF;
		listeStation[49]=cinqG;
		listeStation[50]=cinqH;
		listeStation[51]=cinqI;
		listeStation[52]=cinqJ;
		
		listeStation[53]=sixA;
		listeStation[54]=sixB;
		listeStation[55]=sixC;
		listeStation[56]=sixD;
		listeStation[57]=sixE;
		listeStation[58]=sixF;
		listeStation[59]=sixG;
		listeStation[60]=sixH;
		listeStation[61]=sixI;
		listeStation[62]=sixJ;
		
		listeStation[63]=septA;
		listeStation[64]=septB;
		listeStation[65]=septC;
		listeStation[66]=septD;
		listeStation[67]=septE;
		listeStation[68]=septF;
		listeStation[69]=septG;
		listeStation[70]=septH;
		
		Coordonnee a = ask();
		laPlusProche(listeStation,a);
		//laPlusProche(listeStation);
		//for (Station e : laPlusProche(listeStation)) {
		//	System.out.println(e.getNom());
		//}
		
		
		}
		
	
}


