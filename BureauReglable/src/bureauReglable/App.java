package bureauReglable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
		
BureauReglable lambda = new BureauReglable(); // Déclarer un bureau lambda
		
BureauReglable sophie = new BureauReglable(" sophie ", false, false, true, 75, 150, 50); // Construire un objet bureau du nom de Sophie
	

		String model = sophie.bureauModel();
		System.out.println(sophie.toString());
		
		boolean eteindre1 = sophie.debrancher();
		System.out.println(sophie.toString());
				
		
		boolean allumer1 = sophie.brancher();
		System.out.println(sophie.toString());
		
	
		sophie.descendre();
		
		sophie.monter();
		
	}
	
}

	


