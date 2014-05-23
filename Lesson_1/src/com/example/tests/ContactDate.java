package com.example.tests;

public class ContactDate {
	public String firstname;
	public String secondname;
	public String address;
	public String homePhoneNumber;
	public String mobileNumber;
	public String workNumber;
	public String mainEmail;
	public String reserveEmail;
	public String bday;
	public String bmonth;
	public String byear;
	public String selectedGroup;
	public String secondAddress;
	public String secondPhoneNumber;

	public ContactDate() {
		}
	
	public ContactDate(String firstname, String secondname, String address,
			String homePhoneNumber, String mobileNumber, String workNumber,
			String mainEmail, String reserveEmail, String bday, String bmonth,
			String byear, String selectedGroup, String secondAddress,
			String secondPhoneNumber) {
		this.firstname = firstname;
		this.secondname = secondname;
		this.address = address;
		this.homePhoneNumber = homePhoneNumber;
		this.mobileNumber = mobileNumber;
		this.workNumber = workNumber;
		this.mainEmail = mainEmail;
		this.reserveEmail = reserveEmail;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.selectedGroup = selectedGroup;
		this.secondAddress = secondAddress;
		this.secondPhoneNumber = secondPhoneNumber;
	}
}