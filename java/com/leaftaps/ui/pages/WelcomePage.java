package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class WelcomePage extends ProjectSpecificMethods {
	
	
	public HomePage clickCRMSFA() throws IOException {
		try {
			getPage().locator("//a[contains(text(),'CRM/SFA')]").click();
			reportStep("CRMSFA button is clicked", "pass");
		} catch (Exception e) {
			reportStep("CRMSFA button is not clicked..." + e, "fail");
		}
		return new HomePage();
	}
}
