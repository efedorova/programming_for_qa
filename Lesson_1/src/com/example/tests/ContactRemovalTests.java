package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase{
	
	@Test
	
	public void deleteSomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactEditing(3);
		app.getContactHelper().deleteContact();
		app.getContactHelper().returnToMainPage();
	}
}
