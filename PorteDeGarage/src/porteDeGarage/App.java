package porteDeGarage;

public class App {

	public static void main(String[] args) {
		
		
		
		porteGarage abcd = new porteGarage(); // déclarer porte par défaut
		
		porteGarage crm = new porteGarage("CRM", 0, 90, 0, false); // Construire une porte
		
		//String printAbcd = abcd.toString(); // afficher état porte par défaut
		//String printCrm = crm.toString(); // afficher état porte construite
		//System.out.println(printAbcd);
		//System.out.println(printCrm);
		
		// test ouverture partielle	
		//Boolean ouvertPartielAbcd = abcd.partiellementOuverte();
		//Boolean ouvertPartielCrm = crm.partiellementOuverte() ; 
		
		// test verrouiller
		//Boolean verrou = crm.verrouiller();
		
		// test ouvrir (avec paramètre)
		
		
		Boolean aReussiAOuvrir = crm.ouvrir(45);
		System.out.println(aReussiAOuvrir); 
		System.out.println(crm);
		
		Boolean aReussiAOuvrir2 = crm.ouvrir(95);
		System.out.println(aReussiAOuvrir2);
		System.out.println(crm);
		
		Boolean aReussiAFermer = crm.fermer(45);
		System.out.println(aReussiAFermer);
		System.out.println(crm);
		
		Boolean aReussiAFermer2 = crm.fermer(25);
		System.out.println(aReussiAFermer);
		System.out.println(crm);
		
		int i =0;
	

}



	}


