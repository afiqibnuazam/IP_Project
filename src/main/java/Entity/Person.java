package Entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String fname;
	private String lname;
	private int dob;
	private String address;
	private int phoneNum;
	private String username;
	private String password;
	
	//constructor
	public Person() {
	}

	public Person(String fname, String lname, int dob, String address, int phoneNum, String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.address = address;
		this.phoneNum = phoneNum;
		this.username = username;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
