package objetPorteGarage;

import java.util.Scanner;

import objet_bouteille.Bouteille;

public class App {
	
	
	public static void main(String[] args) {

	// Déclaration d'un scanner
	
	Scanner sc = new Scanner(System.in);
	
	GarageDoorB doorS = new GarageDoorB("doorS", 45, 0, 90, false );

	boolean fullOpen1 = doorS.fullOpen();
	System.out.println(doorS.toString());
	
	boolean fullClose1 = doorS.fullClose();
	System.out.println(doorS.toString());
	
	boolean Lock1 = doorS.isLock();
	System.out.println(doorS.toString());
	
	boolean Open1 = doorS.OpenInBetween();
	System.out.println(doorS.toString());

}
}