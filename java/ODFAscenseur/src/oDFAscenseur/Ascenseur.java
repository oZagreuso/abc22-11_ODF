package oDFAscenseur;

import java.util.Scanner;

public class Ascenseur {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	// Déclaration des attributs
	
	private String marque;
	private Boolean estOuverte;
	private Boolean bloquerPorte;
	private final int numeroEtageMax;
	private final int numeroEtageMin;
	private int numeroEtage;
	private int etageDestination;
	
	// Constructeur par défaut
	
	public Ascenseur() {
		this.marque = " ";
		this.estOuverte = false;
		this.bloquerPorte = false;	
		this.numeroEtageMax = 4;
		this.numeroEtageMin = 0;
		this.numeroEtage = 2;
		this.etageDestination = 3;
	}
	
	// Constructeur classique
	
	public Ascenseur( String _marque, boolean _estOuverte, boolean _bloquerPorte, final int _numeroEtageMax, int _numeroEtageMin, int _numeroEtage, int _etageDestination) {
		this.marque = _marque;
		this.estOuverte = _estOuverte;
		this.bloquerPorte = _bloquerPorte;
		this.numeroEtageMax = _numeroEtageMax;
		this.numeroEtageMin = _numeroEtageMin;
		this.numeroEtage = _numeroEtage;
		this.etageDestination = _etageDestination;
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
	
	 // Changer d'étage
	 
	public void allerEtage() {
		if ( this.numeroEtage >= 0 && this.numeroEtage <= 4) {
			this.etageDestination = this.numeroEtage;
				while (this.numeroEtage != this.etageDestination) {
					if (this.numeroEtage < this.etageDestination) {
						this.numeroEtage++;
					}
					else {
						this.numeroEtage--;
					}
				}
		} else {
			System.out.println( " Etage Error ");
					}
					}
			
		}
	
	 
	 
	 

	
	

