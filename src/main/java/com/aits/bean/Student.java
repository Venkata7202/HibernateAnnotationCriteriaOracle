package com.aits.bean;
import javax.persistence.*;
@Entity(name="STUDENTAITS_TBL")
//@Table
public class Student {
	@Id
	@Column(name="roll")
	private String roll;
	@Column(name="fname",length=50,nullable=false)
	private String fname;
	@Column(name="lname",length=50,nullable=false)
	private String lname;
	@Column(name="branch",length=50,nullable=false)
	private String branch;
	@Column(name="address",length=50,nullable=false)
	private String address;
	@Column(name="dcompany",length=50,nullable=false)
	private String dcompany;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the roll
	 */
	public String getRoll() {
		return roll;
	}

	/**
	 * @param roll the roll to set
	 */
	public void setRoll(String roll) {
		this.roll = roll;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the dcompany
	 */
	public String getDcompany() {
		return dcompany;
	}

	/**
	 * @param dcompany the dcompany to set
	 */
	public void setDcompany(String dcompany) {
		this.dcompany = dcompany;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [" + (roll != null ? "roll=" + roll + ", " : "")
				+ (fname != null ? "fname=" + fname + ", " : "") + (lname != null ? "lname=" + lname + ", " : "")
				+ (branch != null ? "branch=" + branch + ", " : "")
				+ (address != null ? "address=" + address + ", " : "")
				+ (dcompany != null ? "dcompany=" + dcompany : "") + "]";
	}

	public Student(String roll, String fname, String lname, String branch, String address, String dcompany) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.branch = branch;
		this.address = address;
		this.dcompany = dcompany;
	}
	
}
