package com.eva.vtiger.pages.functionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;

public class Createleadbutton {
public Webutil1 wu;
public Createleadbutton(Webutil1 Web) {
	wu=Web;
	PageFactory.initElements(wu.getdriver(), this);
}
@FindBy(xpath="//img[@title='Create Lead...']")
WebElement clicCreatekbutton;
public void creatleadfuction() {
	wu.click(clicCreatekbutton);
}
}
