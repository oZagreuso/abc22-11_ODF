package bureauReglable;

public class App {

	public static void main(String[] args) {
	
		
BureauReglable lambda = new BureauReglable(); // Déclarer un bureau lambda
		
BureauReglable adeline = new BureauReglable(" Adeline ", false, false, 75, 150, 50); // Construire un objet bureau du nom de Adeline

		String model = adeline.BureauReglable();
		System.out.println(adeline.toString());
		
		boolean allumer1 = adeline.brancher();
		System.out.println(adeline.toString());
		
		
		
		

	}

}
