public class Client {
	// Attributes
	private String name;
	private int telephoneNumber;
	private String emailAddress;
	private String physicalAddress;

	public String displayClient() {
		String details = "Client name: " + name;
		details += "\nClient number: " + telephoneNumber;
		details += "\nClient email address: " + emailAddress;
		details += "\nClient's Physical Address: " + physicalAddress;

		return details;
	}

	// Getters

	public String getName() {
		return name;
	}

	public int getTelephoneNumber() {
		return telephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	// Setters

	public void setName(String name) {
		this.name = name;
	}

	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	// Constructor
	public Client(String name, int telephoneNumber, String emailAddress, String physicalAddress) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}

}
