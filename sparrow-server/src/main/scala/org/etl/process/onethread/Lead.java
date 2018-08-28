package org.etl.process.onethread;

import java.io.Serializable;

public class Lead implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6636717210313067637L;
	private String email="NA";
	private String fullName="NA";
	private String profession="NA";
	private String company="NA";
	private String city="NA";
	private String mobile="NA";
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
