package objetPorteGarage;

import java.util.Scanner;

public class Porte_Garage {

	// Déclaration d'un scanner

	Scanner sc = new Scanner(System.in);

	// Déclaration des attributs

	private boolean isOpen;
	private boolean isHalfOpen;
	private boolean isLock;
	private String nom;

	// Constructeur par défaut

	public Porte_Garage() {

		isOpen = false;
		isHalfOpen = true;
		isLock = false;
		nom = " ";
	}

	// Constructeur classique

	public Porte_Garage(boolean _isLock,boolean _isHalfOpen, boolean _isOpen, String _nom) {

		this.isLock = _isLock;
		this.isHalfOpen = _isHalfOpen;
		this.isOpen = _isOpen;
		this.nom = _nom;

	}

	// Les méthodes

	public boolean lock() {
		if (isOpen == true) {
			return true;
			isLock = false;
		} 
		else {
			return false;
			isLock = true;
		}
	}

	// Ouvrir la porte du garage

	public boolean ouvrir() {
		if (isOpen == true) // la porte du garage est déjà ouverte
		{
			System.out.println(" impossible d'ouvrir la porte ");
			return false;
		} else {
			isOpen = false;
			System.out.println(" j'ouvre la porte du grarage ");
			return true;
		}
	}

	// Fermer la porte du garage

	public boolean fermer() {
		if (isOpen == true) {
			isOpen = false;
			System.out.println(" ouverture porte du garage ");
			return true;
		} else {
			isOpen = true;
			System.out.println(" impossible de fermer la porte du garage ");
			return false;
		}
	}

	// Placer la porte du garage en mode entre ouverte
	
	
	
	// Nommer la Porte

	public String nomPorte_Garage() {
		return this.nom; // le nom de la porte de garage est " ";
	}

}
