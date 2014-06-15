package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactDate;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactDate contact) {
		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.secondname);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.homePhoneNumber);
		type(By.name("mobile"), contact.mobileNumber);
		type(By.name("work"), contact.workNumber);
		type(By.name("email"), contact.mainEmail);
		type(By.name("email2"), contact.reserveEmail);
	   // selectByText(By.name("bday"), contact.birthDay); 
	  //  selectByText(By.name("bmonth"), contact.birthMonth); 
		type(By.name("byear"), contact.birthYear);
	  //  selectByText(By.name("new_group"), contact.selectedGroup); 
		type(By.name("address2"), contact.secondAddress);
		type(By.name("phone2"), contact.secondPhoneNumber);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void returnToMainPage() {
		click(By.linkText("home page"));
	}
	
	public void initContactEditing(int index) {
		click(By.xpath("(//img[@alt='Edit'])["+ index +"]"));
	}

	public void submitContactModification() {
		click(By.name("update"));
	}
	
	public void deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));

	}
}
