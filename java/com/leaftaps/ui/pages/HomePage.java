package com.leaftaps.ui.pages;

import java.io.IOException;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class HomePage extends ProjectSpecificMethods {
	

	public MyLeadsPage clickLeads() throws IOException {
		try {
			getPage().locator("//a[text()='Leads']").click();
			reportStep("Leads button is clicked", "pass");
		} catch (Exception e) {
			reportStep("Leads button is not clicked..."+e, "fail");
		}
		return new MyLeadsPage();
	}
	
	
}
