package objetPorteGarage;

public class GarageDoorB {

	// Déclaration des attributs

	private String name;
	private int doorPosition;
	private final int minimumDegree;
	private final int maximumDegree;
	private boolean isLock;
	private boolean isFullOpen;
	private boolean isFullCLose;
	private boolean isPartOpen;

	// Constructeur par défaut

	public GarageDoorB() {
		name = " ";
		doorPosition = 0;
		minimumDegree = 0;
		maximumDegree = 90;
		isLock = false;
		isFullOpen = false;
		isFullClose = true;
		isPartOpen = false;

	}

	// Constructeur classique

	public GarageDoorB(String _name, int _minimumDegree, int _maximumDegree, boolean _isLock, int _doorPosition,
			boolean _isFullOpen, boolean _isFullClose, boolean _isPartOpen) {
		this.name = _name;
		this.doorPosition = _doorPosition;
		this.minimumDegree = _minimumDegree;
		this.maximumDegree = _maximumDegree;
		this.isLock = _isLock;
		this.isFullOpen = _isFullOpen;
		this.isFullCLose = _isFullClose;
		this.isPartOpen = _isPartOpen;
	}

	// Nommer la porte de garage

	public String nomGarageDoorB() {
		return this.name; // le nom de la porte de garage est " "
	}
	// Les méthodes

	public void fullOpen() {
		
		
		if (doorPosition  == maximumDegree) {
			
			isFullOpen = true;
		}
		else {
			isFullOpen = false;
		}
		if (doorPosition == minimumDegree) {
			isFullCLose = true;
		}
		else {
			isFullCLose = false;
		}
		}
}
