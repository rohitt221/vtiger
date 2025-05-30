package com.eva.vtigers.pages.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.pages.functionality.BasePge;
import com.eva.vtiger.util.Webutil1;

public class HomePageOR extends BasePge {
	public HomePageOR(Webutil1 wu) {
		 super(wu);
		PageFactory.initElements(wu.getdriver(),this);
	}
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadsLink;
	public WebElement getLeadLink() {
		return leadsLink;
	}
	
}
