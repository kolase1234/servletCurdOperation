package servlet2;

public class EmployeeData {

	private String firstName;
	private String LastName;
	private String Gender;
    private String MobileNo;

	private String Emailid;
	private String password;
	private String Address;
	public EmployeeData(String firstName, String lastName, String gender, String mobileNo, String emailid,
			String password, String address) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.Gender = gender;
		this.MobileNo = mobileNo;
		this.Emailid = emailid;
		this.password = password;
		this.Address = address;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	

}