package bureauReglable;

import java.util.Scanner;

public class BureauReglable {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	//Attributs
	
	private String modelBureau; 
	private Boolean powerOn;
	private Boolean boutonMonter;
	private int destinationPosition;
	private int positionBureauEnCm;
	private final int hauteurMaxEnCm;
	private final int hauteurMinEnCm; 


	// Fonctions
	
	// Constructeur par défaut

	public BureauReglable() {
			modelBureau = " ";
			powerOn = false;
			boutonMonter = false;
			destinationPosition = 120;
			positionBureauEnCm = 75;
			hauteurMaxEnCm = 150;
			hauteurMinEnCm = 50;
	}
	// Constructeur classique

	public BureauReglable(String _modelBureau, boolean _powerOn, boolean _boutonMonter, int _destinationPosition, int _positionBureauEnCm, int _hauteurMaxEnCm, int _hauteurMinEnCm) {
			this.modelBureau = _modelBureau;
			this.powerOn = _powerOn;
			this.boutonMonter = _boutonMonter;
			this.destinationPosition = _destinationPosition;
			this.positionBureauEnCm = _positionBureauEnCm;
			this.hauteurMaxEnCm = _hauteurMaxEnCm;
			this.hauteurMinEnCm = _hauteurMinEnCm;
	}
			
	// Nommer le bureau

	public String bureauModel() {
			return this.modelBureau; 
	}
	
	// Les méthodes
			
			// brancher le bureau
			
		public boolean brancher() {
		
			if (powerOn == false) {
				powerOn = true; // On peut brancher le bureau
				System.out.println(" le robot peut etre connecte au secteur ");
				return true;
			}
			else {
			// Le bureau est déjà branché
				System.out.println(" le robot est deja sous tension ");
				return false;
			}
		}
			// débrancher le bureau
			
		public boolean debrancher() {
			
			if (powerOn == true) {
				powerOn = false; 
				return false;
			}
			else {
				return true;
			}
			}
		
		public void monter() {
			if (this.powerOn == true && this.positionBureauEnCm <= this.hauteurMaxEnCm && this.positionBureauEnCm >= this.hauteurMinEnCm) {
				this.positionBureauEnCm = this.destinationPosition;
					while (this.boutonMonter == true)
			}
						
		
		}
}
			
	
	


