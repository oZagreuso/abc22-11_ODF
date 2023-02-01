package objet_bouteille;

public class App {


public static void main(String[] args) {
		
	// Objet bouteille Evian 
	
	Bouteille evian = new Bouteille( 1.25, 1.10 , false ,"Evian" );
		
	System.out.println(evian.toString());
	
	// tester la possibilité d'ouvrir etd'evian
		
	boolean openok = evian.ouvrir();
	System.out.println(evian.toString());
	
	boolean openok2 = evian.ouvrir();
	System.out.println(evian.toString());
	
	// tester la possibilité de fermer la bouteille d'evian
	
	boolean closeok = evian.fermer();
	System.out.println(evian.toString());
	
	boolean closeok2 = evian.fermer();
	System.out.println(evian.toString());
	
	// tester la possibilité de remplir entièrement la bouteille
	
	boolean fill = evian.remplirTout();
	System.out.println(evian.toString());
	
	boolean fill2 = evian.remplirTout();
	System.out.println(evian.toString());
	
	// tester la possibilité de remplir la bouteille
	
	boolean refill = evian.remplir();
	System.out.println(evian.toString());
	
	boolean refill2 = evian.remplir();
	System.out.println(evian.toString());
	
	// tester la possibilité de vider toute la bouteille
	
	boolean emptyall = evian.viderTout();
	System.out.println(evian.toString());
	
	boolean emptyall2 = evian.viderTout();
	System.out.println(evian.toString());
	
	
	
	
	

	
	
	
	
	
}		
	
}
