package ascenseur;

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
			bloquerPorte = false;
			return true;
		}
		else {
			bloquerPorte = false;
			return false;
		}
			
		}
	
	// Ouvrir la porte 
	
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
	
	// Fermer la porte
	
	public boolean fermer() {
		if ( bloquerPorte == false && estOuverte == true) {
			this.estOuverte = false;
			return true;
		}
		else {
			return false;
		}
		}
	
	
	// Position de l'ascenseur
	
	 public int getEtage() {
		 	return numeroEtage;
	}
	
	 // Changer d'étage
	 
	public void allerEtage() {
		if ( this.etageDestination >= numeroEtageMin && this.etageDestination <= numeroEtageMax && this.estOuverte == false ) {
			this.numeroEtage = this.etageDestination;
				while (this.etageDestination != this.numeroEtage) {
					if (this.etageDestination < this.numeroEtage) {
						this.etageDestination++;
					}
					else {
						this.etageDestination--;
					}
				}
		} else {
			System.out.println( " Etage Error ");
					}
	}
		
		@Override
		
		public String toString() {
			return " Marque : " + this.marque + "\r\n" 
								+ " Nombre etage maximum " +  this.numeroEtageMax + "\r\n " + " Nombre etage minimum " + this.numeroEtageMin + "\r\n" 
								+ " Statut etage " + this.numeroEtage + "\r\n "
								+ " Destination " + this.etageDestination + "\r\n"
								+ " Ouverture porte " + this.estOuverte + "\r\n"
								+ " Porte bloquee " + this.bloquerPorte + "\r\n";
		
		
					}
			
		}
	

	
	 
	 
	 