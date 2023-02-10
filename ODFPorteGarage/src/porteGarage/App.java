package porteGarage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		porteGarage Raph = new porteGarage(" porte R ", 0, 90, 0, false);
		
		boolean verrouilleOk = Raph.verrouille();
		System.out.println(verrouilleOk);
		System.out.println(Raph);
		
		boolean verouilleOk2 = Raph.verrouille();
		System.out.println(verouilleOk2);
		System.out.println(Raph);
		
		
		
		boolean deverrouilleOk = Raph.deverrouille();
		System.out.println(deverrouilleOk);
		System.out.println(Raph);
		
		boolean deverrouilleOk2 = Raph.deverrouille();
		System.out.println(deverrouilleOk2);
		System.out.println(Raph);
		
		
		
		boolean openOk = Raph.ouvrir(45);
		System.out.println(openOk);
		System.out.println(Raph);
		
		boolean openOk2 = Raph.ouvrir(60);
		System.out.println(openOk2);
		System.out.println(Raph);
		
		
		
		
		boolean fermerOk = Raph.fermer(60);
		System.out.println(fermerOk);
		System.out.println(Raph);
		
		boolean fermerOk2 = Raph.fermer(10);
		System.out.println(fermerOk2);
		System.out.println(Raph);
		
		
		
	}

}
