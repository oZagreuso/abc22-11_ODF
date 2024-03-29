package porteDeGarage;

public class porteGarage {


		// attributs ------------------------------

		private final String MARQUE;
		private int degreOuverture;
		private final int DEGREMAX;
		private final int DEGREMIN;
		private Boolean verrouille;

		// Constructeurs ---------------------------------

		public porteGarage() { // constructeur par défaut
			this.MARQUE = "ABCD";
			this.degreOuverture = 0;
			this.DEGREMAX = 90;
			this.DEGREMIN = 0;
			this.verrouille = true;
		}

		public porteGarage(String _marque, int _degreOuverture, int _degreMax, int _degreMin, Boolean _verrouille) { // constructeur
																														// classique

			this.MARQUE = _marque;
			this.degreOuverture = _degreOuverture;
			this.DEGREMAX = _degreMax;
			this.DEGREMIN = _degreMin;
			this.verrouille = _verrouille;
		}

		// Les fonctions --------------------------------------

		// Partiellement ouverte

		public boolean partiellementOuverte() {
			if (this.degreOuverture > this.DEGREMIN && this.degreOuverture < this.DEGREMAX) {
				return true;
			} else {
				return false;
			}
		}

		// Verrouiller

		public boolean verrouiller() {
			if (this.degreOuverture == DEGREMIN && this.verrouille == false) {
				this.verrouille = true;
				return true;
			} else {
				return false;
			}
		}

		// Ouvrir

		public boolean ouvrir(int degreOuvertureAjoute) {
			if (
					!this.verrouille
					&& degreOuvertureAjoute > 0
					&& this.degreOuverture + degreOuvertureAjoute <= this.DEGREMAX
					) {
				this.degreOuverture += degreOuvertureAjoute; 
				return true;
			} else {
				return false;
			}
		}

		// Fermer
		
		public boolean fermer(int degreOuvertureRetire) {
			if (
					!this.verrouille
					&& this.degreOuverture - degreOuvertureRetire >= this.DEGREMIN) {
				this.degreOuverture -= degreOuvertureRetire;
				return true;
			}
				else {
					return false;
				}
		// Dévérouiller
			
		public boolean deverouiller() {
			if (this verouille == true)
		}
			
			
			
		}
		
		// to String ------------------------
		@Override

		public String toString() {

			return "Non Porte de Garage : " + this.MARQUE + "\r\n" + "degré ouverture : " + this.degreOuverture + "\r\n"
					+ "Degré maxi : " + this.DEGREMAX + "\r\n" + "Degré min : " + this.DEGREMIN + "\r\n" + "Vérouillée ? "
					+ this.verrouille;
		}
				
	}


