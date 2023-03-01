package robotAspirateur;

import java.util.Scanner;

public class robotAspirateur {
	
	// déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	private String marqueRobot;
	private Boolean estOn;
	private Boolean deplacementOk;
	private Boolean detectAlarm;
	private Boolean retourBase;
	
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
		// alarme détecteur On/Off
	
	public boolean statutAlarm()
	{
		if(this.detectAlarm == false)
		{
			this.detectAlarm = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
		// check déplacement ok
	
	private boolean deplacement()
	{
		if (this.estOn)
		{
			if (this.detectAlarm)
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
		if(this.deplacementOk)
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
	
}

	


	

	
	
	
	
	

