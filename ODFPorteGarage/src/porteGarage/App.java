package porteGarage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		porteGarage Raph = new porteGarage("R", 0, 90, 0, false);
		
		boolean verrouilleok = Raph.verrouille();
		System.out.println(verrouilleok);
		System.out.println(Raph);
	}

}
