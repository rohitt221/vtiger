package com.eva.vtiger.pages.functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;
import com.eva.vtigers.pages.OR.LoginPageOR;

public class LoginPage extends LoginPageOR {
	public Webutil1 wu;
	public LoginPage(Webutil1 lwu) {
		super(lwu);
		wu=lwu;
		
	}
	
	
	public void  validLogin() {
wu.type(getWeUserName(), "admin", "userName");
wu.type(getWePassword(), "ro123hit", "password");
wu.click(getLoginButton());
		
	}
	
	public void invalidLogin() {
		//  login code
	}


}
