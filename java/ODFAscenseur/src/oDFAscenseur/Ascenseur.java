package oDFAscenseur;

import java.util.Scanner;

public class Ascenseur {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	// Déclaration des attributs
	
	private String marque;
	private Boolean bloquerPorte;
	private final int nombreEtages;
	private int numeroEtage;
	
	// Constructeur par défaut
	
	public Ascenseur() {
		this.marque = " ";
		this.bloquerPorte = false;
		this.nombreEtages = 4;
		this.numeroEtage = 2;
		
		
	}
	
	
}
