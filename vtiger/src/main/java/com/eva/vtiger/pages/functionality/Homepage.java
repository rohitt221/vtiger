package com.eva.vtiger.pages.functionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;
import com.eva.vtigers.pages.OR.HomePageOR;

public class Homepage extends HomePageOR {
	public Webutil1 wu;
	public  Homepage(Webutil1 wuObject) {
		super(wuObject);
		wu=wuObject;
		
	}

	public void clickLeadsLink() {
	    
		wu.click(getLeadLink());
	}
	
}
