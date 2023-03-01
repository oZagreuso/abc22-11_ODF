package robotAspirateur;

import java.util.Scanner;

public class robotAspirateur {
	
	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	private String marqueRobot;
	private Boolean estOn;
	private Boolean deplacementOk;
	private Boolean retourBase;
	
	// Enumération
	
	public enum Deplacement {
		AVANT,
		ARRIERE,
		GAUCHE,
		DROITE;
	}
	
	// Fonctions
	
		// Marque du robot
	
	public String getMarque()
	{
		return this.marqueRobot;
	}
	
		// Allumer le Robot
	
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
		// Eteindre le robot
	
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
	}
	


	

	
	
	
	
	

