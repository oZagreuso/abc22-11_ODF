package objetPorteGarage;

public class GarageDoorB {

	// Déclaration des attributs

	private String name;
	private int doorStatus;
	private int minimumDegree;
	private int maximumDegree;
	private boolean isLock;
	

	// Constructeur par défaut

	public GarageDoorB() {
		name = " ";
		doorStatus = 25;
		minimumDegree = 0;
		maximumDegree = 90;
		
	}

	// Constructeur classique

	public GarageDoorB(String _name, int _minimumDegree, int _maximumDegree, int _doorStatus, boolean _isLock, boolean isOpen) {
		this.name = _name;
		this.doorStatus = _doorStatus;
		this.minimumDegree = _minimumDegree;
		this.maximumDegree = _maximumDegree;
		this.isLock = _isLock;

	}

	// Nommer la porte de garage

	public String nomGarageDoorB() {
		return this.name; // le nom de la porte de garage est " "
		
	// Les méthodes

		// Ouvrir la porte de Garage au maximum
		
		if (doorStatus == 90) {
			System.out.println( " I cannot open the door ");
		}
		}


	}

}
