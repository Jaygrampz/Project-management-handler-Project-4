public class Person {
	// Attributes
	private String name;
	private int telephoneNumber;
	private String emailAddress;
	private String physicalAddress;

	// Methods
	public String displayPerson() {
		String details = "Contractor name: " + getName();
		details += "\nTelephone number: " + getTelephoneNumber();
		details += "\nEmail address: " + getEmailAddress();
		details += "\nPhysical Address: " + getPhysicalAddress();

		return details;
	}
	
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
	public Person(String name, int telephoneNumber, String emailAddress, String physicalAddress) {
		this.setName(name);
		this.setTelephoneNumber(telephoneNumber);
		this.setEmailAddress(emailAddress);
		this.setPhysicalAddress(physicalAddress);
	}

}
