package robotAspirateur;

import java.util.Random;
import java.util.Scanner;

public class robotAspirateur {
	
	// déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	private String marqueRobot;
	private Boolean estOn;
	private Boolean deplacementOk;
	private Boolean detectAlarm;
	private int distance;
	
	
	
	// enumération
	
	public enum Deplacement {
		AVANT,
		ARRIERE,
		GAUCHE,
		DROITE;
	}
	
	// fonctions
	
		// Marque du robot
	
	public String getMarque()
	{
		return this.marqueRobot;
	}
	
		// allumer le Robot
	
	public boolean allumerRobot()
	{
		if(this.estOn == false)
		{
			this.estOn = true;
			return true;
		}
		else
		{
			return false;
		}
	}
		// eteindre le robot
	
	public boolean eteindreRobot()
	{
		if(this.estOn == true)
		{
			this.estOn = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Calcul de la distance (à utiliser pour le détecteur)
	
	public int calculerDistance()
	{
		Random rand = new Random();
		final int borneMin = 0;
		final int borneMax = 100;
		int distance = rand.nextInt(borneMax - borneMin +1) + borneMin;
		return distance;
	}
	
	
		// check déplacement ok
	
	private boolean deplacement()
	{
		if (this.estOn)
		{
			distance = this.calculerDistance();
			if (distance < 5)
			{
				this.deplacementOk = false;
				return false;
			}
			else
			{
				this.deplacementOk = true;
				return true;
			}
		
	}
		else 
	{			
		return false;
	}
}
	
		// déplacement robot
		
	public String robotMove(Deplacement move)
	{
		String str = "";
		this.deplacementOk = this.deplacement();
		if(this.deplacementOk = true  && this.estOn)
		{
			switch(move)
			{
				case AVANT:
				{
					str = " bot va tout droit ";
					break;
				}
				case ARRIERE:
				{
					str = " bot recule ";
					break;
				}
				case DROITE:
				{
					str = " bot va à droite ";
					break;
				}
				case GAUCHE:
				{
					str = " bot va a gauche ";
					break;
				}
				default:
				{
					break;
				}
			}
		}
		return str;
	}
		
		public robotAspirateur(String _marqueRobot, boolean _estOn, boolean _deplacementOk, boolean _detectAlarm)
		{
			this.marqueRobot = _marqueRobot;
			this.estOn = _estOn;
			this.deplacementOk = _deplacementOk;
			this.detectAlarm = _detectAlarm;
		}
		
	
	
}

	


	

	
	
	
	
	

