package objet_bouteille;

import java.util.Scanner;

public class Bouteille {

	// Déclaration d'un scanner

	Scanner sc = new Scanner(System.in);

	// Déclaration des attributs

	private final double capaciteEnL;// volume total de la bouteil
	private double contenanceEnL;// volume de liquide déjà présent dans la bouteille
	private boolean estOuverte;// état de la bouteille si true alors la bouteille est ouverte
	private String nom;// appelation de la bouteille

	// Constructeur par défaut

	public Bouteille() {
		capaciteEnL = 1;
		contenanceEnL = 0.5;
		estOuverte = true;
		nom = " ";
	}

	// Constructeur classique

	public Bouteille(double _capaciteEnL, double _contenanceEnL, boolean _estOuverte, String _nom) {
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
		this.nom = _nom;
	}

	// Les méthodes

	// Ouvrir la bouteille

	public boolean ouvrir() {
		if (estOuverte == true) // la boutteille est déjà ouverte
		{
			System.out.println(" impossible d'ouvrir une bouteille deja ouverte ");
			return false; // donc comme elle est ouverte on ne peut pas l'ouvrir
		} else // Sinon la bouteille est fermée
		{
			estOuverte = true;
			System.out.println(" j'ouvre la bouteille ");
			return true; // donc comme elle est fermée on peut l'ouvrir
		}
	}

	// Fermer la bouteille

	public boolean fermer() {
		if (estOuverte == true) // la bouteille est ouverte
		{
			estOuverte = false;
			System.out.println(" je ferme la bouteille ");
			return true; // donc comme elle est ouverte on peut la fermer
		} else // Sinon la bouteille est fermée
		{
			System.out.println(" impossible de fermer une bouteille fermee ");
			return false; // donc comme elle est fermée on ne peut pas la fermer
		}
	}

	// Remplir toute la bouteille

	public boolean remplirTout() {
		if (estOuverte == true) {

			if (contenanceEnL < capaciteEnL) {
				System.out.println(" la bouteille est remplie a son maximum ");
				//remplir 
				contenanceEnL=capaciteEnL;
				return true; // je peux remplir la bouteille

			} else {
				System.out.println(" impossible de remplir la bouteille ");
				return false; // je ne peux pas remplir la bouteille

			}
		} else {
			return false;

		}
	}

	// Remplir la bouteille

	public boolean remplir(double quantiteEnL) {
		 
		if (estOuverte == true) {

			if (quantiteEnL + contenanceEnL < capaciteEnL) {

				System.out.println(" je remplis la bouteille ");
				contenanceEnL = contenanceEnL + quantiteEnL;
				
				return true; // je peux remplir la bouteille
			} else {
				System.out.println(" impossible de remplir la bouteille ");
				return false; // je ne peux pas remplir la bouteille
			}
		} else {
			return false;
		}
	}

	// Vider toute la bouteille

	public boolean viderTout() {
		if (estOuverte == true) {

			if (contenanceEnL > 0) {
				System.out.println(" je vide entièrement la bouteille ");
				contenanceEnL = 0L;
				return true; // je peux vider la bouteille
			} else {
				System.out.println(" impossible de vider une bouteille deja vide ");
				return false; // je ne peux pas remplir la bouteille
			}

		} else {
			return false;
		}
	}

	// Vider la bouteille

	public boolean vider(double quantiteEnL) {
		
		if (estOuverte == true) {

			if (quantiteEnL + contenanceEnL > 0) {
				System.out.println(" je vide la bouteille ");
				contenanceEnL = contenanceEnL - quantiteEnL;
				return true; // je peux vider la bouteille
			} else {
				System.out.println( " impossible de vider la bouteille ");
				return false; // je ne peux pas vider la bouteille
			}
		} else {
			return false;
		}
	}
	// Nommer la Bouteille

	public String nomBouteille() {
		return this.nom; // le nom de la bouteille est " "
	}

	// Override

	@Override
	public String toString() {
		return " capaciteEnL = " + capaciteEnL + " contenanceEnL = " + contenanceEnL + " estOuverte = " + estOuverte
				+ " nom = " + nom;

	}

	public boolean estOuverte() {
		return estOuverte;
	}

	public boolean estOuverte(boolean estOuverte) {
		this.estOuverte = estOuverte;
		return estOuverte;
	}

}
