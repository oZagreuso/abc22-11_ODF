package objetPorteGarage;

import java.util.Scanner;

public class Porte_Garage {

	// Déclaration d'un scanner

	Scanner sc = new Scanner(System.in);

	// Déclaration des attributs

	private boolean isOpen;	
	private boolean isLock;
	private String nom;

	// Constructeur par défaut

	public Porte_Garage() {

		isOpen = false;
		isLock = false;
		nom = " ";
	}

	// Constructeur classique

	public Porte_Garage(boolean _isLock, boolean _isOpen, String _nom) {

		this.isLock = _isLock;
		this.isOpen = _isOpen;
		this.nom = _nom;

	}

	// Nommer la Porte

		public String nomPorte_Garage() {
			return this.nom; // le nom de la porte de garage est " ";
	
	// Les méthodes

	public boolean lock() {
		if (isOpen == true) {
			return true;
			isLock = false; // Si la porte est ouverte on ne peut pas la verouiller
		} 
		else {
			return false;
			isLock = true; // Si la porte est fermée on peut la verouiller
		}
	}

	// Ouvrir la porte du garage

	public boolean ouvrir() {
		if (isOpen == true) 
		{
			return false; // la porte du garage est déjà ouverte
		} else {
			isOpen = false;			
			return true; // on peut ouvrir la porte du garage
		}
	}

	// Fermer la porte du garage

	public boolean fermer() {
		if (isOpen == true) {
			isOpen = false;			
			return true;
		} else {
			isOpen = true;			
			return false;
		}
	}
	
	
	}

}
