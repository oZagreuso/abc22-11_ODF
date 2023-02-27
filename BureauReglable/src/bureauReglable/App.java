package bureauReglable;

public class App {

	public static void main(String[] args) {
	
		
BureauReglable lambda = new BureauReglable(); // Déclarer un bureau lambda
		
BureauReglable sophie = new BureauReglable(" sophie ", false, false, 75, 150, 50); // Construire un objet bureau du nom de Adeline

	

		String model = sophie.bureauModel();
		System.out.println(sophie.toString());
		
		boolean allumer1 = sophie.brancher();
		System.out.println(sophie.toString());
		
		boolean éteindre1 = sophie.debrancher();
		System.out.println(sophie.toString());
		
		
	}
	
}

	


