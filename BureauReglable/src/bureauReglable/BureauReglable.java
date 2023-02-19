package bureauReglable;

import java.util.Scanner;

public class BureauReglable {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	//Attributs
	
	private String modelBureau; 
	private Boolean powerOn;
	private Boolean boutonMonter;
	private int positionBureauEnCm;
	private final int hauteurMaxEnCm;
	private final int hauteurMinEnCm; 


	// Fonctions
	
	// Constructeur par défaut

	public BureauReglable() {
			modelBureau = " ";
			powerOn = false;
			boutonMonter = false;
			positionBureauEnCm = 75;
			hauteurMaxEnCm = 150;
			hauteurMinEnCm = 50;
	}
	// Constructeur classique

	public BureauReglable(String _modelBureau, boolean _powerOn, boolean _boutonMonter, int _positionBureauEnCm, int _hauteurMaxEnCm, int _hauteurMinEnCm) {
			this.modelBureau = _modelBureau;
			this.powerOn = _powerOn;
			this.boutonMonter = _boutonMonter;
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
				System.out.printl(" le robot peut être connecté au secteur ");
				return true;
			}
			else {
				// Le bureau est déjà branché
				System.out.println(" le robot est déjà sous tension ");
				return false;
			}
		}
			// débrancher le bureau
			
		public boolean débrancher() {
			
			if (powerOn == true) {
				powerOn = false; 
				return false;
			}
			else {
				return true;
			}
			}
		}
			
	
	

