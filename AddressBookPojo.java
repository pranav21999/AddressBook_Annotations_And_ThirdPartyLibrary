package com.addressbook;

import com.opencsv.bean.CsvBindByName;

public class AddressBookPojo {
	
	@CsvBindByName
	public String fName;
	
	@CsvBindByName
	public String lName;
	
	@CsvBindByName
	public String address;
	
	@CsvBindByName
	public String city;
	
	@CsvBindByName
	public String state;
	
	@CsvBindByName
	public String zip;
	
	@CsvBindByName
	public String phoneNo;
	
	@CsvBindByName
	public String email;
	
	public AddressBookPojo() {
		super();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "AddressBookPojo [fName=" + fName + ", lName=" + lName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

	public AddressBookPojo(String fName, String lName, String address, String city, String state, String zip,
			String phoneNo, String email) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	
	

}
