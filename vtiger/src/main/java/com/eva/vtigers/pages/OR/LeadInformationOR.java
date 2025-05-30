package com.eva.vtigers.pages.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.pages.functionality.BasePge;
import com.eva.vtiger.util.Webutil1;

public class LeadInformationOR extends BasePge {
public LeadInformationOR(Webutil1 wu) {
super(wu);
	PageFactory.initElements(wu.getdriver(), this);
}
@FindBy(xpath="//input[@name='firstname']")
private WebElement firstname;
public WebElement getfirstname() {
	return firstname;
}
@FindBy(xpath="//input[@name='lastname']")
private WebElement lastname;
public WebElement getlastname() {
	return lastname;
}
@FindBy(xpath="//input[@name='company']")
private WebElement companyname;
public WebElement getcompanyname() {
	return companyname; 
}
@FindBy(xpath="//input[@id='designation']")
private WebElement title;
public WebElement gettitle() {
	return title;
}
@FindBy(xpath="//select[@name='leadsource' ]")
private WebElement leadsource;
public WebElement getleadsource() {
	return leadsource;
}
@FindBy(xpath="//select[@name='industry']")
private WebElement industry;
public WebElement getindustry() {
	return industry;
}
@FindBy(xpath="//input[@name='annualrevenue']")
private WebElement annulrevenue;
public WebElement getannulrevenue() {
	return annulrevenue;
}
@FindBy(xpath="//input[@id='noofemployees']")
private WebElement numberofemployee;
public WebElement getNumberOfEmployee() {
	return numberofemployee;
}
@FindBy(xpath="//input[@id='secondaryemail']")
private WebElement Secondryemail;
public WebElement getSecondryEmial() {
	return Secondryemail;
}
@FindBy(xpath="//input[@id='phone']")
private WebElement phone;
public WebElement getPhone() {
	return phone;
}
@FindBy(xpath="//input[@id='mobile']")
private WebElement mobile;
public WebElement getMobile() {
	return mobile;
}
@FindBy(xpath="//input[@id='fax']")
private WebElement fax;
public WebElement getFax(){
	return fax;
}
@FindBy(xpath="//input[@id='email']")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//select[@name='leadstatus']")
private WebElement leadstatus;
public WebElement getLeadStatus() {
	return leadstatus;
}
@FindBy(xpath="//select[@name='rating']")
private WebElement rate;
public WebElement getRate() {
	return rate;
}
@FindBy(xpath="//input[@accesskey='S']")
private WebElement save;
public WebElement getSave() {
	return save;
}
}
