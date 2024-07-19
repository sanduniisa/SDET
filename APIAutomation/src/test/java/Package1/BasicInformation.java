package Package1;

public class BasicInformation {
	
	private String firstName;
	private String LastName;
	private String ID;
	private String Designation;
	private AddressInformation[] address;
	
	
	
	public AddressInformation[] getAddress() {
		return address;
	}
	public void setAddress(AddressInformation[] address) {
		this.address = address;
	}
	
	
	
//	public AddressInformation getAddress() {
//		return address;
//	}
//	public void setAddress(AddressInformation address) {
//		this.address = address;
//	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}

}
