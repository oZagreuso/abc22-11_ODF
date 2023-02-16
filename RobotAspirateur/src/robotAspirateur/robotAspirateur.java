package robotAspirateur;

import java.util.Scanner;

public class robotAspirateur {
	
	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	public enum enumRobotAspirateur {
		
		allerAgauche, allerAdroite, allerDevant, retourBase, deposerPoussiere;
		
	}

	// Attributs
	
	private String lettres = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";	
	private char uneLettre;
	private String nomRobot;
	
	private String maximumX;
	private int maximumXNb;
	private int minimumXNB = 0;
	
	private int maximumY;
	private int minimum = 1;
	
	private String positionX;
	private int positionXNb;
	private int positionY;
	
	private Boolean isOn;
	private Boolean scanAlarm;
	
	
	// Constructeurs
	
	// RobotAspirateur par défaut
	
	public robotAspirateur() {
		this.nomRobot = " Robot Pedro ";
		this.isOn = true;
		this.maximumX = " E ";
		this.maximumY = 5 ;
		this.positionX = " A ";
		this.positionY = 1;
		this.scanAlarm = false;
	}
	
	// Robot à construire
	
	public robotAspirateur(String _nomRobot, boolean _isOn, String _maximumX, int _maximumY, String _positionX, int _positionY, boolean _scanAlarm) {
		this.nomRobot = _nomRobot;
		this.isOn = _isOn;
		this.maximumX = _maximumX;
		this.maximumY = _maximumY;
		this.positionX = _positionX;
		this.positionY = _positionY;
		this.scanAlarm = _scanAlarm;
	}
		
	// Régler valeurs
		
	public void setPositionX(String _positionX) { // réglage placement horizontal
		this.positionX = _positionX;
	}
	
	public void setPositionY(int _positionY) { // réglage placement vertical
		this.positionY = _positionY;
	}
	
	// retourner des valeurs
	
	// Correspondance entre lettre et nombre pour l'axe horizontal
	
	public int correspondanceLettrePositionX() {
		
		for (int i = 0; i < this.lettres.length(); i++) {
			if (this.positionX.equals(lettres)) {
				this.positionXNb = i;
			
			}
			}
		return this.positionXNb;
		}
	
	public int correspondanceLettresMaximumX() {
		
		for (int i = 0; i < this.lettres.length(); i++) {
			if (this.maximumX.equals(lettres)) {
				this.maximumXNb = i;
			}
		}
		return this.maximumXNb;
	}
	// Correspondance entre nombres et lettres pour l'axe horizontal
	
	public void correspondanceNombresPositionX() {
		this.uneLettre = this.lettres.charAt(this.positionXNb);
	}
	// Fonctions
	
	public boolean allumer() {
		if (this.isOn == true) {
			this.isOn = false;
			return false;
		}
			else {
				return true;
			}
		}
	public boolean stopObstacle() {
		if (this.scanAlarm == true) {
			this.scanAlarm = false && this.turnRight = true;
			
		}
	}
	
}

	

	
	
	
	
	
