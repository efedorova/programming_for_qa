package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
	
  @Test(groups="test")
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().initContactCreation();
    ContactDate contact = new ContactDate();
    contact.firstname = "firtname";
    contact.secondname = "secondname";
    contact.address = "address";
    contact.homePhoneNumber = "123456";
    contact.mobileNumber = "234567";
    contact.workNumber = "345678";
    contact.mainEmail = "email@gmail.com";
    contact.reserveEmail = "email2@mail.com";
    contact.birthDay = "27";
    contact.birthMonth = "3";
    contact.birthYear = "1990";
    contact.selectedGroup = "1";
    contact.secondAddress = "some address";
    contact.secondPhoneNumber = "something else";
    app.getContactHelper().fillContactForm(contact);
	app.getContactHelper().submitContactCreation();
   	app.getContactHelper().returnToMainPage();
  }
  
@Test(groups="test")
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().initContactCreation();
	ContactDate contact = new ContactDate();
    contact.firstname = "";
    contact.secondname = "";
    contact.address = "";
    contact.homePhoneNumber = "";
    contact.mobileNumber = "";
    contact.workNumber = "";
    contact.mainEmail = "";
    contact.reserveEmail = "";
    contact.birthDay = "0";
    contact.birthMonth = "0";
    contact.birthYear = "";
    contact.selectedGroup = "0";
    contact.secondAddress = "";
    contact.secondPhoneNumber = "";
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToMainPage();
  }
}
