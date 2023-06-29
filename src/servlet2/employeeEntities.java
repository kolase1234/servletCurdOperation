 package servlet2;

public class employeeEntities {
	private int id;
	private int fname;
	private int lname;
	private int mobile;
	private int username;
	private int password;
	
   public employeeEntities() {
   }
     public employeeEntities(int id, int fname, int lname, int mobile, int username, int password) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.mobile = mobile;
	this.username = username;
	this.password = password;

}

 public employeeEntities(int id, String fname2, String lname2, String mobile2, String username2, String password2) {
}

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFname() {
		return fname;
	}

	public void setFname(int string) {
		this.fname = string;
	}

	public int getLname() {
		return lname;
	}

     public void setLname(int lname) {
	  this.lname = lname;
	}

     public int getMobile() {
		return mobile;
}

	  public void setMobile(int mobile) {
	 this.mobile = mobile;
}

   public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
}

	public int getPassword() {
	return password;
}
   public void setPassword(int password) {
	this.password = password;
}

	


		
		
	}
	
	
	

