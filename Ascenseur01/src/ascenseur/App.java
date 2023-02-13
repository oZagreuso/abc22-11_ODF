package ascenseur;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

	// Déclaration d'un scanner
	
	Scanner sc = new Scanner(System.in);
	

	// Objet Ascenseur
	
	Ascenseur basic = new Ascenseur();
	Ascenseur crm = new Ascenseur( " crm ", false, false, 4, 0, 2, 3);
	
	System.out.println( " Ascenseur CRM ");
	System.out.println(crm.toString());
	
	boolean lock = crm.bloquer();
	System.out.println(crm.toString());
	
	boolean openOk = crm.ouvrir();
	System.out.println(crm.toString());
	
	int etageStatus = crm.getEtage();
	System.out.println(crm.toString());
	
	boolean fermerOk = crm.fermer();
	System.out.println(crm.toString());
	
	crm.allerEtage();
	
}
}
