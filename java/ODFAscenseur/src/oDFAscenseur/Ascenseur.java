package oDFAscenseur;

import java.util.Scanner;

public class Ascenseur {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	// Déclaration des attributs
	
	private String marque;
	private Boolean estOuverte;
	private Boolean bloquerPorte;
	private Boolean upStairs;
	private final int numeroEtageMax;
	private final int numeroEtageMin;
	private int numeroEtage;
	private int etageSelected;
	
	// Constructeur par défaut
	
	public Ascenseur() {
		this.marque = " ";
		this.estOuverte = false;
		this.bloquerPorte = false;	
		this.upStairs = true;
		this.numeroEtageMax = 3;
		this.numeroEtageMin = 0;
		this.numeroEtage = 2;
		this.etageSelected = 3;
	}
	
	// Constructeur classique
	
	public Ascenseur( String _marque, boolean _estOuverte, boolean _bloquerPorte, final int _numeroEtageMax, int _numeroEtageMin, int _numeroEtage, int _etageSelected, boolean _upStairs) {
		this.marque = _marque;
		this.estOuverte = _estOuverte;
		this.bloquerPorte = _bloquerPorte;
		this.upStairs = _upStairs;
		this.numeroEtageMax = _numeroEtageMax;
		this.numeroEtageMin = _numeroEtageMin;
		this.numeroEtage = _numeroEtage;
		this.etageSelected = _etageSelected;
	}
	
	// Les fonctions
	
	// Possibilité de bloquer la porte
	
	public boolean bloquer() {
		if (bloquerPorte == true) {
			bloquerPorte = true;
			return true;
		}
		else {
			bloquerPorte = false;
			return false;
		}
			
		}
	
	// Postion porte ouverte ou fermée
	
	public boolean ouvrir() {
		if ( bloquerPorte == false && estOuverte == false) {
			this.estOuverte = true;
			System.out.println( " ouverture possible ");
			return true;
	}
		else {
			this.estOuverte = false;
			System.out.println( " la porte est déjà ouverte ");
			return false;
	}
	}
	
	// Position de l'ascenseur
	
	 public int getEtage() {
		 	return numeroEtage;
	}
	
	 // Monter (numéro étagemax - numéro étage + numéro étage choisi)
	 
	 public boolean monter() {
		 if ( numeroEtage >= numeroEtageMin && numeroEtage <= numeroEtageMax) {
			 System.out.println( " l'ascenseur peut monter ");
			 upStairs = true;
			 return true;
		 }
		 else {
			 upStairs = false;
			 System.out.println( " l'ascenseur ne peut pas monter");
			 return false;
		 }
		 
	 }
	 
	 
	 //(numéro étagemax - numéro étage + numéro étage choisi)
	 
}
	
	

