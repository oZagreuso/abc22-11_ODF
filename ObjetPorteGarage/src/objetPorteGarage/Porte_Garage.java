package objetPorteGarage;

import java.util.Scanner;

public class Porte_Garage {

	// Déclaration d'un scanner

	Scanner sc = new Scanner(System.in);

	// Déclaration des attributs

	private boolean estOuverte;
	private boolean isLock;
	private String nom;

	// Constructeur par défaut

	public Porte_Garage() {

		estOuverte = true;
		isLock = false;
		nom = "";
	}

	// Constructeur classique

	public Porte_Garage(boolean _isLock, boolean _estOuverte, String _nom) {

		this.isLock = _isLock;
		this.estOuverte = _estOuverte;
		this.nom = _nom;
	}

	// Les méthodes

	//

	public boolean lock() {
		if (estOuverte == true) {
			return true;
			isLock = false;
		} else 
		{
			return false;
			isLock = true;
		}
	}

	// Ouvrir la porte du garage

	public boolean ouvrir() {
		if (estOuverte == true) // la porte du garage est déjà ouverte
		{
			System.out.println(" impossible d'ouvrir la porte ");
			return false;
		} else {
			estOuverte = true;
			System.out.println(" j'ouvre la porte du grarage ");
			return true;
		}
	}

	// Fermer la porte du garage

	public boolean fermer() {
		if (estOuverte == true) {
			estOuverte = false;
			System.out.println(" ouvre porte du garage ");
			return true;
		} else {
			System.out.println(" impossible de fermer la porte du garage ");
			return false;
		}
	}

	// Nommer la Porte

	public String nomPorte_Garage() {
		return this.nom; // le nom de la porte de garage est "
	}

}
