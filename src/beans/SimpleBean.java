package beans;

public class SimpleBean {

	private String fName;
	private String lName;
	private String eMail;
	private String address;
	private String heardBy;
	private boolean classicalCb=false;
	private String contactMe;
	private boolean devotionalCb=false;
	private boolean metallicCb=false;
	private boolean rockCb=false;
	
	public SimpleBean() {
		fName="";
		lName="";
		eMail="";
		address="";
		heardBy="";
		contactMe="";
	}
	
	public String getHeardBy() {
		return heardBy;
	}
	public void setHeardBy(String heardBy) {
		this.heardBy = heardBy;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public boolean isClassicalCb() {
		return classicalCb;
	}

	public void setClassicalCb(boolean classicalCb) {
		this.classicalCb = classicalCb;
	}

	public String getContactMe() {
		return contactMe;
	}

	public void setContactMe(String contactMe) {
		this.contactMe = contactMe;
	}

	public boolean isDevotionalCb() {
		return devotionalCb;
	}

	public void setDevotionalCb(boolean devotionalCb) {
		this.devotionalCb = devotionalCb;
	}

	public boolean isMetallicCb() {
		return metallicCb;
	}

	public void setMetallicCb(boolean metallicCb) {
		this.metallicCb = metallicCb;
	}

	public boolean isRockCb() {
		return rockCb;
	}

	public void setRockCb(boolean rockCb) {
		this.rockCb = rockCb;
	}
	
}
