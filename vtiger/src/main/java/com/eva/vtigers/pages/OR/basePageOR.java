package com.eva.vtigers.pages.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;

public class basePageOR {
	
	public basePageOR(Webutil1 wu) {
	
		PageFactory.initElements(wu.getdriver(), this);
	}
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement searchDropDown;
	public WebElement getsearchDropDown() {
    return searchDropDown;
	}
	
	
}
