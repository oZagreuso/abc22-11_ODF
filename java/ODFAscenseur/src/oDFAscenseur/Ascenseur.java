package oDFAscenseur;

import java.util.Scanner;

public class Ascenseur {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	// Déclaration des attributs
	
	private String marque;
	private Boolean estOuverte;
	private Boolean bloquerPorte;
	private final int nombreEtages;
	private int numeroEtage;
	
	// Constructeur par défaut
	
	public Ascenseur() {
		this.marque = " ";
		this.estOuverte = false;
		this.bloquerPorte = false;		
		this.nombreEtages = 4;
		this.numeroEtage = 2;
	}
	
	// Constructeur classique
	
	public Ascenseur( String _marque, boolean _estOuverte, boolean _bloquerPorte, final int _nombreEtages, int _numeroEtage) {
		this.marque = _marque;
		this.estOuverte = _estOuverte;
		this.bloquerPorte = _bloquerPorte;
		this.nombreEtages = _nombreEtages;
		this.numeroEtage = _numeroEtage;
	}
	
	// Les fonctions
	
	
	
	// Postion porte ouverte ou fermée
	
	public boolean ouvrir() {
	if ( bloquerPorte == false && estOuverte == false) {
		this.estOuverte = true;
		return true;
	}
	else {
		this.estOuverte = false;
		return false;
	}
	}
	
	
	
	}
	
	

