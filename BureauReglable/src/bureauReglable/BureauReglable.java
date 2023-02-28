package bureauReglable;

import java.util.Scanner;

public class BureauReglable {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	//Attributs
	
	private String modelBureau; 
	private Boolean powerOn;
	private Boolean boutonMonter;
	private Boolean boutonDescendre;
	private int positionBureauEnCm;
	private final int hauteurMaxEnCm;
	private final int hauteurMinEnCm; 


	// Fonctions
	
	// Constructeur par défaut

	public BureauReglable() {
			modelBureau = " ";
			powerOn = false;
			boutonMonter = false;
			boutonDescendre = true;
			positionBureauEnCm = 75;
			hauteurMaxEnCm = 150;
			hauteurMinEnCm = 50;
	}
	// Constructeur classique

	public BureauReglable(String _modelBureau, boolean _powerOn, boolean _boutonMonter, boolean _boutonDescendre, int _positionBureauEnCm, int _hauteurMaxEnCm, int _hauteurMinEnCm) {
			this.modelBureau = _modelBureau;
			this.powerOn = _powerOn;
			this.boutonMonter = _boutonMonter;
			this.boutonDescendre = _boutonDescendre;
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
				System.out.println(" le bureau peut etre connecte au secteur ");
				return true;
			}
			else {
			// Le bureau est déjà branché
				System.out.println(" le bureau est deja sous tension ");
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
			
			// possibilité de monter
		
		public boolean monterOk() {
			if (boutonMonter == false) {
				boutonMonter = true;
				return true;
			}
			else {
				return false;
			}
		}
	
		
			// faire monter le bureau
		
		public void monter() {
			if (this.powerOn == true && this.positionBureauEnCm <= this.hauteurMaxEnCm && this.positionBureauEnCm >= this.hauteurMinEnCm) {
				
					while (this.boutonMonter == true) {
						this.positionBureauEnCm++;
					}
			}
			else {
				System.out.println( " impossible de faire monter le bureau ");
			}
			}
			
			// faire descendre le bureau
		
		public void descendre() {
			if (this.powerOn == true && this.positionBureauEnCm <= this.hauteurMaxEnCm && this.positionBureauEnCm >= this.hauteurMinEnCm ) {
				
				while (this.boutonDescendre == true) {
					this.positionBureauEnCm--;
				}
			}
		}
		
		}

			
	
	


