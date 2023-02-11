package objet_bouteille;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Déclaration d'un scanner

		Scanner sc = new Scanner(System.in);

		// Objet bouteille Evian

		Bouteille evian = new Bouteille(1, 0.5, true, "Evian");

		System.out.println(" une bouteille d'evian ");
		System.out.println(evian.toString());

		// tester la possibilité d'ouvrir la bouteille

		boolean openok = evian.ouvrir();
		System.out.println(evian.toString());

		

		// tester la possibilité de fermer la bouteille d'evian

		boolean close = evian.fermer();
		System.out.println(evian.toString());

		boolean close2 = evian.fermer();
		System.out.println(evian.toString());
		
		boolean openok2 = evian.ouvrir();
		System.out.println(evian.toString());

		// tester la possibilité de remplir entièrement la bouteille

		boolean fill = evian.remplirTout();
		System.out.println(evian.toString());

		boolean fill2 = evian.remplirTout();
		System.out.println(evian.toString());

		// tester la possibilité de vider toute la bouteille

		boolean emptyall = evian.viderTout();
		System.out.println(evian.toString());

		boolean emptyall2 = evian.viderTout();
		System.out.println(evian.toString());

		// tester la possibilité de remplir la bouteille

		boolean refill = evian.remplir(0.5);
		System.out.println(evian.toString());

		boolean refill2 = evian.remplir(0.8);
		System.out.println(evian.toString());
		
		// tester la possibilité de vider une partie de la bouteille
		
		boolean empty = evian.vider(0.3);
		System.out.println(evian.toString());
		boolean empty2 = evian.vider(0);
		System.out.println(evian.toString());
	}

}
