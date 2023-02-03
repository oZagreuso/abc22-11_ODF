package objetPorteGarage;

import java.util.Scanner;

import objet_bouteille.Bouteille;

public class App {

	// Déclaration d'un scanner
	
	Scanner sc = new Scanner(System.in);
	

	Porte_Garage standard = new Porte_Garage(4, 1.10, false, "Evian");

	System.out.println(" une bouteille d'evian ");
	System.out.println(evian.toString());
	
	boolean openok = evian.ouvrir();
	System.out.println(evian.toString());

	

	// tester la possibilité de fermer la bouteille d'evian

	boolean close = evian.fermer();
	System.out.println(evian.toString());

	boolean close2 = evian.fermer();
	System.out.println(evian.toString());
	
	boolean openok2 = evian.ouvrir();
	System.out.println(evian.toString());

	
}
