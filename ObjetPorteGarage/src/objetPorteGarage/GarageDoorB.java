package objetPorteGarage;

public class GarageDoorB {

	// Déclaration des attributs

	private String name;
	private int doorPosition;
	private final int minimumDegree;
	private final int maximumDegree;
	private boolean isLock;


	// Constructeur par défaut

	public GarageDoorB() {
		name = " ";
		doorPosition = 0;
		minimumDegree = 0;
		maximumDegree = 90;
		isLock = false;

	}

	// Constructeur classique

	public GarageDoorB(String _name, int _doorPosition, int _minimumDegree, int  _maximumDegree, boolean _isLock) {
		this.name = _name;
		this.doorPosition = _doorPosition;
		this.minimumDegree = _minimumDegree;
		this.maximumDegree = _maximumDegree;
		this.isLock = _isLock;
	}

	// Nommer la porte de garage

	public String nomGarageDoorB() {
		return this.name; // le nom de la porte de garage est " "
	}
	// Les méthodes

	public boolean fullOpen() {
		
		
		if (doorPosition  == maximumDegree) {
			
			return true;
		}
		else {
			return false;
		}
	}
	public boolean fullClose() {
		
		if (doorPosition == minimumDegree) {
			isLock = true;
			return true;
			
		}
		else {
			return false;
		}
		}
		
}


