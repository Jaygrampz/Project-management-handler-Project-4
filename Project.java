public class Project {
	// Attributes
	private String projectName;
	private int projectNumber;
	private String buildingType;
	private String physicalAddress;
	private int erfNumber;
	private float projectFee;
	private float currBalance;
	private String projectDeadline;

	// Methods
	public String displayProj() {
		String details = "Project name: " + projectName;
		details += "\nProject number: " + projectNumber;
		details += "\nBuidling type: " + buildingType;
		details += "\nPhysical Address: " + physicalAddress;
		details += "\nerfNumber: " + erfNumber;
		details += "\nprojectFee: " + projectFee;
		details += "\nOutstanding balance: " + currBalance;
		details += "\nDeadline: " + projectDeadline;

		return details;
	}


	// Getters

	public String getProjectName() {
		return projectName;
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public int getErfNumber() {
		return erfNumber;
	}

	public float getProjectFee() {
		return projectFee;
	}

	public float getCurrBalance() {
		return currBalance;
	}

	public String getProjectDeadline() {
		return projectDeadline;
	}

	// Setters

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public void setErfNumber(int erfNumber) {
		this.erfNumber = erfNumber;
	}

	public void setProjectFee(float projectFee) {
		this.projectFee = projectFee;
	}

	public void setCurrBalance(float currBalance) {
		this.currBalance = currBalance;
	}

	public void setProjectDeadline(String projectDeadline) {
		this.projectDeadline = projectDeadline;
	}


	// Constructor
	public Project(String projectName, int projectNumber, String buildingType, String physicalAddress, int erfNumber,
			float projectFee, float currBalance, String projectDeadline) {
		this.projectName = projectName;
		this.projectNumber = projectNumber;
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.erfNumber = erfNumber;
		this.projectFee = projectFee;
		this.currBalance = currBalance;
		this.projectDeadline = projectDeadline;
	}
	

}
