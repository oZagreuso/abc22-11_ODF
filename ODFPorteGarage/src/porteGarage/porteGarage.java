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
		
		// Ouvrir
		
		public boolean ouvrir(int degreOuvertureAjoute) {
			if (!this.verrouille && degreOuvertureAjoute > 0 && this.degreOuverture + degreOuvertureAjoute <= this.DEGREMAX) {
				this.degreOuverture += degreOuvertureAjoute; 
				return true;
			} else {
				return false;
			}
		}
			
		// Fermer
		
		public boolean fermer(int degreOuvertureRetire) {
			if (
					!this.verrouille && degreOuvertureRetire > 0 && this.degreOuverture - degreOuvertureRetire >= this.DEGREMIN) {
						this.degreOuverture -= degreOuvertureRetire;
							return true;
			}
			else {
							return false;
				}
		}

			
		@Override
			
			public String toString() {
				return  " Porte Garage " + this.NOM + " degre d'ouverture " + this.degreOuverture + " degre maximum " + this.DEGREMAX 
						+ " degre minimum " + this.DEGREMIN + " lock " + this.verrouille;
			}
			
		}
		
	
	
	
	


