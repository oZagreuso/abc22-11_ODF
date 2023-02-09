package porteGarage;

public class porteGarage {
	
	// Attributs
	
	private final String NOM;
	private int degreOuverture;
	private final int DEGREMAX;
	private final int DEGREMIN;
	private Boolean verrouille;
	
	// Constructeur par défaut
	
	public porteGarage () {
	
		this.NOM = " porte ";
		this.degreOuverture = 0;
		this.DEGREMAX = 90;
		this.DEGREMIN = 0;
		this.verrouille = false; }
	
	// Constructeur classique
	
	public porteGarage(String _nom, int _degreOuverture, int _degremax, int _degremin, boolean _verrouille) {
		
		this.NOM = _nom;
		this.degreOuverture = _degreOuverture;
		this.DEGREMAX = _degremax;
		this.DEGREMIN = _degremin;
		this.verrouille = _verrouille;
	}
	
	// Fonctions
		
		// Vérrouiller
		
		public boolean verrouille() {
			if (this.verrouille == false && this.degreOuverture == 0) {
				this.verrouille = true;
				return true;
			}
			else {
				return false;
			}
		}
		// Dévérouiller
			
		public boolean deverrouille() {
			if (this.verrouille == true && this.degreOuverture == 0) {
				this.verrouille = false;
				return true;
			}
			else {
				return false;
			}
		}
	}
			
				
		
	}
	
	
	


