package com.eva.vtigers.pages.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;

public class LoginPageOR {
  public LoginPageOR(Webutil1 login) {
	  
	PageFactory.initElements(login.getdriver(),this);
  }
	@FindBy(xpath = "//input[@id='submitButton']")
	private	WebElement weLoginButton;
	public WebElement getLoginButton() {
		return weLoginButton;
	}
	public WebElement getWeUserName() {
		return weUserName;
	}
	public void setWeUserName(WebElement weUserName) {
		this.weUserName = weUserName;
	}
	public WebElement getWePassword() {
		return wePassword;
	}
	public void setWePassword(WebElement wePassword) {
		this.wePassword = wePassword;
	}
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement weUserName;
	@FindBy(xpath = "//input[@name='user_password']")
	private	WebElement wePassword;

	
}
