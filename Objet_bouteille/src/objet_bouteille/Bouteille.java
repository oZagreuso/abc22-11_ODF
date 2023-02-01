package objet_bouteille;

public class Bouteille {
	
	
		
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
				if ( setEstOuverte(true) ) // la bouteille est déjà ouverte
				{
					return false; // donc comme elle est ouverte on ne peut pas l'ouvrir
				}
				else // Sinon la bouteille est déjà fermée 
				{
					return true; // donc comme elle est fermée on peut l'ouvrir
				}
			}
		
			// Fermer la bouteille
			
			public boolean fermer ()
			{
				if ( setEstOuverte(true) ) // la bouteille est ouverte
				{
					return true;  // donc comme elle est ouverte on peut la fermer
				}
				else // Sinon la bouteille est fermée
				{
					return false; // donc comme elle est fermée on ne peut pas la fermer
				}
			}
			
			// Remplir toute la bouteille
			
			 public boolean remplirTout ()
			{
				if (contenanceEnL < capaciteEnL) 
				{
					return true; // je peux remplir la bouteille
				}
				else
				{
					return false; // je ne peux pas remplir la bouteille
				}
			}
			 
			 // Remplir la bouteille
			 
			 public boolean remplir ()
			 {
				 if (quantiteEnL + contenanceEnL < capaciteEnL)
				 {
					 return true; // je peux remplir la bouteille
				 }
				 else
				 {
					 return false; // je ne peux pas remplir la bouteille
				 }
			 }
			// Vider toute la bouteille
				
			public boolean viderTout ()
			{
				if (contenanceEnL > 0 )
				{ 
					return true; // je peux vider la bouteille
				}
				else
				{
					return false; // je ne peux pas remplir la bouteille
				}
			}
			
			// Vider la bouteille
			
			public boolean vider ()
			{
				if (quantiteEnL + contenanceEnL > 0 )
				{
					return true; // je peux vider la bouteille
				}
				else
				{
					return false; // je ne peux pas vider la bouteille
			    }
			}
			// Nommer la Bouteille
			
			public String nomBouteille()
			{
				return this.nom; // le nom de la bouteille est " "	
			}
			
			// Override
			
			@Override
			public String toString()
			{
				return " capaciteEnL = " + capaciteEnL  
					   + " contenanceEnL = " + contenanceEnL 
					   + " estOuverte = " + estOuverte 
					   + " nom = " + nom ;
					  
			} 
			
			
			// Constructeur par défaut
			
			public Bouteille ()
			{
				capaciteEnL = 1;
				contenanceEnL = 0;
				setEstOuverte(false);
				nom = " " ;
			}
			
			// constructeur classique
			
			public Bouteille(double _capaciteEnL , double _contenanceEnL , boolean _estOuverte , String _nom)
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
			 	 



