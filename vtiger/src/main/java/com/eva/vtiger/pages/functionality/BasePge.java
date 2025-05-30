package com.eva.vtiger.pages.functionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;
import com.eva.vtigers.pages.OR.basePageOR;

public class BasePge extends basePageOR {
	public Webutil1 wu;
	public BasePge(Webutil1 wuobject) {
		super(wuobject);
		wu=wuobject;
		
	}
	public void clickSearchDropDown() {
		wu.click(getsearchDropDown());
	}

}
