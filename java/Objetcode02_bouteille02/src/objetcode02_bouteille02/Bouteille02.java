package objetcode02_bouteille02;

public class Bouteille02 {
	
	// Déclaration des attributs
	
	private final double capaciteEnL;
	private double contenanceEnL;
	private double quantiteEnL;
	private boolean estOuverte;
	private String nom; 
	
	// Les méthodes
	
		// Ouvrir la bouteille
		
		public boolean ouvrir ()
		{
			if ( setEstOuverte(true) )
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	
		// Fermer la bouteille
		
		public boolean fermer ()
		{
			if ( setEstOuverte(true) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		// Remplir toute la bouteille
		
		 public boolean remplirTout ()
		{
			if (contenanceEnL < capaciteEnL)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		 
		 // Remplir la bouteille
		 
		 public boolean remplir ()
		 {
			 if (quantiteEnL + contenanceEnL < capaciteEnL)
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
		// Vider toute la bouteille
			
		public boolean viderTout ()
		{
			if (contenanceEnL > 0 )
			{ 
				return true;
			}
			else
			{
				return false;
			}
		}
		
		// Vider la bouteille
		
		public boolean vider ()
		{
			if (quantiteEnL + contenanceEnL > 0 )
			{
				return true;
			}
			else
			{
				return false;
		    }
		}
		// Nommer la Bouteille
		
		public String nomBouteille()
		{
			return this.nom;		
		}
		
		// Override
		
		@Override
		public String toString()
		{
			return " capaciteEnL = " + capaciteEnL  
				   + " contenanceEnL = " + contenanceEnL 
				   + " estOuverte = " + estOuverte 
				   + " nom = " + nom;
				  
		}
		
		
		// Constructeur par défaut
		
		public Bouteille02 ()
		{
			capaciteEnL = 1;
			contenanceEnL = 0;
			setEstOuverte(false);
			nom = " " ;
		}
		
		// constructeur classique
		
		public Bouteille02(double _capaciteEnL , double _contenanceEnL , boolean _estOuverte , String _nom)
		{
			this.capaciteEnL = _capaciteEnL;
			this.contenanceEnL = _contenanceEnL;
			this.setEstOuverte(_estOuverte);
			this.nom = _nom;
		}

		public boolean isEstOuverte() {
			return estOuverte;
		}

		public boolean setEstOuverte(boolean estOuverte) {
			this.estOuverte = estOuverte;
			return estOuverte;
		}
		
		 
	 }
		 	 
