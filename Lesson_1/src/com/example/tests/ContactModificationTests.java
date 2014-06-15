package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	@Test
	
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactEditing(3);
		ContactDate contact = new ContactDate();
		contact.firstname = "new name! yeah!";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactModification();
		app.getContactHelper().returnToMainPage();
	}
}
