package bureauReglable;

import java.util.Scanner;

public class BureauReglable {

	// Déclaration d'un Scanner
	
	Scanner sc = new Scanner(System.in);
	
	//Attributs
	
	private string modelBureau; 
	private Boolean boutonMonter;
	private final int hauteurMaxEnCm;
	private final int hauteurMinEnCm; 

	// Fonctions
	
	// Constructeur par défaut

	public BureauReglable() {
			modelBureau = " ";
			boutonMonter = false;
			hauteurMaxEnCm = 150;
			boutonMinEnCm = 50;
			
	// Constructeur classique

	public BureauReglable(String _modelBureau, boolean _boutonMonter, final int hauteurMaxEnCm, final int hauteurMinEnCm) {
				this.modelBureau = _modelBureau;
				this.boutonMonter = _boutonMonter;
				this.hauteurMaxEnCm = _hauteurMaxEnCm;
				this.hauteurMinEnCm = _heuteurMinEnCm;
			
}
