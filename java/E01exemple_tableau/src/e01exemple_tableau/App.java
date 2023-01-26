package e01exemple_tableau;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration d'un tableau de chaine de caractère contenant 3 elements
		String[] tabPrenom = new String[3];
		
		// Stockage de valeur dans le tebleau tabPrenom
		tabPrenom[0] = " David "; // 1er élément
		tabPrenom[1] = " Paul "; // 2ème élément
		tabPrenom[2] = " Jean "; // 3ème élément
		
		// Affichage de l'élément à l'indice 1
		System.out.println(tabPrenom[1]); // affiche Paul
		
		// Affichage de tous les éléments du tableau
		for(int i = 0; i <=tabPrenom.length-1; i++)
		{
			System.out.println(tabPrenom[i] + " " + i );
			
			}
		}
	
}

	


