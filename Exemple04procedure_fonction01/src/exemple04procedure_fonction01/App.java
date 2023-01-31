package exemple04procedure_fonction01;

import java.util.Scanner;

public class App {

	// Procedure qui ne prend aucun argument
	public static void disBonjour ()
	{
		System.out.println(" Bonjour !!! ");
	}
	
	// Procedure qui prend en argument une chaine de charactère
	public static void disBonjourPrenom(String prenom)
	{
			System.out.println(" Bonjour " + prenom);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saisie;
		
			Scanner sc = new Scanner(System.in);
			System .out.println(" Veuillez saisir votre prenom : ");
			saisie = sc.nextLine();
			
			// appel de la procedure sans argument
			disBonjour();
			
			// appel de la procedure avec l'argument chaine de caractère
			disBonjourPrenom(saisie);
			
			sc.close();
	}

}
