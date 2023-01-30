package objetcode01;

public class Bouteille {

	// declaration des attributs
	
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	
	// Les méthodes
	
	public boolean ouvrir()
	{
		if (estOuverte = true)
		{
			return false;
		}
		else
		{	
			return true;									
		}
	}
	public boolean fermer()
	{
		if (estOuverte = false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean remplirTout()
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
	public boolean remplir (double quantiteEnL)
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
	public boolean vidertout()
	{
		if (contenanceEnL > 0)
		{	
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean vider (double quantiteEnL)
	{
		if ( quantiteEnL + contenanceEnL > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String DonneLeNom()
	{
			return this.nom;
	}
	
	// Constructeur par defaut
	
	public  Bouteille()
	{
		capaciteEnL = 1;
		contenanceEnL = 0;
		estOuverte = false;
		nom = " ";
	}
	
	// Constructeur classique
	
	public Bouteille(double _capaciteEnL, double _contenanceEnL, boolean _estOuverte, String _Nom)
	{
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
		this.nom = _Nom;
		
		
	}
}
