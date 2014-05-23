package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
	
  @Test(groups="test")
  public void testNonEmptyContactCreation() throws Exception {
	openMainPage();
	initContactCreation();
    ContactDate contact = new ContactDate();
    contact.firstname = "firtname";
    contact.secondname = "secondname";
    contact.address = "address";
    contact.homePhoneNumber = "123456";
    contact.mobileNumber = "234567";
    contact.workNumber = "345678";
    contact.mainEmail = "email@gmail.com";
    contact.reserveEmail = "email2@mail.com";
    contact.bday = "27";
    contact.bmonth = "3";
    contact.byear = "1990";
    contact.selectedGroup = "1";
    contact.secondAddress = "some address";
    contact.secondPhoneNumber = "something else";
    fillContactForm(contact);
	submitContactCreation();
   	returnToMainPage();
  }
  
@Test(groups="test")
  public void testEmptyContactCreation() throws Exception {
	openMainPage();
	initContactCreation();
	ContactDate contact = new ContactDate();
    contact.firstname = "";
    contact.secondname = "";
    contact.address = "";
    contact.homePhoneNumber = "";
    contact.mobileNumber = "";
    contact.workNumber = "";
    contact.mainEmail = "";
    contact.reserveEmail = "";
    contact.bday = "0";
    contact.bmonth = "0";
    contact.byear = "";
    contact.selectedGroup = "0";
    contact.secondAddress = "";
    contact.secondPhoneNumber = "";
    fillContactForm(contact);
    submitContactCreation();
    returnToMainPage();
  }
}
