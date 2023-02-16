package robotBar;

import java.util.Scanner;

public class RobotBar {
	
	// Déclaration d'un Scanner
	
		Scanner sc = new Scanner(System.in);
		
	// Déclaration des attributs
		
	private String nom;
	private Boolean robotOn;		
	private Boolean verrePlein;
	private int positionRobot;
	private final int positionExtremeGauche;
	private final int positionExtremeDroite;
	private int destinationRobot;
	
	// Constructeur par défaut 
	
	public RobotBar() { 
		this.nom = " ";
		this.robotOn = false;		
		this.verrePlein = false;
		this.positionRobot = 2;
		this.positionExtremeGauche = 0;
		this.positionExtremeDroite = 9;
		this.destinationRobot = 4;
	
	}
		
	// Constructeur classique
		
	public RobotBar( String _nom, boolean _robotOn, boolean _verrePlein, int _positionRobot, final int _positionExtremeGauche, final int _positionExtremeDroite,
		int _destinationRobot ) {
		
		this.nom = _nom;
		this.robotOn = _robotOn;
		this.verrePlein = _verrePlein;
		this.positionRobot = _positionRobot;
		this.positionExtremeGauche = _positionExtremeGauche; // position gauche du bar
		this.positionExtremeDroite = _positionExtremeDroite; // position droite du bar
		this.destinationRobot = _destinationRobot;
						
	}
	
	// Les fonctions
	
	// Allumer robot

	public boolean allumer() {
		if ( this.robotOn == false) {
			robotOn = true;
			return true; // allumer le robot
		}
		else {
			return false; // le robot est déjà allumé
		}
	}
		
	// Déplacement du robot
		
	public void deplacer() {
		if ( this.destinationRobot >= this.positionExtremeGauche && this.destinationRobot <= this.positionExtremeDroite && this.robotOn == true ) {
			this.positionRobot = this.destinationRobot;
				while (this.destinationRobot != this.positionRobot) {
					if (this.destinationRobot < this.positionRobot) {
						this.destinationRobot++; // déplacement du robot vers la droite
					}
					else {
						this.destinationRobot--; // déplacement du robot vers la gauche
					}
				}
		} else {
			System.out.println( " Erreur position "); // la position au bar désirée n'existe pas
		}
	}
		
		// Remplir verre
			
	public boolean remplir() {
			if (this.destinationRobot == this.positionRobot && this.verrePlein == false ) {
			this.verrePlein = true;
			return true; // " remplir verre "
		}
			else {
			return false; // " impossible de remplir verre "
		}
	}
		
	@Override
	
	public String toString() {
		return " Nom : " + this.nom + "\r\n"
						+ " Robot on " + this.robotOn + "\r\n"
						+ " Verre plein " + this.verrePlein + "\r\n"
						+ " Position Robot " + this.positionRobot + "\r\n"
						+ " Position bar max gauche " + this.positionExtremeGauche + "\r\n"
						+ " Position bar max droite " + this.positionExtremeDroite + "\r\n"
						+ " Destination robot " + this.destinationRobot + "\r\n";
						
	}			
	}
		
	
		
	
		
	

	
	


