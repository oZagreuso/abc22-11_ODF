package robotBar;

import java.util.Scanner;

public class RobotBar {
	
	// Déclaration d'un Scanner
	
		Scanner sc = new Scanner(System.in);
		
	// Déclaration des attributs
		
	private String nom;
	private Boolean robotOn;		
	private Boolean remplirVerre;
	private int positionRobot;
	private final int positionExtremeGauche;
	private final int positionExtremeDroite;
	private int destinationRobot;
	
	// Constructeur par défaut 
	
	public RobotBar() { 
		this.nom = " ";
		this.robotOn = false;		
		this.remplirVerre = false;
		this.positionRobot = 2;
		this.positionExtremeGauche = 0;
		this.positionExtremeDroite = 9;
		this.destinationRobot = 4;
	
	}
		
	// Constructeur classique
		
	public RobotBar( String _nom, boolean _robotOn, boolean _remplirVerre, int _positionRobot, final int _positionExtremeGauche, final int _positionExtremeDroite,
		int destinationRobot ) {
		
		this.nom = _nom;
		this.robotOn = _robotOn;
		this.remplirVerre = _remplirVerre;
		this.positionRobot = _positionRobot;
		this.positionExtremeGauche = _positionExtremeGauche; // position gauche du bar
		this.positionExtremeDroite = _positionExtremeDroite; // position droite du bar
		this.destinationRobot = _positionRobot;
						
	}
	
	// Les fonctions
	
	// Allumer robot

	public boolean allumer() {
		if ( this.robotOn == false) {
			robotOn = true;
			return true;
		}
		else {
			return false;
		}
		
	// Déplacement du robot
		
	
		
	}
	
	}
	


